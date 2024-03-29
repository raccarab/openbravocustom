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

package com.openbravo.pos.printer;

import com.openbravo.pos.forms.AppLocal;

public class DeviceDisplayNull implements DeviceDisplay {
    
    private String m_sName;
    private String m_sDescription;
    
    /** Creates a new instance of DeviceDisplayNull */
    public DeviceDisplayNull() {
        this(null);
    }
    
    /** Creates a new instance of DeviceDisplayNull */
    public DeviceDisplayNull(String desc) {
        m_sName = AppLocal.getIntString("Display.Null");
        m_sDescription = desc;
    }

    public String getDisplayName() {
        return m_sName;
    }    
    public String getDisplayDescription() {
        return m_sDescription;
    }        
    public javax.swing.JComponent getDisplayComponent() {
        return null;
    }
    
    public void clearVisor() {
    }      
    public void writeVisor(String sLine1, String sLine2) {
    } 
    public void writeVisor(int animation, String sLine1, String sLine2) {
    } 
}
