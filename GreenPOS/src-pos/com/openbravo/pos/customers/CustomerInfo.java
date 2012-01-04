//    GreenPOS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://code.google.com/p/openbravocustom/
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

package com.openbravo.pos.customers;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.data.loader.SerializableWrite;
import com.openbravo.pos.payment.PaymentInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.util.StringUtils;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author adrianromero
 */
public class CustomerInfo implements SerializableRead, Serializable {
    
    private static final long serialVersionUID = 9083257536541L;
    protected String id;
    protected String searchkey;
    protected String taxid;
    protected String name;
    protected String curdebt;

    private static Logger logger = Logger.getLogger("com.openbravo.pos.ticket.TicketInfo");
    
    /** Creates a new instance of UserInfoBasic */
    public CustomerInfo(String id) {
        this.id = id;
        this.searchkey = null;
        this.taxid = null;
        this.name = null;
    }
    
    public String getId() {
        return id;
    }    
    
    public String getTaxid() {
        return taxid;
    }    

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }
    
    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
    
    public String getName() {
        // This is to avoir problems with WS
        if (name!=null && TicketInfo.isWS()) {
          return name.toUpperCase();
        }
        return name;
    }   

    public void setName(String name) {
        this.name = name;
    }

    public String printTaxid() {
        return StringUtils.encodeXML(taxid);
    }

    public String printName() {
        return StringUtils.encodeXML(name);
    }
    
    @Override
    public String toString() {
 //       if (this.curdebt != null && (!this.curdebt.equals("0"))) {
        String value = "";
        if (this.curdebt == null || this.curdebt.equals("0")) {
            value= getName();
            
        } else {
            if ( this.curdebt.substring(0, 1).equals("-") ) {

                 value = "<html><table>" +
                   "<tr><td width=\"300\">"+ " "+ getName() +" " +"</td>" +
                   "<td width=\"80\" BGCOLOR=\"#aaffaa\">"+ "[ CREDIT : " +"</td>"+
                   "<td align=\"right\" width=\"120\" BGCOLOR=\"#aaffaa\">"+ this.curdebt.substring(1) +" ]" +"</td>"
                +"</tr></table></html>";

            } else {
                value = "<html><table>" +
                   "<tr><td width=\"300\">"+ " "+ getName() +" " +"</td>" +
                   "<td width=\"80\" BGCOLOR=\"#ff8899\">"+ "[ DEBT : " +"</td>"+
                   "<td align=\"right\" width=\"120\" BGCOLOR=\"#ff8899\">"+ this.curdebt +" ]" +"</td>"
                +"</tr></table></html>";
            }
        }
 //           return getName()+"    ! "+getcurDebt()+" !";
          return value;
    }

    void setCurdebt(String curdebt) {
        this.curdebt = curdebt;
    }

    String getcurDebt() {
        return this.curdebt;
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // esto es solo para serializar tickets que no estan en la bolsa de tickets pendientes
        id = (String) in.readObject();
        searchkey = (String) in.readObject();
        taxid = "1";
        name = (String) in.readObject();
        curdebt = (String) in.readObject();
    }
    
	@Override
	public void readValues(DataRead dr) throws BasicException {
        id = dr.getString(1);
        searchkey = dr.getString(2);
        taxid = "1";
        name = dr.getString(3);
        curdebt = dr.getString(4);
		
	}
	
	 public void writeExternal(ObjectOutput out) throws IOException {
	        // esto es solo para serializar tickets que no estan en la bolsa de tickets pendientes
	        out.writeObject(id);
	        out.writeObject(searchkey);
	        out.writeObject(name);
	        out.writeObject(curdebt);
	    }

}

