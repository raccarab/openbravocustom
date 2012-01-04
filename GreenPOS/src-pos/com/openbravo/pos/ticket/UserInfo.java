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

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.SerializableRead;

/**
 *
 * @author adrianromero
 */
public class UserInfo implements SerializableRead,Serializable {

    private static final long serialVersionUID = 7537578737839L;
    private String m_sId;
    private String m_sName;

    /** Creates a new instance of UserInfoBasic */
    public UserInfo(String id, String name) {
        m_sId = id;
        m_sName = name;
    }
    
    public UserInfo() {
    	m_sId = null;
    	m_sName = null;
    }

    public String getId() {
        return m_sId;
    }

    public String getName() {
        return m_sName;
    }

	@Override
	public void readValues(DataRead dr) throws BasicException {
		m_sId = dr.getString(1);
        m_sName = dr.getString(2);
		
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
        // esto es solo para serializar tickets que no estan en la bolsa de tickets pendientes
        out.writeObject(m_sId);
        out.writeObject(m_sName);
	}
}
