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

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

public class SerializerWriteInteger implements SerializerWrite<Integer> {
    
    public static final SerializerWrite INSTANCE = new SerializerWriteInteger();
    
    /** Creates a new instance of SerializerWriteInteger */
    private SerializerWriteInteger() {
    }
    
    public void writeValues(DataWrite dp, Integer obj) throws BasicException {
        Datas.INT.setValue(dp, 1, obj);
    }  
}