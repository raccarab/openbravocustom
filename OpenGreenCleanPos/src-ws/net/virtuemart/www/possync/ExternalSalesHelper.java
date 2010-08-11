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
import java.nio.charset.CharacterCodingException;
import java.util.logging.Level;
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
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

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
import net.virtuemart.www.VM_SQLQueries.SQLRequest;
import net.virtuemart.www.VM_SQLQueries.SQLUpdateRequest;
import net.virtuemart.www.VM_SQLQueries.VM_SQLQueriesProxy;
import net.virtuemart.www.VM_Tools.LoginInfo;
import net.virtuemart.www.VM_Users.AddUserInput;
import net.virtuemart.www.VM_Users.AddVendorInput;
import net.virtuemart.www.VM_Users.GetUsersInput;
import net.virtuemart.www.VM_Users.User;
import net.virtuemart.www.VM_Users.VM_UsersProxy;
import net.virtuemart.www.VM_Users.Vendor;

public class ExternalSalesHelper {

    private static final String country = "BEL";
    private String wsPosid;
    private LoginInfo wsLogin;
    private String wsURL;
    private String hostname;
    private String vm_path = "/administrator/components/com_vm_soa/services/VM_";
    private String vm_path_end = "Service.php";
    private String CategoriesURL = vm_path + "Categories" + vm_path_end;
    private String ProductURL = vm_path + "Product" + vm_path_end;
    private String UsersURL = vm_path + "Users" + vm_path_end;
    private String OrderURL = vm_path + "Orders" + vm_path_end;
    private String QueriesURL = vm_path + "SQLQueries" + vm_path_end;
    private VM_CategoriesProxy categoriesProxy;
    private VM_UsersProxy usersProxy;
    private VM_ProductProxy productProxy;
    private VM_OrderProxy orderProxy;
    private VM_SQLQueriesProxy queriesProxy;
    private AppConfig config;
    private static Logger logger = Logger.getLogger("com.openbravo.data.loader.PreparedSentence");
    private  CharsetEncoder encoderUTF;
    private  CharsetEncoder encoderISO;

    /** Creates a new instance of WebServiceHelper */
    /**
     * @param dlsystem
     * @throws BasicException
     * @throws ServiceException
     * @throws MalformedURLException
     */
    public ExternalSalesHelper(DataLogicSystem dlsystem) throws BasicException, ServiceException, MalformedURLException {


        Charset charsetUTF = Charset.forName("UTF-8");
        Charset charsetISO = Charset.forName("ISO-8859-1");
//     CharsetDecoder decoder = charsetISO.newDecoder();
        encoderUTF = charsetUTF.newEncoder();
        encoderISO = charsetISO.newEncoder();

        config = new AppConfig();
        config.load();

        wsLogin = new LoginInfo();
        // set WS.
        wsURL = config.getProperty("ws.URL");
        wsPosid = config.getProperty("ws.posid");
        hostname = config.getProperty("machine.hostname");

        String user = config.getProperty("ws.user");
        wsLogin.setLogin(user);
        AltEncrypter cypher = new AltEncrypter("cypherkey" + user);
        try {
            String password = cypher.decrypt(config.getProperty("ws.password").substring(6));
            wsLogin.setPassword(password);
        } catch (NullPointerException npe) {
            throw new BasicException(AppLocal.getIntString("message.propsnotdefined"));
        }

        if (wsPosid == null || wsPosid.equals("")) {
            throw new BasicException(AppLocal.getIntString("message.propsnotdefined"));
        } else {

            if (wsURL.equals("") || wsURL == null) {
                throw new BasicException(AppLocal.getIntString("message.urlnotdefined"));
            } else {
            }
        }
        categoriesProxy = new VM_CategoriesProxy(wsURL + CategoriesURL);
        orderProxy = new VM_OrderProxy(wsURL + OrderURL);
        usersProxy = new VM_UsersProxy(wsURL + UsersURL);
        productProxy = new VM_ProductProxy(wsURL + ProductURL);
        queriesProxy = new VM_SQLQueriesProxy(wsURL + QueriesURL);

    }

