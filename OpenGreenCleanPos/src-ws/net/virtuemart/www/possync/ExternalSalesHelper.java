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
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import javax.xml.rpc.ServiceException;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.util.AltEncrypter;
import com.openbravo.pos.util.Base64Encoder;

import java.util.logging.Logger;
import net.virtuemart.www.VM_Categories.AddCategoryInput;
import net.virtuemart.www.VM_Categories.Categorie;
import net.virtuemart.www.VM_Categories.GetAllCategoriesInput;
import net.virtuemart.www.VM_Categories.VM_CategoriesProxy;
import net.virtuemart.www.VM_Order.AddCouponInput;
import net.virtuemart.www.VM_Order.AddStatusInput;
import net.virtuemart.www.VM_Order.AllOrderRequest;
import net.virtuemart.www.VM_Order.Coupon;
import net.virtuemart.www.VM_Order.CreateOrderInput;
import net.virtuemart.www.VM_Order.DelInput;
import net.virtuemart.www.VM_Order.OrderStatus;
import net.virtuemart.www.VM_Order.VM_OrderProxy;
import net.virtuemart.www.VM_Product.GetAllProductsInput;
import net.virtuemart.www.VM_Product.Produit;
import net.virtuemart.www.VM_Product.Tax;
import net.virtuemart.www.VM_Product.UpdateProductInput;
import net.virtuemart.www.VM_Product.VM_ProductProxy;
import net.virtuemart.www.VM_Tools.LoginInfo;
import net.virtuemart.www.VM_Users.AddUserInput;
import net.virtuemart.www.VM_Users.GetUsersInput;
import net.virtuemart.www.VM_Users.User;
import net.virtuemart.www.VM_Users.VM_UsersProxy;

public class ExternalSalesHelper {
    
    private static final String country = "BEL";
    
    private String wsPosid;
    private LoginInfo wsLogin;
    private String wsURL;

    private String vm_path = "/administrator/components/com_vm_soa/services/VM_";
    private String vm_path_end = "Service.php";

    private String CategoriesURL = vm_path+"Categories"+vm_path_end;
    private String ProductURL = vm_path+"Product"+vm_path_end;
    private String UsersURL = vm_path+"Users"+vm_path_end;
    private String OrderURL = vm_path+"Orders"+vm_path_end;
    private final String max = "1000000000000000";

    private VM_CategoriesProxy categoriesProxy;
    private VM_UsersProxy usersProxy;
    private VM_ProductProxy productProxy;
    private VM_OrderProxy orderProxy;
    
    private static Logger logger = Logger.getLogger("com.openbravo.data.loader.PreparedSentence");
    
    /** Creates a new instance of WebServiceHelper */
    /**
     * @param dlsystem
     * @throws BasicException
     * @throws ServiceException
     * @throws MalformedURLException
     */
    public ExternalSalesHelper(DataLogicSystem dlsystem) throws BasicException, ServiceException, MalformedURLException {
        
        AppConfig config = new AppConfig();
        config.load();

        wsLogin= new LoginInfo();
        // set WS.
        wsURL = config.getProperty("ws.URL");
        wsPosid = config.getProperty("ws.posid");

        String user = config.getProperty("ws.user");
        wsLogin.setLogin(user);
        AltEncrypter cypher = new AltEncrypter("cypherkey" + user);             
        String password = cypher.decrypt(config.getProperty("ws.password").substring(6));
        wsLogin.setPassword(password);
        
        if (wsPosid==null || wsPosid.equals(""))
        {
            throw new BasicException(AppLocal.getIntString("message.propsnotdefined"));            
        } else {

              if ( wsURL.equals("") || wsURL == null) {
                throw new BasicException(AppLocal.getIntString("message.urlnotdefined"));
            } else {



            }
        }
		categoriesProxy = new VM_CategoriesProxy(wsURL+CategoriesURL);
		orderProxy = new VM_OrderProxy(wsURL+OrderURL);
		usersProxy = new VM_UsersProxy(wsURL+UsersURL);
		productProxy = new VM_ProductProxy(wsURL+ProductURL);
		
    }

    public String getWsPosid() {
		return wsPosid;
	}

	private VM_CategoriesProxy getCategoriesProxy() throws RemoteException {
        return categoriesProxy;
    }
    
