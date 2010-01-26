//    Openbravo POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://www.openbravo.com/product/pos
//
//    This file is part of Openbravo POS.
//
//    Openbravo POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Openbravo POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.reports;

import com.openbravo.pos.forms.AppView;
import java.awt.Component;
import java.util.Date;
import com.openbravo.beans.JCalendarDialog;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.data.loader.QBFCompareEnum;
import com.openbravo.format.Formats;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.SerializerWrite;
import com.openbravo.data.loader.SerializerWriteBasic;

public class JParamsDate extends javax.swing.JPanel implements ReportEditorCreator {

    /** Creates new form JParamsClosedPos */
    public JParamsDate() {
        initComponents();
    }
    
    public void setStartDate(Date d) {
        jTxtStartDate.setText(Formats.TIMESTAMP.formatValue(d));
    }
    

    public void init(AppView app) {
    }

    public void activate() throws BasicException {
    }
    
    public SerializerWrite getSerializerWrite() {
        return new SerializerWriteBasic(new Datas[] {Datas.OBJECT, Datas.TIMESTAMP, Datas.OBJECT, Datas.TIMESTAMP});
    }

    public Component getComponent() {
        return this;
    }
    
    public Object createValue() throws BasicException {
        Object startdate = Formats.TIMESTAMP.parseValue(jTxtStartDate.getText()); 
        return new Object[] {
            startdate == null ? QBFCompareEnum.COMP_NONE : QBFCompareEnum.COMP_GREATEROREQUALS,
            startdate
        };
    }    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtStartDate = new javax.swing.JTextField();
        btnDateStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(0, 100));
        setVerifyInputWhenFocusTarget(false);
        setLayout(null);
        add(jTxtStartDate);
        jTxtStartDate.setBounds(30, 0, 100, 20);

        btnDateStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/date.png"))); // NOI18N
        btnDateStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateStartActionPerformed(evt);
            }
        });
        add(btnDateStart);
        btnDateStart.setBounds(140, 0, 50, 20);

        jLabel1.setText("Date");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 34, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDateStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateStartActionPerformed

        Date date;
        try {
            date = (Date) Formats.TIMESTAMP.parseValue(jTxtStartDate.getText());
        } catch (BasicException e) {
            date = null;
        }        
        date = JCalendarDialog.showCalendarTimeHours(this, date);
        if (date != null) {
            jTxtStartDate.setText(Formats.TIMESTAMP.formatValue(date));
        }             
    }//GEN-LAST:event_btnDateStartActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDateStart;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField jTxtStartDate;
    // End of variables declaration//GEN-END:variables
    
}
