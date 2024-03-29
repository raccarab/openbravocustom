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

package com.openbravo.pos.ticket;

public class ProviderInfo {
    
    private int m_iProviderID;
    private String m_sName;

    /** Creates new Provider */
    public ProviderInfo() {
        m_iProviderID = 0;
        m_sName = "";
    }
    
    public int getProviderID() {
        return m_iProviderID;
    }
    
    public void setProviderID(int iProviderID) {
        m_iProviderID = iProviderID;
    }
    
    public String getName() {
        return m_sName;
    }
    
    public void setName(String sName) {
        m_sName = sName;
    }
    
    public String toString(){
        return m_sName;
    }
}