    public String getWsURL() {
        return wsURL;
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

    public CharsetEncoder getEncoder() {
        return encoderUTF;
    }

    public String encodeString (String toEncode) {
        try {
            return new String(encoderUTF.encode(CharBuffer.wrap(toEncode.toCharArray())).array());
        } catch (CharacterCodingException ex) {
            return toEncode;
        }
    }

    public String encodeStringISO (String toEncode) {
        try {
            return new String(encoderISO.encode(CharBuffer.wrap(toEncode.toCharArray())).array());
        } catch (CharacterCodingException ex) {
            return toEncode;
        }
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
        GetUsersInput userInput = new GetUsersInput(wsLogin, "0", "1000000000000000000");
        return usersProxy.getUsers(userInput);
    }

    // TO AVOID JAVA HEAP
    public User[] getUsersBySteps(int step) throws RemoteException {
        int bystep = 500;

        String start = String.valueOf(step * bystep);
        int fin = (step * bystep) + (bystep);
        String end = String.valueOf(fin);

        GetUsersInput userInput = new GetUsersInput(wsLogin, start, end);

        System.out.println(" " + start + " " + end+ " > "+usersProxy.getUsers(userInput).length);
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
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Categorie[] getCategories() throws RemoteException {
        VM_CategoriesProxy proxy = getCategoriesProxy();
        GetAllCategoriesInput gaci = new GetAllCategoriesInput(wsLogin, "Y");
        return proxy.getAllCategories(gaci);
    }

    public void addCategory(Categorie category) throws RemoteException {

        AddCategoryInput parameters = new AddCategoryInput(wsLogin, category);
        getCategoriesProxy().addCategory(parameters);

    }

    public HashMap<Double, String> getTaxes() throws RemoteException {
        HashMap<Double, String> hash = new HashMap<Double, String>();
        Tax[] taxes = getProductProxy().getAllTax(wsLogin);
        for (Tax tax : taxes) {
            if (tax.getTax_country().equals(country)) {
                hash.put(Double.valueOf(tax.getTax_rate()), tax.getTax_rate_id());
            }
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

    public void checkPosID() throws RemoteException {


        Vendor[] vendors = usersProxy.getAllVendor(wsLogin);
        for (Vendor vendor : vendors) {
            if (vendor.getVendor_id() == wsPosid) {
                if (!vendor.getVendor_name().equals(hostname)) {
                    throw new RemoteException("Wrong vendor name !!");
                } else {
                    return;
                }
            } else if (vendor.getVendor_name().equals(hostname)) {
                if (!vendor.getVendor_id().equals(wsPosid)) {
                    throw new RemoteException("Wrong vendor ID, change your POS ID to " + vendor.getVendor_id());
                } else {
                    return;
                }
            }
        }

        String contact_title = "M";
        String contact_first_name = "null";
        String vendor_store_name = hostname;
        String vendor_min_pov = "";
        String vendor_city = "";
        String vendor_address_1 = "";
        String vendor_freeshipping = "";
        String vendor_state = "";
        String vendor_full_image = "";
        String cdate = "";
        String vendor_country = "";
        String contact_phone_2 = "";
        String contact_fax = "";
        String contact_email = "POS" + wsPosid + "@beyours.be";
        String vendor_zip = "";
        String vendor_url = "";
        String contact_middle_name = "";
        String vendor_store_desc = "";
        String vendor_thumb_image = "";
        String vendor_accepted_currencies = "";
        String vendor_currency = "";
        String vendor_category_id = "";
        String contact_phone_1 = "";
        String vendor_phone = "";
        String contact_last_name = "";
        String vendor_date_format = "";
        String vendor_address_format = "";
        String mdate = "";
        String vendor_terms_of_service = "";
        String vendor_image_path = "";
        String vendor_address_2 = "";
        String vendor_currency_display_style = "";
        Vendor vendor = new Vendor(wsPosid, hostname, contact_last_name, contact_first_name, contact_middle_name, contact_title, contact_phone_1, contact_phone_2, contact_fax, contact_email, vendor_phone, vendor_address_1, vendor_address_2, vendor_city, vendor_state, vendor_country, vendor_zip, vendor_store_name, vendor_store_desc, vendor_category_id, vendor_thumb_image, vendor_full_image, vendor_currency, cdate, mdate, vendor_image_path, vendor_terms_of_service, vendor_url, vendor_min_pov, vendor_freeshipping, vendor_currency_display_style, vendor_accepted_currencies, vendor_address_format, vendor_date_format);
        AddVendorInput parameters = new AddVendorInput(wsLogin, vendor);
        usersProxy.addVendor(parameters);

        vendors = usersProxy.getAllVendor(wsLogin);

        for (Vendor v : vendors) {
            if (v.getVendor_name().equals(hostname)) {

                this.wsPosid = v.getVendor_id();
                config.setProperty("ws.posid", wsPosid);

            }
        }
    }

    public boolean uploadOrders(CreateOrderInput orderstoupload) throws RemoteException {

        try {
            orderstoupload.setLoginInfo(wsLogin);
          
            orderProxy.createOrder(orderstoupload);

        } catch (IOException ioe) {
            System.out.println(" Error : " + orderstoupload.getUser_id() + " - " + orderstoupload.getCustomer_note());
            return false;
        }


        return true;
    }

    public boolean updateStatus(String note) throws RemoteException {

        String query = "UPDATE #__{vm}_orders SET order_status = 'C' WHERE customer_note LIKE '"+note+"' ;";
        SQLRequest sqlr = new SQLRequest(wsLogin,query);
        System.out.println(query);
//        wsLogin, "vm_orders", "customer_note LIKE '"+note+"'", "order_status", "C"
//        SQLUpdateRequest sqlr = new SQLUpdateRequest();
//        sqlr.setLoginInfo(wsLogin);
//        sqlr.setTable("#__{vm}_orders");
//        sqlr.setWhereClause("WHERE customer_note LIKE '"+note+"'");
//
//        String[] cols = { "order_status" };
//        sqlr.setColumns(cols);
//
//        String[] vals = { "C" };
//        sqlr.setValues(vals);

        try {
//            queriesProxy.executeSQLUpdateQuery(sqlr);
            queriesProxy.executeSQLQuery(sqlr);
        } catch (IOException ioe) {
            ioe.printStackTrace();
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