    private VM_UsersProxy getUsersProxy() throws RemoteException {
        return usersProxy; 
    }

    private VM_ProductProxy getProductProxy() throws RemoteException {
        return productProxy;
    }

    private VM_OrderProxy getOrderProxy() throws RemoteException {
        return orderProxy;
    }
   
/**
 * PUBLIC
 * @param produit
 * @throws RemoteException
 */
    public void addProduct(Produit produit) throws RemoteException {

		UpdateProductInput parameter = new UpdateProductInput(wsLogin, produit);
   		getProductProxy().addProduct(parameter);
    	
    }
    
    public User[] getUsers() throws RemoteException {
            GetUsersInput userInput = new GetUsersInput(wsLogin,"0",max);
           
            return usersProxy.getUsers(userInput);
    }
    
    public boolean addUser(User user) {
    	AddUserInput parameters = new AddUserInput(wsLogin, user);
    	try {
			getUsersProxy().addUser(parameters);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
    }
    
	public Categorie[] getCategories() throws RemoteException  {
		VM_CategoriesProxy proxy = getCategoriesProxy();
		GetAllCategoriesInput gaci = new GetAllCategoriesInput(wsLogin,"Y");
		return proxy.getAllCategories(gaci);
	}  

	public void addCategory(Categorie category) throws RemoteException {
	
		AddCategoryInput parameters = new AddCategoryInput(wsLogin,category);
		getCategoriesProxy().addCategory(parameters);
		
	} 
    
	public HashMap<Double, String> getTaxes() throws RemoteException{
	    HashMap< Double, String> hash = new HashMap<Double, String>();
		Tax[] taxes = getProductProxy().getAllTax(wsLogin);
		for (Tax tax : taxes) {
			if (tax.getTax_country().equals(country))
				hash.put(Double.valueOf(tax.getTax_rate()),tax.getTax_rate_id());
		}
		return hash;
	}
	
    public Produit[] getProductsCatalog() throws RemoteException {
        Produit[] produits = null;
        try {
            VM_ProductProxy proxy = getProductProxy();
            
            GetAllProductsInput gapi = new GetAllProductsInput();
            gapi.setLoginInfo(wsLogin);
            gapi.setProduct_publish("Y");
            gapi.setLimite_end("");
            gapi.setLimite_start("");
            gapi.setWith_childs("false");
            
            produits = proxy.getAllProducts(gapi);
//            System.out.println("**"+produits.length);
           
         } catch (RemoteException e) {
            System.out.println("Error getProductsCatalog : ");
            e.printStackTrace();
         }
        return produits;
    }
    
    public boolean uploadOrders(CreateOrderInput orderstoupload) throws RemoteException {
    	
    	try {
    			orderstoupload.setLoginInfo(wsLogin);
    			orderstoupload.setCustomer_note(orderstoupload.getCustomer_note()+"> POS : "+wsPosid);
    			orderstoupload.setVendor_id(wsPosid);
    		
    			orderProxy.createOrder(orderstoupload);
    			
    		} catch (IOException ioe) {
    			System.out.println(" Error : "+orderstoupload.getUser_id()+" - "+orderstoupload.getCustomer_note());
    			return false;
    		}

    	
    	return true;
    }
       
    private static String getPasswordHash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte raw[] = md.digest(password.getBytes("UTF-8"));
            return Base64Encoder.encode(raw);
        } catch (NoSuchAlgorithmException e) {
            return null; // never happens :-)
        } catch (UnsupportedEncodingException e) {
            return null; // never happens :-)
        }
    }

//	public String createCoupon(Double value, String order) {
//		String uniqueID = order+"-"+wsPosid;
//		Coupon coupon = new Coupon("1", uniqueID, "total", "permanent", String.valueOf(value));
//		
//		Coupon[] coupons = new Coupon[1];
//		coupons[0]=coupon;
//		AddCouponInput aci = new AddCouponInput(wsLogin, coupons);
//
//        try {
//			orderProxy.addCouponCode(aci);
//			Coupon[] cpList = orderProxy.getAllCouponCode(wsLogin);
//			for (Coupon cp : cpList) {
//				if (cp.getCoupon_code().equals(uniqueID))
//					return cp.getCoupon_id();
//			}
//			
//		} catch (RemoteException e1) {
//			
//		}
//		return null;
//	}
  
}
