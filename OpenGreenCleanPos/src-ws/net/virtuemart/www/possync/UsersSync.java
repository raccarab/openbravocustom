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

import java.net.MalformedURLException;
import java.nio.charset.CharsetEncoder;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.rpc.ServiceException;

import net.virtuemart.www.VM_Users.User;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.customers.CustomerSync;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.ProcessAction;
import com.openbravo.pos.ticket.TicketInfo;
import java.security.MessageDigest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersSync implements ProcessAction {
        
    private DataLogicSystem dlsystem;
    private DataLogicIntegration dlintegration;
    private DataLogicSales dlsales;
    private String warehouse;
    private ExternalSalesHelper externalsales;
    private static String defaultEmail = "@DONOTSENDME";

    private static String encodeHTML(String s)
    {
        StringBuffer out = new StringBuffer();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c > 127 || c=='"' || c=='<' || c=='>')
            {
               out.append("&#"+(int)c+";");
            }
            else
            {
                out.append(c);
            }
        }
        return out.toString();
    }

    private static String decodeHTML(String s)
    {
        StringBuffer out = new StringBuffer();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c > 127 || c=='"' || c=='<' || c=='>')
            {
               out.append("&#"+(int)c+";");
            }
            else
            {
                out.append(c);
            }
        }
        return out.toString();
    }

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

            dlintegration.syncCustomersBefore();

            ArrayList<String> notToSync = new ArrayList<String>();
            int step=0;
            User[] remoteUsers;
            int cpt=0;

            do {
                // retrieve users from VM
                remoteUsers = externalsales.getUsersBySteps(step);
//                remoteUsers = externalsales.getUsers();
                step++;
			
	        if (remoteUsers == null){
	            throw new BasicException(AppLocal.getIntString("message.returnnull")+" > Customers null");
	        }
	        
	        // if it found users
	        if (remoteUsers.length > 0 ) {

	            String perms;
	            //loop on all users 
	            for (User remoteUser : remoteUsers) {
                        if (notToSync.contains(remoteUser.getLogin()))
                            continue;
                        
//                        if (!remoteUser.getShopper_group_id().equals("1")) {
//                            notToSync.add(remoteUser.getLogin());
//                            continue;
//                        }
// TODO : SYNC PEOPLE WITH DATABASE
//System.out.println (remoteUser.getLogin()+" : "+remoteUser.getShopper_group_id());
//                        perms = remoteUser.getPerms();
//                        if (!perms.equals("shopper")){
//                            System.out.println (remoteUser.getLogin()+" : "+remoteUser.getPerms());
//
//
//                            continue;
//                        }


                        cpt++;

	            	String name = externalsales.encodeStringISO((remoteUser.getFirstname().trim()+" "+remoteUser.getLastname()).trim());
	            	String firstname =  externalsales.encodeStringISO(remoteUser.getFirstname());
	            	String lastname =  externalsales.encodeStringISO(remoteUser.getLastname());
	            	String description =  externalsales.encodeStringISO(remoteUser.getDescription());
	            	String address = externalsales.encodeStringISO(remoteUser.getAddress());
	            	String address2 = externalsales.encodeStringISO(remoteUser.getAddress2());
	            	String city = externalsales.encodeStringISO(remoteUser.getCity());
	            	String country = externalsales.encodeStringISO(remoteUser.getCountry());
                        String phone = externalsales.encodeStringISO(remoteUser.getPhone());
                        String mobile = externalsales.encodeStringISO(remoteUser.getMobile());
	            	String zipcode = externalsales.encodeStringISO(remoteUser.getZipcode());
                        CharsetEncoder encoder = externalsales.getEncoder();
	            	
	            	CustomerSync copyCustomer = new CustomerSync(remoteUser.getId());

                        if (firstname==null || firstname.equals(""))
                            firstname =" ";
                        copyCustomer.setFirstname(firstname.toUpperCase());

	            	if (lastname==null || lastname.equals(""))
                            lastname =" ";
                        copyCustomer.setLastname(lastname.toUpperCase());

                        copyCustomer.setTaxid(remoteUser.getLogin());

	                copyCustomer.setSearchkey(remoteUser.getLogin()+name.toUpperCase());
	               
	            	if (name==null || name.equals(""))
                            name =" ";
                        copyCustomer.setName(name.toUpperCase());

                        if (description==null || description.equals(""))
                            description =" ";
	                copyCustomer.setNotes(description);
	                
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


                        // SYNC ONLY EMAIL USER FOR OGONE (ZAV)
	                if (TicketInfo.isWS()
                            && TicketInfo.getPayID()==2
                            && remoteUser.getEmail().contains("@DONOTSENDME")) {

                            notToSync.add(copyCustomer.getTaxid());
                            continue;
                        }

	                //Updates local user
	                dlintegration.syncCustomer(copyCustomer);
	                notToSync.add(copyCustomer.getTaxid());
	            }
	        }

        } while (remoteUsers.length > 0 );

        List<CustomerSync> localList = dlintegration.getCustomers();
		
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        for (CustomerSync localCustomer : localList) {

//                System.out.println("* "+localCustomer.getName());

                Date now = new Date();
        	if (notToSync.contains(localCustomer.getTaxid())) {
        		continue;
        	}
                cpt++;
                    User userAdd = new User();
                    userAdd.setLogin(localCustomer.getTaxid());
                    userAdd.setId(localCustomer.getTaxid());
                    userAdd.setFirstname(" ");

                    String tmpName = localCustomer.getName().trim();
                    tmpName = tmpName.replace("'", "");
                    
                    while (tmpName.charAt(0)==' ') {
                        tmpName = tmpName.substring(1);
                    }


                    System.out.println("'"+tmpName+"'");

                    userAdd.setLastname(tmpName);

                    char[] pw = new char[8];
                    int c  = 'A';
                    int  r1 = 0;
                    for (int i=0; i < 8; i++)
                    {
                      r1 = (int)(Math.random() * 3);
                      switch(r1) {
                        case 0: c = '0' +  (int)(Math.random() * 10); break;
                        case 1: c = 'a' +  (int)(Math.random() * 26); break;
                        case 2: c = 'A' +  (int)(Math.random() * 26); break;
                      }
                      pw[i] = (char)c;
                    }
                    String clave=new String(pw);
                    byte[] password = {00};
                    try {
                            MessageDigest md5 = MessageDigest.getInstance("MD5");
                            md5.update(clave.getBytes());
                            password = md5.digest();

                            userAdd.setPassword(password.toString());
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(UsersSync.class.getName()).log(Level.SEVERE, null, ex);
                        userAdd.setPassword(clave);
                    }
                    userAdd.setTitle("M");

                    if (localCustomer.getEmail()==null || localCustomer.getEmail().trim().equals("") || localCustomer.getEmail().indexOf('@')<=0)
                            userAdd.setEmail(localCustomer.getTaxid()+defaultEmail);
                    else
                            userAdd.setEmail(localCustomer.getEmail());

                    userAdd.setDescription(localCustomer.getNotes()+"");
                    userAdd.setAddress(localCustomer.getAddress()+"");
                    userAdd.setAddress2(localCustomer.getAddress2()+"");
                    userAdd.setState_region(localCustomer.getRegion()+"");
                    userAdd.setCity(localCustomer.getCity()+"");
                    userAdd.setCountry(localCustomer.getCountry()+"");
                    userAdd.setZipcode(localCustomer.getPostal()+"");
                    userAdd.setPhone(localCustomer.getPhone()+"");
                    userAdd.setMobile(localCustomer.getPhone2()+"");
                    userAdd.setFax(" ");
                    try {
                            userAdd.setCdate(df.format(localCustomer.getCurdate()));
                    } catch (NullPointerException nu) {
                            userAdd.setCdate(df.format(now));
                    }
                    userAdd.setPerms("shopper");
                    userAdd.setBank_account_nr("");
                    userAdd.setBank_account_holder("");
                    userAdd.setBank_account_type("");
                    userAdd.setBank_iban("");
                    userAdd.setBank_name("");
                    userAdd.setBank_sort_code("");
                    userAdd.setMdate(df.format(now));
                    userAdd.setShopper_group_id("1");

                   

                    externalsales.addUser(userAdd);
		}
            return cpt;
	}
}
