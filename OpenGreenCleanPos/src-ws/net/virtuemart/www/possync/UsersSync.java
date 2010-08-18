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
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
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

public class UsersSync implements ProcessAction {
        
    private DataLogicSystem dlsystem;
    private DataLogicIntegration dlintegration;
    private DataLogicSales dlsales;
    private String warehouse;
    private ExternalSalesHelper externalsales;
    
    /** Creates a new instance of ProductsSync */
    public UsersSync(DataLogicSystem dlsystem, DataLogicIntegration dlintegration, DataLogicSales dlsales,  String warehouse) {
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

            try {
                // CHECK POS ID
                externalsales.checkPosID();
            } catch (RemoteException re) {
                try {
                    externalsales.checkPosID();
                } catch (RemoteException re1) {
                    return new MessageInf(MessageInf.SGN_WARNING, "Error while checking pos id ", re.toString());
                }
            }

            String message = "";
               
           //Sync customers
           int npCustomers = syncCustomers();
                 
           if ( npCustomers == 0 ) {
        	   message += AppLocal.getIntString("message.zerocustomers");        
           }
           
           if (!message.equals("")) {
               return new MessageInf(MessageInf.SGN_NOTICE, message);               
           } else {
        	   return new MessageInf(MessageInf.SGN_SUCCESS, AppLocal.getIntString("message.syncusersok"), AppLocal.getIntString("message.syncusersinfo", npCustomers));
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
            int step=0;
            User[] remoteUsers;
            int cpt=0;

            do {
                // retrieve users from VM
                remoteUsers = externalsales.getUsersBySteps(step);
                step++;
			
	        if (remoteUsers == null){
	            throw new BasicException(AppLocal.getIntString("message.returnnull")+" > Customers null");
	        }
	        
	        // if it found users
	        if (remoteUsers.length > 0 ) {
	            
	        	// hide all users in local DB
	            dlintegration. syncCustomersBefore();
	            
	            //loop on all users 
	            for (User remoteUser : remoteUsers) {
                        if (notToSync.contains(remoteUser.getLogin()))
                            continue;
                        cpt++;
                        
	            	String name = externalsales.encodeStringISO((remoteUser.getFirstname()+remoteUser.getLastname()).trim());
	            	String firstname = externalsales.encodeStringISO(remoteUser.getFirstname());
	            	String lastname = externalsales.encodeStringISO(remoteUser.getLastname());
	            	String description = externalsales.encodeStringISO(remoteUser.getDescription());
	            	String address = externalsales.encodeStringISO(remoteUser.getAddress());
	            	String address2 = externalsales.encodeStringISO(remoteUser.getAddress2());
	            	String city = externalsales.encodeStringISO(remoteUser.getCity());
	            	String country = externalsales.encodeStringISO(remoteUser.getCountry());
                        String phone = externalsales.encodeStringISO(remoteUser.getPhone());
                        String mobile = externalsales.encodeStringISO(remoteUser.getMobile());
	            	String zipcode = externalsales.encodeStringISO(remoteUser.getZipcode());
                        CharsetEncoder encoder = externalsales.getEncoder();
//	            	try {
//                                name = new String (encoder.encode(CharBuffer.wrap(name.toCharArray())).array());
//                                firstname = new String (encoder.encode(CharBuffer.wrap(firstname.toCharArray())).array());
//                                lastname = new String (encoder.encode(CharBuffer.wrap(lastname.toCharArray())).array());
//                                description = new String (encoder.encode(CharBuffer.wrap(description.toCharArray())).array());
//                                address = new String (encoder.encode(CharBuffer.wrap(address.toCharArray())).array());
//                                address2 = new String (encoder.encode(CharBuffer.wrap(address2.toCharArray())).array());
//                                city = new String (encoder.encode(CharBuffer.wrap(city.toCharArray())).array());
//                                country = new String (encoder.encode(CharBuffer.wrap(country.toCharArray())).array());
//                        } catch (CharacterCodingException e) {
//                                // TODO Auto-generated catch block
//                                e.printStackTrace();
//                        }
	            	
	            	CustomerSync copyCustomer = new CustomerSync(remoteUser.getId());

                        if (firstname==null || firstname.equals(""))
                            firstname =" ";
                        copyCustomer.setFirstname(firstname);

	            	if (lastname==null || lastname.equals(""))
                            lastname =" ";
                        copyCustomer.setLastname(lastname);

                        copyCustomer.setTaxid(remoteUser.getLogin());
	                copyCustomer.setSearchkey(remoteUser.getLogin()+name);
	               
	            	if (name==null || name.equals(""))
                            name =" ";
                        copyCustomer.setName(name);

                        if (description==null || description.equals(""))
                            description =" ";
	                copyCustomer.setNotes(description);
	                
	                if (copyCustomer.getEmail()==null || copyCustomer.getEmail().trim().equals("") || copyCustomer.getEmail().indexOf('@')==-1)
	                	copyCustomer.setEmail(remoteUser.getLogin()+"@beyours.be");
	                else 
	                	copyCustomer.setEmail(remoteUser.getEmail());
	                
                        if (address==null || address.equals(""))
                            address =" ";
	                copyCustomer.setAddress(address);
	                
                        if (address2==null || address2.equals(""))
                            address2 =" ";
                        copyCustomer.setAddress2(address2);

                        if (city==null || city.equals(""))
                            city ="Brussels";
	                copyCustomer.setCity(city);

                        if (country==null || country.equals(""))
                            country ="Belgium";
	                copyCustomer.setCountry(country);

	                copyCustomer.setMaxdebt(1000.0);

                        if (phone==null || phone.equals(""))
                            phone=" ";
	                copyCustomer.setPhone(phone);

                        if (mobile==null || mobile.equals(""))
                            mobile =" ";
	                copyCustomer.setPhone2(mobile);

                        if (zipcode==null || zipcode.equals(""))
                            zipcode =" ";
	                copyCustomer.setPostal(zipcode);
	                
	                //Updates local user
	                dlintegration.syncCustomer(copyCustomer);
	                //System.out.println("UPDATED : '"+name+"'");
	                notToSync.add(copyCustomer.getTaxid());
	            }
	        }

        } while (remoteUsers.length > 0 );
		
        List<CustomerSync> localList = dlintegration.getCustomers();
        
//        System.out.println(" >> "+localList.size()+ "  " + notToSync);
		
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        for (CustomerSync localCustomer : localList) {
        	Date now = new Date();
//        	System.out.println(localCustomer.getTaxid());
        	if (notToSync.contains(localCustomer.getTaxid())) {
        		continue;
        	}
                cpt++;
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
                            userAdd.setEmail(localCustomer.getEmail()+"");
                    userAdd.setDescription(localCustomer.getNotes()+"");
                    userAdd.setAddress(localCustomer.getAddress()+"");
                    userAdd.setAddress2(localCustomer.getAddress2()+"");
                    userAdd.setState_region(localCustomer.getRegion()+"");
                    userAdd.setCity(localCustomer.getCity()+"");
                    userAdd.setCountry(localCustomer.getCountry()+"");
                    userAdd.setZipcode(localCustomer.getPostal()+"");
                    userAdd.setPhone(localCustomer.getPhone2()+"");
                    userAdd.setMobile(localCustomer.getPhone()+"");
                    userAdd.setFax(" ");
                    try {
                            userAdd.setCdate(df.format(localCustomer.getCurdate()));
                    } catch (NullPointerException nu) {
                            userAdd.setCdate(df.format(now));
                    }
                    userAdd.setPerms("");
                    userAdd.setBank_account_nr("");
                    userAdd.setBank_account_holder("");
                    userAdd.setBank_account_type("");
                    userAdd.setBank_iban("");
                    userAdd.setBank_name("");
                    userAdd.setBank_sort_code("");
                    userAdd.setMdate(df.format(now));
                    userAdd.setShopper_group_id("");

                    externalsales.addUser(userAdd);
		}
            return cpt;
	}
}
