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

import java.util.List;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataParams;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.ImageUtils;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SerializerRead;
import com.openbravo.data.loader.SerializerReadClass;
import com.openbravo.data.loader.SerializerReadDouble;
import com.openbravo.data.loader.SerializerReadInteger;
import com.openbravo.data.loader.SerializerWriteBasic;
import com.openbravo.data.loader.SerializerWriteParams;
import com.openbravo.data.loader.SerializerWriteString;
import com.openbravo.data.loader.Session;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.data.loader.Transaction;


import com.openbravo.pos.customers.CustomerSync;
import com.openbravo.pos.forms.BeanFactoryDataSingle;
import com.openbravo.pos.inventory.TaxCategoryInfo;
import com.openbravo.pos.payment.PaymentInfoTicket;
import com.openbravo.pos.ticket.CategoryInfo;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TaxInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.ticket.UserInfo;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author adrianromero
 * Created on 5 de marzo de 2007, 19:56
 *
 */
public class DataLogicIntegration extends BeanFactoryDataSingle {
    
    protected Session s;

    /** Creates a new instance of DataLogicIntegration */
    public DataLogicIntegration() {
    }
    
    public void init(Session s) {
        this.s = s;
    }
     
    public void syncCustomersBefore() throws BasicException {
 // sync problems
 //       new StaticSentence(s, "UPDATE CUSTOMERS SET VISIBLE = " + s.DB.TRUE()).exec();
    }

