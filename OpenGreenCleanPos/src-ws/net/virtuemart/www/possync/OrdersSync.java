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

import com.openbravo.pos.payment.PaymentInfo;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import javax.xml.rpc.ServiceException;

import net.virtuemart.www.VM_Order.CreateOrderInput;
import net.virtuemart.www.VM_Order.Product;
import net.virtuemart.www.VM_Product.Produit;
import net.virtuemart.www.VM_Users.User;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.ProcessAction;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.ticket.UserInfo;

public class OrdersSync implements ProcessAction {

    private DataLogicSystem dlsystem;
    private DataLogicIntegration dlintegration;
    private ExternalSalesHelper externalsales;
    private DataLogicSales dlsales;

    /** Creates a new instance of OrdersSync */
    public OrdersSync(DataLogicSystem dlsystem, DataLogicIntegration dlintegration, DataLogicSales dlsales) {
        this.dlsystem = dlsystem;
        this.dlintegration = dlintegration;
        this.dlsales = dlsales;
        externalsales = null;
    }

    public MessageInf execute() throws BasicException {

        int cpt = 0;
        try {

            if (externalsales == null) {
                externalsales = new ExternalSalesHelper(dlsystem);
            }

            if (!externalsales.checkConnection()) 
                return new MessageInf(MessageInf.SGN_WARNING, "System offline ? ", "Error connecting to website ");               

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

            // SYNC PRODUCTS
            if (WSInfo.isWsproductpre()) {
                System.gc();
                System.runFinalization();
                ProductsSync bean = new ProductsSync(dlsystem, dlintegration, dlsales, "0");
                bean.execute();
                System.gc();
                System.runFinalization();
            }

            // SYNC USERS
            if (WSInfo.isWsuserpre()) {
                System.gc();
                System.runFinalization();
                UsersSync usc = new UsersSync(dlsystem, dlintegration, dlsales, "0");
                usc.execute();
                System.gc();
                System.runFinalization();
            }

            dlintegration.syncOrdersBefore();
            
            // Obtenemos los tickets
            List<TicketInfo> ticketlist = dlintegration.getTicketsByHostname(TicketInfo.getHostname());

            if (ticketlist.size() == 0) {
               // return new MessageInf(MessageInf.SGN_SUCCESS, AppLocal.getIntString("message.syncordersok"), AppLocal.getIntString("message.zeroorders"));
            } else {
                for (TicketInfo ticket : ticketlist) {
                    ticket.setLines(dlintegration.getTicketLines(ticket.getId()));
                    ticket.setPayments(dlintegration.getTicketPayments(ticket.getId()));
                }
                HashMap<String, String> usersMap = new HashMap<String, String>();

                List<UserInfo> localUsers;
                User[] remoteUsers = externalsales.getUsers();
                localUsers = dlintegration.getUsers();
                for (UserInfo localUser : localUsers) {
                    for (User user : remoteUsers) {
                        if (user.getLogin().equals(localUser.getName())) {
                            usersMap.put(localUser.getId(), user.getId());
                            break;
                        }
                    }
                }
                HashMap<String, String> productsMap = new HashMap<String, String>();

                Produit[] remoteProducts = externalsales.getProductsCatalog();

                List<ProductInfoExt> localProducts = dlsales.getProductList().list();

                for (ProductInfoExt localProduct : localProducts) {
                    for (Produit produit : remoteProducts) {
                        if (produit.getProduct_sku().equals(localProduct.getCode())) {
                            productsMap.put(localProduct.getID(), produit.getId());
                            break;
                        }
                    }
                }

                CreateOrderInput orders;
                for (int i = 0; i < ticketlist.size(); i++) {
                    TicketInfo ticket = ticketlist.get(i);

                    String userID = usersMap.get(ticket.getCustomerId());

                    orders = new CreateOrderInput();
                    orders.setPayment_method_id(externalsales.getWsPayID());
                    orders.setPrice_including_tax(String.valueOf(ticket.getTotal()));
                    orders.setProduct_currency("EUR");
                    orders.setShipping_carrier_name("0");
                    orders.setShipping_method("0");
                    orders.setShipping_price("0");
                    orders.setShipping_rate_id("0");
                    orders.setShipping_rate_name("0");
                    orders.setUser_id(userID);
                    orders.setVendor_id(externalsales.getWsPosid());

                    Product[] products = new Product[ticket.getLines().size()];

                    for (int j = 0; j < ticket.getLines().size(); j++) {
                        TicketLineInfo line = ticket.getLines().get(j);
                       // String pDesc = line.getProductName();
                        String pDesc = "";
                        products[j] = new Product();

                        if (line.getProductID().equals("0")) {
                            pDesc = line.getProductName();
                            products[j].setProduct_id(productsMap.get(line.getProductID()));
                            products[j].setQuantity(String.valueOf(line.getMultiply() * line.getPriceTax() * 100));
                            //pDesc += " " + String.valueOf(line.getMultiply()) + " > " + line.getPriceTax();
                        } else {
                            products[j].setProduct_id(productsMap.get(line.getProductID()));
                            products[j].setQuantity(String.valueOf(line.getMultiply()));
                        }
                        if (line.getProductAttSetInstDesc() != null && !line.getProductAttSetInstDesc().equals("")) {
                           if (pDesc.equalsIgnoreCase("")) {
                                pDesc += ", ";
                           }
                           pDesc += line.getProductAttSetInstDesc();
                        }
                        products[j].setDescription(pDesc);
                        //System.out.println(products[j].getProduct_id()+" "+products[j].getDescription());
                    }

                    orders.setCoupon_code("0");
                    orders.setProducts(products);

                    Double totalpaid = 0.0;
                    for (int j = 0; j < ticket.getPayments().size(); j++) {
                        PaymentInfo payment = ticket.getPayments().get(j);

                        if (("magcard".equals(payment.getName()))
                                || ("cheque".equals(payment.getName()))
                                || ("cash".equals(payment.getName()))) {
                            totalpaid += payment.getTotal();
                        }
                    }

                    totalpaid = (Math.round(totalpaid * 100.0))/1.0;
                    String note = ("TicketID="+ticket.printId() + ",TotalPaid=" + (totalpaid/100) + ",Vendeur=" + ticket.printUser());
 //                           + ".Date." + ticket.printDate() + ".DateRetour." + ticket.printDateReturn() + ".DateRendu." + ticket.printDateRendu());

                    orders.setCustomer_note(note);

                    String orderID = externalsales.uploadOrders(orders);

                    if (!orderID.equals("")) {
                        cpt++;

                        externalsales.updateStatus(orderID,ticket.getDate(), ticket.getDateReturn());

                        if (totalpaid >= Math.round((ticket.getTotal() * 100))) {
//PAYMENT
                             externalsales.setPaid(orderID,ticket.getDate() );
                        }
                        if (ticket.getTicketType() == TicketInfo.RECEIPT_REFUND) {
                            dlintegration.execUpdateTicketsRefundPayment(String.valueOf(ticket.getTicketType()),String.valueOf(ticket.getStatus()));
                            externalsales.setRendu(orderID);
                        }
                        else if (ticket.getTicketType() == TicketInfo.RECEIPT_NORMAL)
                            dlintegration.execUpdateTicket(String.valueOf(ticket.getTicketId()),orderID);
                    }
                }
            }

              //PAYMENTS

            List<Integer> orderids = dlintegration.getTicketsPayments();

            //System.out.println(" >>>> "+ orderids.size());

            if (orderids.size() > 0) {

                for (Integer oid : orderids) {
                   // List<Double> dd = dlintegration.getDebt(oid);

                   double dd =  Math.round(dlintegration.getDebt(String.valueOf(oid))*100)/100;
                   double dp = Math.round(dlintegration.getPaid(String.valueOf(oid))*100)/100;

                    if ((dd + dp) <= 0.0 ) {
                        externalsales.setPaid( String.valueOf(oid), null);
                        dlintegration.execUpdateTicketsRefundPayment(String.valueOf(TicketInfo.RECEIPT_PAYMENT), String.valueOf(oid));
                        dlintegration.execUpdateTicketsRefundPayment(String.valueOf(TicketInfo.RECEIPT_REFUND), String.valueOf(oid));
                    }
                }
            }

            //RETURNS
            List<Integer> renduids = dlintegration.getTicketsReturned();

            if (renduids.size() > 0) {

                for (Integer rid : renduids) {
                   externalsales.setRendu( String.valueOf(rid));
                }
            }
       
        } catch (ServiceException e) {
            throw new BasicException(AppLocal.getIntString("message.serviceexception"), e);
        } catch (RemoteException e) {
            throw new BasicException(AppLocal.getIntString("message.remoteexception"), e);
        } catch (MalformedURLException e) {
            throw new BasicException(AppLocal.getIntString("message.malformedurlexception"), e);
        }

// DELETE OLD RETURNED TICKETS
        if (WSInfo.isWsdeletert()) {
            try {

                List<TicketInfo> ticketlist = dlintegration.getTicketsToDelete();
           
                System.out.println("> "+ticketlist.size());

                if (ticketlist.size() > 0) {

                    for (TicketInfo ticket : ticketlist) {

                        System.out.println("deleting "+ticket.getId()+" "+ticket.getDateRendu()+" "+ticket.getStatus());

                        ticket.setLines(dlintegration.getTicketLines(ticket.getId()));
                        ticket.setPayments(dlintegration.getTicketPayments(ticket.getId()));

                        dlsales.deleteTicket(ticket, "0");

                    }
                }
            } catch (BasicException be) {
                  System.out.println("Error deleting !");
                  be.printStackTrace();
            }

        }

        return new MessageInf(MessageInf.SGN_SUCCESS, AppLocal.getIntString("message.syncordersok"), AppLocal.getIntString("message.syncordersinfo", cpt));
    }

    private static int parseInt(String sValue) {

        try {
            return Integer.parseInt(sValue);
        } catch (NumberFormatException eNF) {
            return 0;
        }
    }
}
