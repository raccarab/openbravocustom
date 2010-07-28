//    GreenPOS is a point of sales application designed for touch screens.
//    http://code.google.com/p/openbravocustom/
//    Copyright (c) 2007 openTrends Solucions i Sistemes, S.L
//    Modified by Openbravo SL on March 22, 2007
//    These modifications are copyright Openbravo SL
//    Author/s: A. Romero
//    You may contact Openbravo SL at: http://www.openbravo.com
//
//    This file is part of GreenPOS.
//
//    GreenPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    GreenPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with GreenPOS.  If not, see <http://www.gnu.org/licenses/>.

package net.virtuemart.www.possync;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

import net.virtuemart.www.VM_Categories.Categorie;
import net.virtuemart.www.VM_Product.Produit;
import net.virtuemart.www.VM_Product.UpdateProductInput;
import net.virtuemart.www.VM_Product.VM_ProductProxy;
import net.virtuemart.www.VM_Users.User;
import net.virtuemart.www.externalsales.Product;
import net.virtuemart.www.externalsales.ProductPlus;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.ImageUtils;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.pos.customers.CustomerSync;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.ProcessAction;
import com.openbravo.pos.inventory.AttributeSetInfo;
import com.openbravo.pos.inventory.MovementReason;
import com.openbravo.pos.inventory.TaxCategoryInfo;
import com.openbravo.pos.ticket.CategoryInfo;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TaxInfo;
import net.virtuemart.www.possync.DataLogicIntegration;
import net.virtuemart.www.possync.ExternalSalesHelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ProductsSync implements ProcessAction {
        
    private DataLogicSystem dlsystem;
    private DataLogicIntegration dlintegration;
    private DataLogicSales dlsales;
    private String warehouse;
    private ExternalSalesHelper externalsales;
    
    /** Creates a new instance of ProductsSync */
    public ProductsSync(DataLogicSystem dlsystem, DataLogicIntegration dlintegration, DataLogicSales dlsales,  String warehouse) {
        this.dlsystem = dlsystem;
        this.dlintegration = dlintegration;
        this.dlsales = dlsales;
        this.warehouse = warehouse;
        externalsales = null;
    }
    
    public MessageInf execute() throws BasicException {
       
        try {
        
            if (externalsales == null) {
                externalsales = new ExternalSalesHelper(dlsystem);
            }
            String message = "";
               
           //Sync products
           int npProducts = syncProducts();
            
           if ( npProducts == 0) {
               message += AppLocal.getIntString("message.zeroproducts");               
           }
           
           if (!message.equals("")) {
               return new MessageInf(MessageInf.SGN_NOTICE, message);               
           } else {
        	   return new MessageInf(MessageInf.SGN_SUCCESS, AppLocal.getIntString("message.syncproductsok"), AppLocal.getIntString("message.syncproductsinfo", npProducts));
           }
           
        } catch (ServiceException e) {            
            throw new BasicException(AppLocal.getIntString("message.serviceexception"), e);
        } catch (RemoteException e){
            throw new BasicException(AppLocal.getIntString("message.remoteexception"), e);
        } catch (MalformedURLException e){
            throw new BasicException(AppLocal.getIntString("message.malformedurlexception"), e);
        }
    }

	private int syncProducts() throws RemoteException, BasicException {
		 
			HashMap notToSync = new HashMap();
	       
		// Sync categories.
			Categorie[] cats = externalsales.getCategories();
			
			for (Categorie categorie : cats) {	
				CategoryInfo addCategory = new CategoryInfo(categorie.getId(), categorie.getName(), null);
				try {
					dlintegration.syncCategory(addCategory);
					
				} catch (BasicException be) {
					be.printStackTrace();
					System.out.println("Skipped : "+categorie.getName());
				}
				notToSync.put(categorie.getName(),categorie.getId());
			}
		
// UPLOAD CATEGORIES NOT USED YET (should be on creation only with ID sync !)			
			SentenceList localCatsList = dlsales.getCategoriesList();
			
			List<CategoryInfo> localCats = localCatsList.list();
			
			for (CategoryInfo localCat : localCats) {
				System.out.println(" > "+localCat.getID()+" "+localCat.getName());

				if (notToSync.containsKey(localCat.getName())) {
					continue;
				}
				
				Categorie category = new Categorie();
				category.setId(localCat.getID());
				category.setName(localCat.getName());
				category.setImage("");
				category.setDescription(localCat.getName());
				category.setParentcat("");
				category.setNumberofproducts("");
				category.setProducts_per_row("1");
				category.setFullimage("");
				category.setCategory_publish("Y");
				category.setCategory_browsepage("");
				category.setCategory_flypage("");
			
				externalsales.addCategory(category);
				
			}
			
			cats = externalsales.getCategories();

			HashMap<String, String> catList = new HashMap<String, String>();
			HashMap<String, String> catListRev = new HashMap<String, String>();
			
			
			for (Categorie cat: cats) {
				Iterator<CategoryInfo> it = localCats.iterator();
				while (it.hasNext()) {
					CategoryInfo ci = it.next();
					if (ci.getName().equalsIgnoreCase(cat.getName())) {
						catList.put(ci.getID() , cat.getId());
						catListRev.put(cat.getId(), ci.getID());
						localCats.remove(ci);
						break;
					}
					
				}
				
			}
			
			HashMap<String, String> attList = new HashMap<String, String>();
			
			List<AttributeSetInfo> attributes = dlsales.getAttributeSetList().list();
			HashMap<String, String> attMap = new HashMap<String, String>();
			
			for (AttributeSetInfo attribute : attributes) {
				attList.put(attribute.getId(), attribute.getName());
				attMap.put(attribute.getName(), attribute.getId());
			}
			
			HashMap<String, String> taxCats = new HashMap<String, String>();
			HashMap<String, String> taxCatsRev = new HashMap<String, String>();
			
			Iterator<TaxCategoryInfo> taxCatList = dlsales.getTaxCategoriesList().list().iterator();
			while (taxCatList.hasNext()) {
				TaxCategoryInfo tci = (TaxCategoryInfo) taxCatList.next();
				taxCats.put(tci.getID(), tci.getName());
				taxCatsRev.put(tci.getName(),tci.getID());
				
			}
			
			HashMap<String, Double> localTaxes = new HashMap<String, Double>();
			Iterator<TaxInfo> taxList = dlsales.getTaxList().list().iterator();
			while (taxList.hasNext()) {
				TaxInfo ti = (TaxInfo) taxList.next();
				localTaxes.put(ti.getTaxCategoryID(),ti.getRate());
			}
			HashMap<Double, String> remoteTaxes = externalsales.getTaxes();
			
			
			 Produit[] products = externalsales.getProductsCatalog();

	         if (products == null) {
	             throw new BasicException(AppLocal.getIntString("message.returnnull")+" > Products null");
	         }

	         
	         if (products.length > 0){
	             
	             dlintegration.syncProductsBefore();
	             
	             for (Produit product : products) {
	            	
	                 String[] remCats = product.getProduct_categories().split("|");
	                 String remCat = null;
	                 for (String rCat : remCats) {
						if (catListRev.get(rCat)!=null) {
							remCat=catListRev.get(rCat);
							break;
						}
							
					 }

	            	 String[] pAtt = product.getCustom_attribute().split(";");
	            	 boolean isScale=false;
	            	 String attID=null;
	            	 String taxCatID="";
	            	 for (String att : pAtt) {
						AttributeSetInfo asi;
						if (att.equals("isScale")) {
							isScale = true;
						} else if (att.startsWith("Tax")) {
							taxCatID = taxCatsRev.get(att);
						} else if (attMap.get(att)!=null) {

							 attID = attMap.get(att);
						}
					}
	            	 //String taxCat = 
	    	                  
	            	 //System.out.println("* " + catListRev.get(product.getProduct_categories()));
	            	 // Synchonization of products
	             ProductInfoExt p = new ProductInfoExt();
	            	  
	                 p.setID(product.getId());
	                 p.setReference(product.getDescription());
	                 p.setCode(product.getProduct_sku());
	                 p.setName(product.getName());
	                 p.setCom(false);
	                 p.setScale(isScale);
	                 p.setPriceBuy(1.0);
	                 p.setAttributeSetID(attID);
	                 p.setPriceSell(Double.valueOf(product.getPrice()));
					 p.setCategoryID(remCat);
	                 p.setTaxCategoryID(taxCatID);
	                 p.setImage(ImageUtils.readImage(product.getImage()));
	                 dlintegration.syncProduct(p);  
	                 
	                 // Synchronization of stock          
//	                 if (product instanceof ProductPlus) {
//	                     
//	                     ProductPlus productplus = (ProductPlus) product;
//	                     
//	                     double diff = productplus.getQtyonhand() - dlsales.findProductStock(warehouse, p.getID(), null);
//	                     
//	                     Object[] diary = new Object[7];
//	                     diary[0] = UUID.randomUUID().toString();
//	                     diary[1] = now;
//	                     diary[2] = diff > 0.0 
//	                             ? MovementReason.IN_MOVEMENT.getKey()
//	                             : MovementReason.OUT_MOVEMENT.getKey();
//	                     diary[3] = warehouse;
//	                     diary[4] = p.getID();
//	                     diary[5] = new Double(diff);
//	                     diary[6] = new Double(p.getPriceBuy());                                
//	                     dlsales.getStockDiaryInsert().exec(diary);   
//	                 }
	             }
	             
//	             datalogic.syncProductsAfter();
	         }
			

				System.out.println(attMap.toString());

	         
			List<ProductInfoExt> list = dlsales.getProductList().list();
			
			for (ProductInfoExt localProduct : list) {
				
				String attribute = ""+taxCats.get(localProduct.getTaxCategoryID());
				if (attList.get(localProduct.getAttributeSetID()) != null)  
					attribute += ";"+attList.get(localProduct.getAttributeSetID());
			
				String remoteTaxid = remoteTaxes.get(localTaxes.get(localProduct.getTaxCategoryID()));
	
				if (localProduct.isScale()) {
					attribute += ";isScale";
				}
				
				Produit produit = new Produit();
				
				localProduct.getCategoryID();
				
				produit.setId(localProduct.getID());
				produit.setName(localProduct.getName());
				produit.setProduct_sku(localProduct.getCode());
				produit.setAtribute("");	
				produit.setAtribute_value("");
				produit.setBigdescription("");
				produit.setChild_option_ids("");
				produit.setChild_options("");
				produit.setCustom_attribute(attribute);
				produit.setDescription(localProduct.getReference());
				produit.setDiscount("");
				produit.setDiscount_is_percent("");
				produit.setFullimage("");
				produit.setHas_childs("");
				produit.setChilds_id("");
				produit.setImage("");
				produit.setParent_produit_id("");
				produit.setPrice(String.valueOf(localProduct.getPriceSell()));
				produit.setProduct_availability("");
				produit.setProduct_available_date("");
				produit.setProduct_categories(catList.get(localProduct.getCategoryID()));
				produit.setProduct_currency("EUR");
				produit.setProduct_discount_id("");
				produit.setProduct_height("");
				produit.setProduct_length("");
				produit.setProduct_lwh_uom("");
				produit.setProduct_order_levels("");
				produit.setProduct_packaging("");
				produit.setProduct_publish("Y");
				produit.setProduct_sales("");
				produit.setProduct_special("");
				produit.setProduct_tax_id(remoteTaxid);
				produit.setProduct_unit("");
				produit.setProduct_url("");
				produit.setProduct_weight("");
				produit.setProduct_weight_uom("");
				produit.setProduct_width("");
				produit.setQuantity("");
				produit.setQuantity_options("");
				produit.setManufacturer_id("");
				produit.setVendor_id("1");
//				
				try {
				externalsales.addProduct(produit);
				} catch (RemoteException e) {
//					externalsales.updateProduct(produit);
				}
//				System.out.println(produit.getCustom_attribute());
				
			}
			
         return products.length;

	}   
}