    public void syncCustomer(final CustomerSync customer) throws BasicException {

        Transaction t = new Transaction(s) {
            public Object transact() throws BasicException {
                // Sync the Customer in a transaction

                // Try to update
                if (new PreparedSentence(s,
                            "UPDATE CUSTOMERS SET ADDRESS = ?, ADDRESS2 = ?, POSTAL = ?, CITY = ?, REGION = ?, COUNTRY = ?, FIRSTNAME = ?, LASTNAME = ?, EMAIL = ?, PHONE = ?, PHONE2 = ?, NOTES = ?, MAXDEBT = ?, NAME = ? WHERE TAXID = ?",
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, customer.getAddress());
                                setString(2, customer.getAddress2());
                                setString(3, customer.getPostal());
                                setString(4, customer.getCity());
                                setString(5, customer.getRegion());
                                setString(6, customer.getCountry());
                                setString(7, customer.getFirstname());
                                setString(8, customer.getLastname());
                                setString(9, customer.getEmail());
                                setString(10, customer.getPhone());
                                setString(11, customer.getPhone2());
                                setString(12, customer.getNotes());
                                setDouble(13, customer.getMaxdebt());
                                setString(14, customer.getName());
                                setString(15, customer.getTaxid());
                            }}) == 0) {
                		
                    // If not updated, try to insert
                    new PreparedSentence(s,
                            "INSERT INTO CUSTOMERS(ID, SEARCHKEY, NAME, ADDRESS, ADDRESS2, POSTAL, CITY, REGION, COUNTRY, FIRSTNAME, LASTNAME, EMAIL, PHONE, PHONE2, NOTES, TAXID, MAXDEBT, VISIBLE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " + s.DB.TRUE() + ")",
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, customer.getId());
                                setString(2, customer.getSearchkey());
                                setString(3, customer.getName());
                                setString(4, customer.getAddress());
                                setString(5, customer.getAddress2());
                                setString(6, customer.getPostal());
                                setString(7, customer.getCity());
                                setString(8, customer.getRegion());
                                setString(9, customer.getCountry());
                                setString(10, customer.getFirstname());
                                setString(11, customer.getLastname());
                                setString(12, customer.getEmail());
                                setString(13, customer.getPhone());
                                setString(14, customer.getPhone2());
                                setString(15, customer.getNotes());
                                setString(16, customer.getTaxid());
                                setDouble(17, customer.getMaxdebt());
                            }});
                }

                return null;
            }
        };
        t.execute();
    }
        
    
    public void syncProductsBefore() throws BasicException {
        new StaticSentence(s, "DELETE FROM PRODUCTS_CAT").exec();
    }   
    
    public void syncTaxCategory(final TaxCategoryInfo taxcat) throws BasicException {
        
        Transaction t = new Transaction(s) {
            public Object transact() throws BasicException {
                // Sync the Tax in a transaction
                
                // Try to update                
                if (new PreparedSentence(s, 
                            "UPDATE TAXCATEGORIES SET NAME = ?  WHERE ID = ?",
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, taxcat.getName());
                                setString(2, taxcat.getID());                                    
                            }}) == 0) {
                       
                    // If not updated, try to insert
                    new PreparedSentence(s, 
                            "INSERT INTO TAXCATEGORIES(ID, NAME) VALUES (?, ?)", 
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, taxcat.getID());
                                setString(2, taxcat.getName());
                            }});
                }
                
                return null;
            }
        };
        t.execute();                   
    }
    
    public void syncTax(final TaxInfo tax) throws BasicException {
        
        Transaction t = new Transaction(s) {
            public Object transact() throws BasicException {
                // Sync the Tax in a transaction
                
                // Try to update                
                if (new PreparedSentence(s, 
                            "UPDATE TAXES SET NAME = ?, CATEGORY = ?, CUSTCATEGORY = ?, PARENTID = ?, RATE = ?, RATECASCADE = ? WHERE ID = ?",
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, tax.getName());
                                setString(2, tax.getTaxCategoryID());
                                setString(3, tax.getTaxCustCategoryID());
                                setString(4, tax.getParentID());
                                setDouble(5, tax.getRate());
                                setBoolean(6, tax.isCascade());
                                setString(7, tax.getId());       
                            }}) == 0) {
                       
                    // If not updated, try to insert
                    new PreparedSentence(s, 
                            "INSERT INTO TAXES(ID, NAME, CATEGORY, CUSTCATEGORY, PARENTID, RATE, RATECASCADE) VALUES (?, ?, ?, ?, ?, ?, ?)", 
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, tax.getId());
                                setString(2, tax.getName());
                                setString(3, tax.getTaxCategoryID());
                                setString(4, tax.getTaxCustCategoryID());
                                setString(5, tax.getParentID());                                
                                setDouble(6, tax.getRate());
                                setBoolean(7, tax.isCascade());
                            }});
                }
                
                return null;
            }
        };
        t.execute();                   
    }
    
    public void syncCategory(final CategoryInfo cat) throws BasicException {
        
        Transaction t = new Transaction(s) {
            public Object transact() throws BasicException {
                // Sync the Category in a transaction
                
                // Try to update
                if (new PreparedSentence(s, 
                            "UPDATE CATEGORIES SET NAME = ? WHERE NAME = ?", 
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, cat.getName()); 
                                setString(2, cat.getName());                                 
                            }}) == 0) {
                       
                    // If not updated, try to insert
                    new PreparedSentence(s, 
                        "INSERT INTO CATEGORIES(ID, NAME, IMAGE) VALUES (?, ?, ?)",
                        SerializerWriteParams.INSTANCE
                        ).exec(new DataParams() { public void writeValues() throws BasicException {
                            setString(1, cat.getID());
                            setString(2, cat.getName());
                            setBytes(3, ImageUtils.writeImage(cat.getImage()));
                        }});
                }
                return null;        
            }
        };
        t.execute();        
    }      
    
    public void syncProduct(final ProductInfoExt prod) throws BasicException {
        
        Transaction t = new Transaction(s) {
            public Object transact() throws BasicException {
                // Sync the Product in a transaction
                // Try to update
                if (new PreparedSentence(s, 
                            "UPDATE PRODUCTS SET REFERENCE = ?, NAME = ?, ISSCALE = ?, PRICEBUY = ?, PRICESELL = ?, CATEGORY = ?, TAXCAT = ?, IMAGE = ?, ATTRIBUTESET_ID = ? WHERE CODE = ?", 
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, prod.getReference());
                                setString(2, prod.getName());
                                // setBoolean(x, p.isCom());
                                setBoolean(3, prod.isScale());
                                setDouble(4, prod.getPriceBuy());
                                setDouble(5, prod.getPriceSell());
                                setString(6, prod.getCategoryID());
                                setString(7, prod.getTaxCategoryID());
                                setBytes(8, ImageUtils.writeImage(prod.getImage()));
                                // setDouble(x, 0.0);
                                // setDouble(x, 0.0);
                                setString(9, prod.getAttributeSetID()); 
                                setString(10, prod.getCode());   
                            }}) == 0) {
                            
                    // If not updated, try to insert
                    new PreparedSentence(s, 
                            "INSERT INTO PRODUCTS (ID, REFERENCE, CODE, NAME, ISCOM, ISSCALE, PRICEBUY, PRICESELL, CATEGORY, TAXCAT, IMAGE, STOCKCOST, STOCKVOLUME, ATTRIBUTESET_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                            SerializerWriteParams.INSTANCE
                            ).exec(new DataParams() { public void writeValues() throws BasicException {
                                setString(1, prod.getID());
                                setString(2, prod.getReference());
                                setString(3, prod.getCode());
                                setString(4, prod.getName());
                                setBoolean(5, prod.isCom());
                                setBoolean(6, prod.isScale());
                                setDouble(7, prod.getPriceBuy());
                                setDouble(8, prod.getPriceSell());
                                setString(9, prod.getCategoryID());
                                setString(10, prod.getTaxCategoryID());
                                setBytes(11, ImageUtils.writeImage(prod.getImage()));
                                setDouble(12, 0.0);
                                setDouble(13, 0.0); 
                                setString(14, prod.getAttributeSetID());                               
                            }});
                }
                        
                // Insert in catalog
                new StaticSentence(s, 
                        "INSERT INTO PRODUCTS_CAT(PRODUCT, CATORDER) VALUES ((SELECT ID FROM PRODUCTS WHERE CODE=?), NULL)",
                        SerializerWriteString.INSTANCE
                        ).exec(prod.getCode());   
                
                return null;        
            }
        };
        t.execute();     
    }

    public List getCustomers() throws BasicException {
        return new PreparedSentence(s
                  , "SELECT ID, SEARCHKEY, TAXID, NAME, ADDRESS, ADDRESS2, POSTAL, CITY, REGION, COUNTRY, FIRSTNAME, LASTNAME, EMAIL, PHONE, PHONE2, FAX, NOTES, CURDATE, CURDEBT FROM CUSTOMERS "               
                  , null
                  , new SerializerReadClass(CustomerSync.class)).list();
    }

    public List getTickets() throws BasicException {
        return new PreparedSentence(s
                  	, "SELECT T.ID, T.TICKETTYPE, T.TICKETID, R.DATENEW, R.MONEY, R.ATTRIBUTES, P.ID, P.NAME, T.CUSTOMER, T.DATERETURN, T.DATERENDU, T.STATUS FROM RECEIPTS R JOIN TICKETS T ON R.ID = T.ID LEFT OUTER JOIN PEOPLE P ON T.PERSON = P.ID WHERE ( T.TICKETTYPE = 0 AND T.STATUS = 0 ) OR ( T.TICKETTYPE = 1 AND T.DATERETURN IS NULL )"
                  	, null
                  	, new SerializerReadClass(TicketInfo.class)).list();
    }

    public List getTicketsPayments() throws BasicException {
        return new PreparedSentence(s
                  	, "SELECT STATUS FROM TICKETS WHERE TICKETTYPE = 2 AND DATERETURN IS NULL GROUP BY STATUS "
                  	, null
                  	, SerializerReadInteger.INSTANCE).list();
    }

