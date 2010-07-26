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
           
           //Sync customers
           int npCustomers = syncCustomers();
                 
           if ( npCustomers == 0 ) {
        	   message += AppLocal.getIntString("message.zerocustomers");        
           }
           
           if (!message.equals("")) {
               return new MessageInf(MessageInf.SGN_NOTICE, message);               
           } else {
        	   return new MessageInf(MessageInf.SGN_SUCCESS, AppLocal.getIntString("message.syncproductsok"), AppLocal.getIntString("message.syncproductsinfo", npProducts, npCustomers));
           }
           
        } catch (ServiceException e) {            
            throw new BasicException(AppLocal.getIntString("message.serviceexception"), e);
        } catch (RemoteException e){
            throw new BasicException(AppLocal.getIntString("message.remoteexception"), e);
        } catch (MalformedURLException e){
            throw new BasicException(AppLocal.getIntString("message.malformedurlexception"), e);
        }
    }

	@SuppressWarnings("unchecked")
	private int syncCustomers() throws RemoteException, BasicException {
		
		ArrayList<String> notToSync = new ArrayList<String>();
        
		// retrieve users from VM
		User[] remoteUsers = externalsales.getUsers();

        if (remoteUsers == null){
            throw new BasicException(AppLocal.getIntString("message.returnnull")+" > Customers null");
        }
        
        // if it found users
        if (remoteUsers.length > 0 ) {
            
        	// hide all users in local DB
            dlintegration. syncCustomersBefore();
            
            //loop on all users 
            for (User remoteUser : remoteUsers) {                    
                CustomerSync copyCustomer = new CustomerSync(remoteUser.getId());
                
                copyCustomer.setTaxid(remoteUser.getLogin());
                
                copyCustomer.setSearchkey(remoteUser.getLogin());
                copyCustomer.setName(remoteUser.getLastname());          
                copyCustomer.setNotes(remoteUser.getDescription());
                
                if (copyCustomer.getEmail()==null || copyCustomer.getEmail().trim().equals("") || copyCustomer.getEmail().indexOf('@')==-1)
                	copyCustomer.setEmail(remoteUser.getLogin()+"@beyours.be");
                else 
                	copyCustomer.setEmail(remoteUser.getEmail());
                
                copyCustomer.setAddress(remoteUser.getAddress());
                copyCustomer.setAddress2(remoteUser.getAddress2());
                copyCustomer.setCity(remoteUser.getCity());
                copyCustomer.setCountry(remoteUser.getCountry());
                copyCustomer.setFirstname(remoteUser.getFirstname());
                copyCustomer.setLastname(remoteUser.getLastname());
                copyCustomer.setMaxdebt(1000.0);
                copyCustomer.setName(remoteUser.getFirstname()+" "+remoteUser.getLastname());
                copyCustomer.setPhone(remoteUser.getPhone());
                copyCustomer.setPhone2(remoteUser.getMobile());
                copyCustomer.setPostal(remoteUser.getZipcode());
                
                //Updates local user
                dlintegration.syncCustomer(copyCustomer);

                notToSync.add(copyCustomer.getTaxid());
            }
        }
        
        List<CustomerSync> localList = dlintegration.getCustomers();
        
        System.out.println(" >> "+localList.size()+ "  " + notToSync);
		
        for (CustomerSync localCustomer : localList) {
//        	System.out.println(localCustomer.getTaxid());
        	if (notToSync.contains(localCustomer.getTaxid())) {
        		continue;
        	}
            User userAdd = new User();
			userAdd.setLogin(localCustomer.getTaxid());
			userAdd.setId(localCustomer.getTaxid());
			userAdd.setFirstname(" ");
			userAdd.setLastname(localCustomer.getName());
			userAdd.setPassword("407b3273beea2c061dbe7fc11b68de43");
			userAdd.setTitle("Mr");
			if (localCustomer.getEmail()==null || localCustomer.getEmail().trim().equals("") || localCustomer.getEmail().indexOf('@')==-1)
				userAdd.setEmail(localCustomer.getTaxid()+"@beyours.be");
			else
				userAdd.setEmail(""+localCustomer.getEmail());
			userAdd.setDescription(" "+localCustomer.getNotes());
			userAdd.setAddress(" "+localCustomer.getAddress());
			userAdd.setAddress2(" "+localCustomer.getAddress2());

			userAdd.setState_region(" "+localCustomer.getRegion());
			userAdd.setCity(" "+localCustomer.getCity());
			userAdd.setCountry(" "+localCustomer.getCountry());
			userAdd.setZipcode(" "+localCustomer.getPostal());
			userAdd.setPhone(" "+localCustomer.getPhone());
			userAdd.setMobile(" "+localCustomer.getPhone2());
			userAdd.setFax(" ");
			userAdd.setCdate("");
		
			externalsales.addUser(userAdd);
			
		}
        
        return remoteUsers.length;
        
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
					System.out.println("Not synced : "+categorie.getName());
				}
				notToSync.put(categorie.getName(),categorie.getId());
			}
		
// UPLOAD CATEGORIES NOT USED YET (should be on creation only with ID sync !)			
			SentenceList localCatsList = dlsales.getCategoriesList();
			
			List<CategoryInfo> localCats = localCatsList.list();
			
			for (CategoryInfo localCat : localCats) {
//				System.out.println(" > "+localCat.getID()+" "+localCat.getName());

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
			
//			catList.put("fa938625-e34c-47a9-9343-55f652dab62e", "1");
//			catList.put("997278bb-44ae-4229-b4b5-5116e2d24c7c", "2");
//			catList.put("000", "3");
//			catList.put("682b8858-da35-4804-8827-5d061e34f48b", "4");
//			catList.put("d34dff82-2c8a-476a-8f17-22da5cc88c98", "5");
//			catList.put("6d24b412-05e9-447d-a7ed-5361e605ccf0", "6");
//			catList.put("6c98cbc9-739e-44c6-890b-47e365838663", "7");
//			catList.put("9b2f487b-8630-4ad3-b0c3-8fbb50b24fc3", "8");
//			catList.put("0746a37d-712e-4fa0-b3e7-4062b3623390", "9");
//			catList.put("f827989a-c457-4664-88d5-d0c4ce27bb86", "10");
//			catList.put("1c48ea28-b7c0-4051-b731-b3e2cbf85292", "11");

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
	             
	             Date now = new Date();
	             
	             System.out.println(catListRev.toString());
	             
	             for (Produit product : products) {
	            	
	                 String[] remCats = product.getProduct_categories().split("|");
	                 String remCat = null;
	                 for (String rCat : remCats) {
						if (catListRev.get(rCat)!=null) {
							remCat=catListRev.get(rCat);
							break;
						}
							
					 }
	                 
	            	 System.out.println("> "+product.toString());

	            	 String[] pAtt = product.getCustom_attribute().split(";");
	            	 boolean isScale=false;
	            	 String attID="";
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
