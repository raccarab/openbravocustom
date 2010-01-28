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

package com.openbravo.pos.printer;

import javax.swing.JComponent;

public interface DeviceFiscalPrinter {
 
    public String getFiscalName();
    public JComponent getFiscalComponent();
    
    public void beginReceipt();
    public void endReceipt();
    public void printLine(String sproduct, double dprice, double dunits, int taxinfo);
    public void printMessage(String smessage);
    public void printTotal(String sPayment, double dpaid);
    
    public void printZReport();
    public void printXReport();
}
