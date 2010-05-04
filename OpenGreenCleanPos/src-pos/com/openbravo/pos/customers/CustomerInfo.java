//    GreenPressing POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://code.google.com/p/openbravocustom/
//
//    This file is part of GreenPressing POS.
//
//    GreenPressing POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    GreenPressing POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with GreenPressing POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.customers;

import com.openbravo.pos.util.StringUtils;
import java.io.Serializable;

/**
 *
 * @author adrianromero
 */
public class CustomerInfo implements Serializable {
    
    private static final long serialVersionUID = 9083257536541L;
    protected String id;
    protected String searchkey;
    protected String taxid;
    protected String name;
    protected String curdebt;
    
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
}