/**
 *  TODO
 * @param status
 * @return
 * @throws BasicException
 */
//
//    public List getDebt(String oid) throws BasicException {
//
//        return new PreparedSentence(s
//                , "SELECT P.TOTAL FROM TICKETS T LEFT JOIN PAYMENTS P ON P.RECEIPT = T.ID WHERE T.STATUS = ? AND T.TICKETTYPE = ? AND P.PAYMENT LIKE 'debt' GROUP BY T.STATUS"
//                , SerializerWriteString.INSTANCE
//                , new SerializerRead() {
//                    public Object readValues(DataRead dr) throws BasicException {
//                        return new PaymentInfoTicket(
//                                dr.getDouble(1),
//                                dr.getString(2));
//                    }
//                }).list(ticket);
//    }


//    public List getDebt(String status) throws BasicException {
//        return new PreparedSentence(s
//                  	, "SELECT P.TOTAL FROM TICKETS T LEFT JOIN PAYMENTS P ON P.RECEIPT = T.ID WHERE T.STATUS = ? AND T.TICKETTYPE = 0 AND P.PAYMENT LIKE 'debt' "
//                  	, SerializerWriteString.INSTANCE
//                  	, SerializerReadInteger.INSTANCE).list();
//    }
    public double getDebt(String status) throws BasicException {
        System.out.println(status);
        PreparedSentence p = new PreparedSentence(s
                  	, "SELECT SUM(P.TOTAL) FROM TICKETS T LEFT JOIN PAYMENTS P ON P.RECEIPT = T.ID WHERE T.STATUS = ? AND T.TICKETTYPE = 0 AND P.PAYMENT LIKE 'debt' GROUP BY STATUS"
                  	, SerializerWriteString.INSTANCE
                  	, SerializerReadDouble.INSTANCE);
        Double d = (Double) p.find(status);
        return d == null ? 0.0 : d.doubleValue();
    }

    public double getPaid(String status) throws BasicException {
        System.out.println(status);
        PreparedSentence p = new PreparedSentence(s
                  	, "SELECT SUM(P.TOTAL) FROM TICKETS T LEFT JOIN PAYMENTS P ON P.RECEIPT = T.ID WHERE T.STATUS = ? AND ( T.TICKETTYPE = 2 OR T.TICKETTYPE = 1 ) AND P.TOTAL < 0.0 "
                        , SerializerWriteString.INSTANCE
                  	, SerializerReadDouble.INSTANCE);
        Double d = (Double) p.find(status);
        return d == null ? 0.0 : d.doubleValue();
    }
    
    public List getUsers() throws BasicException {
        return new PreparedSentence(s
                  	, "SELECT ID, TAXID FROM CUSTOMERS "               
                  	, null
                  	, new SerializerReadClass(UserInfo.class)).list();
    }    
    
    public List getTicketLines(final String ticket) throws BasicException {
        return new PreparedSentence(s
//                , "SELECT L.TICKET, L.LINE, L.PRODUCT, L.UNITS, L.PRICE, T.ID, T.NAME, T.CATEGORY, T.CUSTCATEGORY, T.PARENTID, T.RATE, T.RATECASCADE, T.RATEORDER, L.ATTRIBUTES " +
//                  "FROM TICKETLINES L, TAXES T WHERE L.TAXID = T.ID AND L.TICKET = ?"
                 , "SELECT L.TICKET, L.LINE, L.PRODUCT, L.ATTRIBUTESETINSTANCE_ID, L.UNITS, L.PRICE, T.ID, T.NAME, T.CATEGORY, T.CUSTCATEGORY, T.PARENTID, T.RATE, T.RATECASCADE, T.RATEORDER, L.ATTRIBUTES " +
                  "FROM TICKETLINES L, TAXES T WHERE L.TAXID = T.ID AND L.TICKET = ? ORDER BY L.LINE"
                , SerializerWriteString.INSTANCE
                , new SerializerReadClass(TicketLineInfo.class)).list(ticket);
    }
    
    public List getTicketPayments(final String ticket) throws BasicException {
        return new PreparedSentence(s
                , "SELECT TOTAL, PAYMENT FROM PAYMENTS WHERE RECEIPT = ?"             
                , SerializerWriteString.INSTANCE
                , new SerializerRead() {
                    public Object readValues(DataRead dr) throws BasicException {
                        return new PaymentInfoTicket(
                                dr.getDouble(1),
                                dr.getString(2));
                    }                
                }).list(ticket);
    }    

    public void execTicketUpdate() throws BasicException {
        new StaticSentence(s, "UPDATE TICKETS SET STATUS = 1 WHERE STATUS = 0").exec();
    }

	public void syncOrdersBefore()  throws BasicException {
		new StaticSentence(s, "UPDATE TICKETS SET CUSTOMER = '0' WHERE CUSTOMER IS NULL").exec();
		new StaticSentence(s, "UPDATE TICKETLINES SET PRODUCT = '0' WHERE PRODUCT IS NULL AND TAXID NOT LIKE '000'").exec();
		
	}

	public void execUpdateTicket(final String ticketid, final String orderID ) throws BasicException {
		
		new PreparedSentence(s, "UPDATE  TICKETS SET STATUS = ? WHERE STATUS = 0 AND TICKETID = ?",
                SerializerWriteParams.INSTANCE
                ).exec(new DataParams() {
                	public void writeValues() throws BasicException {
                		setString(1, orderID);
                		setString(2, ticketid);

                	}});
	}


	public void execUpdateTicketsRefundPayment(final String tickettype, final String orderID ) throws BasicException {

                final Date date = new Date();
                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                final String dateReturn = sdf.format(date);

		new PreparedSentence(s, "UPDATE  TICKETS SET DATERETURN = ? WHERE STATUS = ? AND TICKETTYPE = ? ",
                SerializerWriteParams.INSTANCE
                ).exec(new DataParams() {
                	public void writeValues() throws BasicException {
                		setString(1, dateReturn);
                		setString(2, orderID);
                		setString(3, tickettype);

                	}});
	}
}
