//    GreenPressing POS is a point of sales application designed for touch screens.
//    Copyright (C) 2008-2009 Openbravo, S.L.
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

package com.openbravo.pos.ticket;

import com.openbravo.data.loader.DataRead;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.format.Formats;
import java.util.Date;

/**
 *
 * @author  Mikel irurita
 */
public class FindTicketsInfo implements SerializableRead {
    
    private int ticketid;
    private int tickettype;
    private Date date;
    private Date daterendu;
    private String name;
    private String customer;
    private double total;
    
    /** Creates new ProductInfo */
    public FindTicketsInfo() {
        
    }
    
    @Override
    public void readValues(DataRead dr) throws BasicException {
        
        ticketid = dr.getInt(1);
        tickettype = dr.getInt(2);
        date = dr.getTimestamp(3);
        name = dr.getString(4);
        customer = dr.getString(5);
        total = (dr.getObject(6) == null) ? 0.0 : dr.getDouble(6).doubleValue();
        daterendu = dr.getTimestamp(7);
    }
    
    @Override
    public String toString(){
        
        String sCustomer = (customer==null) ? "" : customer;
        String sHtml;
        if (daterendu==null) {
            sHtml = "<tr><td width=\"50\">"+ "["+ ticketid +"]" +"</td>" +
                    "<td align=\"center\" width=\"100\">"+ Formats.DATE.formatValue(date) +"</td>" +
                    "<td align=\"center\" width=\"100\">"+ sCustomer +"</td>" +
                    "<td align=\"right\" width=\"120\">"+ Formats.CURRENCY.formatValue(total) +"</td>"+
                    "<td align=\"center\" width=\"150\">"+ Formats.STRING.formatValue(name) +"</td>"+
                    "<td align=\"center\" width=\"100\">"+ Formats.DATE.formatValue(daterendu) +"</td>"
                    +"</tr>";
         } else {
            sHtml  = "<tr><td width=\"50\">"+ "["+ ticketid +"]" +"</td>" +
                    "<td align=\"center\" width=\"100\">"+ Formats.DATE.formatValue(date) +"</td>" +
                    "<td align=\"center\" width=\"100\">"+ sCustomer +"</td>" +
                    "<td align=\"right\" width=\"120\">"+ Formats.CURRENCY.formatValue(total) +"</td>"+
                    "<td align=\"center\" width=\"150\">"+ Formats.STRING.formatValue(name) +"</td>"+
                    "<td align=\"center\" width=\"100\"  BGCOLOR=\"#aaffaa\">"+ Formats.DATE.formatValue(daterendu) +"</td>"
                    +"</tr>";
         }

        return sHtml;
    }
    
    public int getTicketId(){
        return this.ticketid;
    }
    
    public int getTicketType(){
        return this.tickettype;
    }
    
    
}
