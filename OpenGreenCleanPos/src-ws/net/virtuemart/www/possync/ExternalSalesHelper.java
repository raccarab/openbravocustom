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

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JDialog;
import javax.xml.rpc.ServiceException;

import net.virtuemart.www.customers.Customer;
import net.virtuemart.www.customers.WebServiceImpl;
import net.virtuemart.www.customers.WebServiceImplServiceLocator;
import net.virtuemart.www.externalsales.ExternalSalesImpl;
import net.virtuemart.www.externalsales.ExternalSalesImplServiceLocator;
import net.virtuemart.www.externalsales.Order;
import net.virtuemart.www.externalsales.Product;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.util.AltEncrypter;
import com.openbravo.pos.util.Base64Encoder;
import java.util.logging.Logger;
import net.virtuemart.www.externalsales.Tax;
import net.virtuemart.www.VM_Categories.VM_CategoriesProxy;
import net.virtuemart.www.VM_Order.VM_OrderProxy;
import net.virtuemart.www.VM_Product.GetAllProductsInput;
import net.virtuemart.www.VM_Product.Produit;
import net.virtuemart.www.VM_Product.VM_ProductProxy;
import net.virtuemart.www.VM_Tools.LoginInfo;
import net.virtuemart.www.VM_Users.AddUserInput;
import net.virtuemart.www.VM_Users.User;
import net.virtuemart.www.VM_Users.VM_UsersProxy;
import net.virtuemart.www.customers.Contact;
import net.virtuemart.www.customers.Location;
import net.virtuemart.www.externalsales.Category;

public class ExternalSalesHelper {
    
    private ExternalSalesImpl externalSales;
    private WebServiceImpl externalCustomers;
    
    private String wsPosid;
    private LoginInfo wsLogin;
    private String wsURL;

    private String vm_path = "/administrator/components/com_vm_soa/services/VM_";
    private String vm_path_end = "Service.php";

    private String CategoriesURL = vm_path+"Categories"+vm_path_end;
    private String ProductURL = vm_path+"Product"+vm_path_end;
    private String UsersURL = vm_path+"Users"+vm_path_end;
    private String OrderURL = vm_path+"Orders"+vm_path_end;

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
    }

    public String getWsPosid() {
		return wsPosid;
	}

	public LoginInfo getWsLogin() {
		return wsLogin;
	}

	public String getWsURL() {
		return wsURL;
	}

	public String getCategoriesURL() {
		return CategoriesURL;
	}

	public String getProductURL() {
		return ProductURL;
	}

	public String getUsersURL() {
		return UsersURL;
	}

	public String getOrderURL() {
		return OrderURL;
	}

	private VM_CategoriesProxy getCategoriesProxy() throws RemoteException {
        return new VM_CategoriesProxy(wsURL+CategoriesURL);
    }
    
    private VM_UsersProxy getUsersProxy() throws RemoteException {
        return new VM_UsersProxy(wsURL+UsersURL);
    }

    private VM_ProductProxy getProductProxy() throws RemoteException {
        return new VM_ProductProxy(wsURL+ProductURL);
    }

    private VM_OrderProxy getOrderProxy() throws RemoteException {
        return new VM_OrderProxy(wsURL+OrderURL);
    }
    
    public Customer[] getCustomers() throws RemoteException {
        Customer[] customers = null;
        try {
            VM_UsersProxy proxy = getUsersProxy();

            User[] users = proxy.getUsers(wsLogin);
            
            customers = new Customer[users.length];
            
            int i=0;

            Contact[] contact = null;
            Location[] location= null;
            
            for (User user : users) {
                customers[i] = new Customer(user.getId(),
                                            Boolean.TRUE,
                                            contact ,
                                            Boolean.TRUE,
                                            user.getDescription(),
                                            user.getId(),
                                            location,
                                            user.getFirstname()+" "+user.getLastname(),
                                            user.getId(),
                                            Boolean.TRUE);
                i++;
            }
         } catch (RemoteException e) {
        	 System.out.println("Error getCustomers : ");
             e.printStackTrace();
         }
        return customers;
    }
    
    public boolean addCustomer(User user) {
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
    
    public Product[] getProductsCatalog() throws RemoteException {
        Product[] products = null;
        try {
            VM_ProductProxy proxy = getProductProxy();

            GetAllProductsInput gapi = new GetAllProductsInput();
            gapi.setLoginInfo(wsLogin);
            gapi.setProduct_publish("true");
            gapi.setLimite_end("");
            gapi.setLimite_start("");
            gapi.setWith_childs("false");
            
            Produit[] produits = proxy.getAllProducts(gapi);
            products = new Product[produits.length];
            
            int i=0;

            for (Produit produit : produits) {

                products[i] = new Product(new Category("POS","3","POS"), 
                                            produit.getDescription(),
                                            produit.getId(),
                                            produit.getId(),
                                            produit.getImage(),
                                            Double.parseDouble(produit.getPrice()),
                                            produit.getName(),
                                            produit.getQuantity(),
                                            Double.parseDouble(produit.getPrice()),
                                            new Tax());
                i++;
            }
         } catch (RemoteException e) {
            System.out.println("Error getProductsCatalog : ");
            e.printStackTrace();
         }
        return products;
    }
    
    public boolean uploadOrders(Order[] orderstoupload) throws RemoteException {
       // return externalSales.uploadOrders(m_iERPId, m_iERPOrg, m_iERPPos, orderstoupload, m_sERPUser, m_sERPPassword);
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
}
