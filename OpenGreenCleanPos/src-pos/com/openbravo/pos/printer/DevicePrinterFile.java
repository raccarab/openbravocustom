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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DevicePrinterFile implements DevicePrinter {
    
    private String m_sName;
    private String m_sDescription;
    private BufferedWriter out;
    private String m_ticketPath;
    
    /** Creates a new instance of DevicePrinterNull */
    public DevicePrinterFile() {
        m_sName = AppLocal.getIntString("Printer.File");
        m_sDescription = "File tmp.txt";
        m_ticketPath = "PRINTER/ticket.txt";
        // TODO : better file handling
//        boolean success = (new File("PRINTER")).mkdirs();
//        if (!success) {
//            // Directory creation failed
//        }
    }

    public String getPrinterName() {
        return m_sName;
    }    
    public String getPrinterDescription() {
        return m_sDescription;
    }        
    public javax.swing.JComponent getPrinterComponent() {
        return null;
    }
    public void reset() {
    }
    
    public void beginReceipt() {
        try {
            this.out = new BufferedWriter(new FileWriter(new File(this.m_ticketPath), true));
            this.out.newLine();
            this.out.append("-----*CUT*-----");
            this.out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printBarCode(String type, String position, String code) {        
    }    
    public void printImage(java.awt.image.BufferedImage image) {
    }
    public void beginLine(int iTextSize) {
    }   
    public void printText(int iStyle, String sText) {
         try {
            this.out = new BufferedWriter(new FileWriter(new File(this.m_ticketPath), true));
            //String command = "/bin/echo '"+sText+"' >> tmp.txt";
            //final Process process = Runtime.getRuntime().exec(command);

            String s2 = sText.replaceAll("[\n\r]", "").trim();
            if (s2.length()==0)
                   return;
            
            this.out.newLine();
            this.out.append(s2);

            this.out.close();

            //System.out.println("'"+sText+"' >"+sText.length());
            //int returnCode = process.waitFor();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
    public void endLine() {
    }
    public void endReceipt() {
    }
    public void openDrawer() {
    }
}
