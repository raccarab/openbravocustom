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

import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.openbravo.pos.payment.PaymentInfo;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.data.loader.SerializableWrite;
import com.openbravo.format.Formats;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.LocalRes;
import com.openbravo.pos.payment.PaymentInfoMagcard;
import com.openbravo.pos.util.RoundUtils;
import com.openbravo.pos.util.StringUtils;
import java.util.logging.Logger;
import com.openbravo.pos.util.tsUUID;

/**
 *
 * @author adrianromero
 */

public class CustomerSync implements SerializableRead, Externalizable {

    private static final long serialVersionUID = 2765650092387265178L;
   
    protected String id;
    protected String searchkey;
    protected String taxid;
    protected String name;
    protected String curdebt;
    protected String taxcustomerid;
    protected String notes;
    protected boolean visible;
    protected String card;
    protected Double maxdebt;
    protected Date curdate;
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String phone;
    protected String phone2;
    protected String fax;
    protected String address;
    protected String address2;
    protected String postal;
    protected String city;
    protected String region;
    protected String country;
  
    public CustomerSync(String id) {
    	this.id = id;
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
    
    public String getTaxCustCategoryID() {
        return taxcustomerid;
    }
    
    public void setTaxCustomerID(String taxcustomerid) {
        this.taxcustomerid = taxcustomerid;
    }
    
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Double getMaxdebt() {
        return maxdebt;
    }
    
    public String printMaxDebt() {       
        return Formats.CURRENCY.formatValue(RoundUtils.getValue(getMaxdebt()));
    }
    
    public void setMaxdebt(Double maxdebt) {
        this.maxdebt = maxdebt;
    }

    public Date getCurdate() {
        return curdate;
    }

    public void setCurdate(Date curdate) {
        this.curdate = curdate;
    }

    public String getCurdebt() {
        return curdebt;
    }
    
    public String printCurDebt() {       
        return Formats.CURRENCY.formatValue(getCurdebt());
    }
    
    public void setCurdebt(String curdebt) {
        this.curdebt = curdebt;
    }
    
  
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    ID,	SEARCHKEY,TAXID,NAME,ADDRESS,ADDRESS2,POSTAL,CITY,REGION,COUNTRY,FIRSTNAME,LASTNAME,EMAIL,PHONE,PHONE2,FAX,NOTES,CURDEBT
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // esto es solo para serializar tickets que no estan en la bolsa de tickets pendientes
        id = (String) in.readObject();
        searchkey = (String) in.readObject();
        taxid = (String) in.readObject();
        name = (String) in.readObject();
        address = (String) in.readObject();
        address2 = (String) in.readObject();
        postal = (String) in.readObject();
        city = (String) in.readObject();
        region = (String) in.readObject();
        firstname = (String) in.readObject();
        lastname = (String) in.readObject();
        email = (String) in.readObject();
        phone = (String) in.readObject();
        phone2 = (String) in.readObject();
        fax = (String) in.readObject();
//        curdate = (String) in.readObject();
        curdebt = (String) in.readObject();
        
    }
    
	@Override
	public void readValues(DataRead dr) throws BasicException {
        id = dr.getString(1);
        searchkey = dr.getString(2);
        taxid = dr.getString(3);;
        name = dr.getString(4);
        address = dr.getString(5);
        address2 = dr.getString(6);
        postal = dr.getString(7);
        city = dr.getString(8);
        region = dr.getString(9);
        firstname = dr.getString(10);
        lastname = dr.getString(11);
        email = dr.getString(12);
        phone = dr.getString(13);
        phone2 = dr.getString(14);
        fax = dr.getString(15);
        curdebt = dr.getString(16);
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(id);
        out.writeObject(searchkey);
        out.writeObject(taxid);
        out.writeObject(name);
        out.writeObject(address);
        out.writeObject(address2);
        out.writeObject(postal);
        out.writeObject(city);
        out.writeObject(region);
        out.writeObject(firstname);
        out.writeObject(lastname);
        out.writeObject(email);
        out.writeObject(phone);
        out.writeObject(phone2);
        out.writeObject(fax);
        out.writeObject(curdebt);
		
	}


//	@Override
//	public void writeValues(DataWrite dp) throws BasicException {
//		dp.setString(1, id);
//		
//	}
}
