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

package com.openbravo.pos.panels;

import com.openbravo.data.loader.IKeyed;
import com.openbravo.pos.forms.AppLocal;

/**
 *
 * @author adrianromero
 * Created on February 12, 2007, 10:49 PM
 *
 */
public class ComboItemLocal implements IKeyed {

    protected Integer m_iKey;
    protected String m_sKeyValue;

    public ComboItemLocal(Integer iKey, String sKeyValue) {
        m_iKey = iKey;
        m_sKeyValue = sKeyValue;
    }
    public Object getKey() {
        return m_iKey;
    }
    public Object getValue() {
        return m_sKeyValue;
    }
    public String toString() {
        return AppLocal.getIntString(m_sKeyValue);
    }
} 
