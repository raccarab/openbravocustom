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
package com.openbravo.pos.sales;

import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.printer.*;
import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.scripting.ScriptEngine;
import com.openbravo.pos.scripting.ScriptException;
import com.openbravo.pos.scripting.ScriptFactory;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.panels.JTicketsFinder;
import com.openbravo.pos.payment.JPaymentSelect;
import com.openbravo.pos.payment.JPaymentSelectCustomer;
import com.openbravo.pos.payment.PaymentInfo;
import com.openbravo.pos.payment.PaymentInfoTicket;
import com.openbravo.pos.ticket.FindTicketsInfo;
import java.util.Date;
import java.util.List;

public class JTicketsBagTicket extends JTicketsBag {

    private DataLogicSystem m_dlSystem = null;
    protected DataLogicCustomers dlCustomers = null;
    private DeviceTicket m_TP;
    private TicketParser m_TTP;
    private TicketParser m_TTP2;
    private TicketInfo m_ticket;
    private TicketInfo m_ticketCopy;
    private JTicketsBagTicketBag m_TicketsBagTicketBag;
    private JPanelTicketEdits m_panelticketedit;
    private CustomerInfoExt currentCustomer;
    private boolean haschanged;
    private Double totalPaid;
    private Double totalRefund;
    private Double currentDebt;
    private static Logger logger = Logger.getLogger("com.openbravo.pos.sales.JTicketsBagTicket");

    /** Creates new form JTicketsBagTicket */
    public JTicketsBagTicket(AppView app, JPanelTicketEdits panelticket) {

        super(app, panelticket);
        m_panelticketedit = panelticket;
        m_dlSystem = (DataLogicSystem) m_App.getBean("com.openbravo.pos.forms.DataLogicSystem");
        dlCustomers = (DataLogicCustomers) m_App.getBean("com.openbravo.pos.customers.DataLogicCustomers");

        // Inicializo la impresora...
        m_TP = new DeviceTicket();

        // Inicializo el parser de documentos de ticket
        m_TTP = new TicketParser(m_TP, m_dlSystem); // para visualizar el ticket
        m_TTP2 = new TicketParser(m_App.getDeviceTicket(), m_dlSystem); // para imprimir el ticket

        initComponents();

        m_TicketsBagTicketBag = new JTicketsBagTicketBag(this);

        m_jTicketEditor.addEditorKeys(m_jKeys);

        // Este deviceticket solo tiene una impresora, la de pantalla
        m_jPanelTicket.add(m_TP.getDevicePrinter("1").getPrinterComponent(), BorderLayout.CENTER);
        haschanged = false;
    }

    public void activate() {

        // precondicion es que no tenemos ticket activado ni ticket en el panel

        m_ticket = null;
        m_ticketCopy = null;

        printTicket();

        m_jTicketEditor.reset();
        m_jTicketEditor.activate();

        m_panelticketedit.setActiveTicket(null, null);

        jrbSales.setSelected(true);

        m_jEdit.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.EditTicket"));
        m_jRefund.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.RefundTicket"));
        m_jPrint.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.PrintTicket"));

        //jDebt.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.RefundTicket"));
        jDebt.setVisible(false);
        jDebt.setIcon(null);
        jDebt.setEnabled(false);

        m_jRendu.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.RefundTicket"));


        currentCustomer = null;

        currentDebt = 0.0;

        // postcondicion es que tenemos ticket activado aqui y ticket en el panel
    }

    public boolean deactivate() {

        // precondicion es que tenemos ticket activado aqui y ticket en el panel        
        m_ticket = null;
        m_ticketCopy = null;


        if (!haschanged) {
            int res = JOptionPane.showConfirmDialog(this, AppLocal.getIntString("message.checkrendu"), AppLocal.getIntString("title.editor"), JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (res == JOptionPane.OK_OPTION) {
                return true;
            } else {
                return false;
            }
        }
        return true;

        // postcondicion es que no tenemos ticket activado ni ticket en el panel
    }

    public void deleteTicket() {

        if (m_ticketCopy != null) {
            // Para editar borramos el ticket anterior
            try {
                m_dlSales.deleteTicket(m_ticketCopy, m_App.getInventoryLocation());
            } catch (BasicException eData) {
                MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.nosaveticket"), eData);
                msg.show(this);
            }
        }

        m_ticket = null;
        m_ticketCopy = null;
        resetToTicket();
    }

    public void canceleditionTicket() {

        m_ticketCopy = null;
        resetToTicket();
    }

    private void resetToTicket() {
        printTicket();
        m_jTicketEditor.reset();
        m_jTicketEditor.activate();
        m_panelticketedit.setActiveTicket(null, null);
    }

    protected JComponent getBagComponent() {
        return m_TicketsBagTicketBag;
    }

    protected JComponent getNullComponent() {
        return this;
    }

    private void readTicket(int iTicketid, int iTickettype) {
        totalRefund = 0.0;

        // This logic should be in TicketInfo
        try {
            TicketInfo ticket = (iTicketid == -1)
                    ? m_dlSales.loadTicket(iTickettype, m_jTicketEditor.getValueInteger())
                    : m_dlSales.loadTicket(iTickettype, iTicketid);

            if (ticket == null) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.notexiststicket"));
                msg.show(this);
            } else {
                m_ticket = ticket;
                m_ticketCopy = null; // se asigna al pulsar el boton de editar o devolver
                totalPaid = m_ticket.getTotalPaid();

                // CASE of WS, we check for paiments !!
                if (TicketInfo.isWS() && m_ticket.getStatus() > 0) {

                    List<PaymentInfoTicket> pi = m_dlSales.getExtraPayments(m_ticket.getStatus());
                    if (pi != null) {
                        for (PaymentInfo p : pi) {
                            m_ticket.getPayments().add(p);
                        }
                    }

                    currentDebt = m_ticket.getDebt();

                }
                hasDebt();
                printTicket();
            }



        } catch (BasicException e) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotloadticket"), e);
            msg.show(this);
        }



        m_jTicketEditor.reset();
        m_jTicketEditor.activate();


    }

    private void printTicket() {

        // imprimo m_ticket

        try {
            m_jEdit.setEnabled(
                    m_ticket != null
                    && (m_ticket.getTicketType() == TicketInfo.RECEIPT_NORMAL || m_ticket.getTicketType() == TicketInfo.RECEIPT_REFUND)
                    && m_dlSales.isCashActive(m_ticket.getActiveCash()));

            haschanged = (m_ticket == null || (!m_ticket.isPickable()));

            m_jRendu.setEnabled(!haschanged);

        } catch (BasicException e) {
            m_jEdit.setEnabled(false);

            m_jRendu.setEnabled(false);
            haschanged = true;
        }
        m_jRefund.setEnabled(m_ticket != null && m_ticket.getTicketType() == TicketInfo.RECEIPT_NORMAL && m_ticket.isRefundable());
        m_jPrint.setEnabled(m_ticket != null);

        // Este deviceticket solo tiene una impresora, la de pantalla
        m_TP.getDevicePrinter("1").reset();

        if (m_ticket == null) {
            m_jTicketId.setText(null);
        } else {
            m_jTicketId.setText(m_ticket.getName());

            try {
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                script.put("ticket", m_ticket);
                m_TTP.printTicket(script.eval(m_dlSystem.getResourceAsXML("Printer.TicketPreview")).toString());
            } catch (ScriptException e) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"), e);
                msg.show(this);
            } catch (TicketPrinterException eTP) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"), eTP);
                msg.show(this);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        m_jOptions = new javax.swing.JPanel();
        m_jButtons = new javax.swing.JPanel();
        m_jTicketId = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        m_jEdit = new javax.swing.JButton();
        m_jRefund = new javax.swing.JButton();
        m_jPrint = new javax.swing.JButton();
        jDebt = new javax.swing.JButton();
        m_jRendu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        m_jPanelTicket = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        m_jKeys = new com.openbravo.editor.JEditorKeys();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        m_jTicketEditor = new com.openbravo.editor.JEditorIntegerPositive();
        jPanel1 = new javax.swing.JPanel();
        jrbSales = new javax.swing.JRadioButton();
        jrbRefunds = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        m_jOptions.setLayout(new java.awt.BorderLayout());

        m_jButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        m_jTicketId.setBackground(java.awt.Color.white);
        m_jTicketId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_jTicketId.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow")), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jTicketId.setOpaque(true);
        m_jTicketId.setPreferredSize(new java.awt.Dimension(160, 25));
        m_jTicketId.setRequestFocusEnabled(false);
        m_jButtons.add(m_jTicketId);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/search.png"))); // NOI18N
        jButton2.setText(AppLocal.getIntString("label.search")); // NOI18N
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setMargin(new java.awt.Insets(8, 14, 8, 14));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        m_jButtons.add(jButton2);

        m_jEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/edit.png"))); // NOI18N
        m_jEdit.setText(AppLocal.getIntString("button.edit")); // NOI18N
        m_jEdit.setFocusPainted(false);
        m_jEdit.setFocusable(false);
        m_jEdit.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jEdit.setRequestFocusEnabled(false);
        m_jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jEditActionPerformed(evt);
            }
        });
        m_jButtons.add(m_jEdit);

        m_jRefund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/inbox.png"))); // NOI18N
        m_jRefund.setText(AppLocal.getIntString("button.refund")); // NOI18N
        m_jRefund.setFocusPainted(false);
        m_jRefund.setFocusable(false);
        m_jRefund.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jRefund.setRequestFocusEnabled(false);
        m_jRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jRefundActionPerformed(evt);
            }
        });
        m_jButtons.add(m_jRefund);

        m_jPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/yast_printer.png"))); // NOI18N
        m_jPrint.setText(AppLocal.getIntString("button.print")); // NOI18N
        m_jPrint.setFocusPainted(false);
        m_jPrint.setFocusable(false);
        m_jPrint.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jPrint.setRequestFocusEnabled(false);
        m_jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jPrintActionPerformed(evt);
            }
        });
        m_jButtons.add(m_jPrint);

        jDebt.setPreferredSize(new java.awt.Dimension(44, 44));
        jDebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDebtActionPerformed(evt);
            }
        });
        m_jButtons.add(jDebt);

        m_jRendu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/yast_group_add.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pos_messages"); // NOI18N
        m_jRendu.setText(bundle.getString("label.rendu")); // NOI18N
        m_jRendu.setActionCommand(bundle.getString("label.rendu")); // NOI18N
        m_jRendu.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jRendu.setMaximumSize(new java.awt.Dimension(85, 44));
        m_jRendu.setMinimumSize(new java.awt.Dimension(85, 44));
        m_jRendu.setPreferredSize(new java.awt.Dimension(85, 44));
        m_jRendu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jRenduActionPerformed(evt);
            }
        });
        m_jButtons.add(m_jRendu);

        m_jOptions.add(m_jButtons, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        m_jOptions.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(m_jOptions, java.awt.BorderLayout.NORTH);

        m_jPanelTicket.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        m_jPanelTicket.setLayout(new java.awt.BorderLayout());
        add(m_jPanelTicket, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        m_jKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jKeysActionPerformed(evt);
            }
        });
        jPanel4.add(m_jKeys);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/button_ok.png"))); // NOI18N
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(8, 14, 8, 14));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel5.add(jButton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel5.add(m_jTicketEditor, gridBagConstraints);

        jPanel4.add(jPanel5);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        buttonGroup1.add(jrbSales);
        jrbSales.setText(AppLocal.getIntString("label.sales")); // NOI18N
        jrbSales.setFocusPainted(false);
        jrbSales.setFocusable(false);
        jrbSales.setRequestFocusEnabled(false);
        jPanel1.add(jrbSales);

        buttonGroup1.add(jrbRefunds);
        jrbRefunds.setText(AppLocal.getIntString("label.refunds")); // NOI18N
        jrbRefunds.setFocusPainted(false);
        jrbRefunds.setFocusable(false);
        jrbRefunds.setRequestFocusEnabled(false);
        jPanel1.add(jrbRefunds);

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void m_jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jEditActionPerformed

        m_ticketCopy = m_ticket;
        m_TicketsBagTicketBag.showEdit();
        m_panelticketedit.showCatalog();
        m_panelticketedit.setActiveTicket(m_ticket.copyTicket(), null);

    }//GEN-LAST:event_m_jEditActionPerformed

    private void m_jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jPrintActionPerformed

        if (m_ticket != null) {
            try {
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                script.put("ticket", m_ticket);
                m_TTP2.printTicket(script.eval(m_dlSystem.getResourceAsXML("Printer.TicketPreview")).toString());
            } catch (ScriptException e) {
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.cannotprint"), e));
            } catch (TicketPrinterException e) {
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.cannotprint"), e));
            }
        }

    }//GEN-LAST:event_m_jPrintActionPerformed

    private void m_jRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jRefundActionPerformed

        int status = 0;
        if (TicketInfo.isWS()) {
            //WebService Sync needs remote order ID.
            if (m_ticket.getStatus() == 0) {

                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.errorrefund"), AppLocal.getIntString("message.refundnotsynced")));
                return;
            }else if (hasDebt()) {
            
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.errorrefund"), AppLocal.getIntString("message.refunddebtremain")+" > "+m_ticket.getDebt()));
                return;
            } else {
                status = m_ticket.getStatus();
            }
        }
        java.util.List aRefundLines = new ArrayList();

        for (int i = 0; i < m_ticket.getLinesCount(); i++) {
            TicketLineInfo newline = new TicketLineInfo(m_ticket.getLine(i));
            aRefundLines.add(newline);
        }

        m_ticketCopy = null;
        m_TicketsBagTicketBag.showRefund();
        m_panelticketedit.showRefundLines(aRefundLines);

        TicketInfo refundticket = new TicketInfo();
        refundticket.setTicketType(TicketInfo.RECEIPT_REFUND);
        refundticket.setCustomer(m_ticket.getCustomer());
        refundticket.setPayments(m_ticket.getPayments());
        refundticket.setStatus(status);
        refundticket.setDateReturn(null);
        m_panelticketedit.setActiveTicket(refundticket, null);

    }//GEN-LAST:event_m_jRefundActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        readTicket(-1, jrbSales.isSelected() ? 0 : 1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void m_jKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jKeysActionPerformed

        readTicket(-1, jrbSales.isSelected() ? 0 : 1);

    }//GEN-LAST:event_m_jKeysActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (!haschanged) {
        int res = JOptionPane.showConfirmDialog(this, AppLocal.getIntString("message.checkrendu"), AppLocal.getIntString("title.editor"), JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (res == JOptionPane.OK_OPTION) {
        } else {
            return;
        }
    }

    JTicketsFinder finder = JTicketsFinder.getReceiptFinder(this, m_dlSales, dlCustomers);
    finder.setVisible(true);
    FindTicketsInfo selectedTicket = finder.getSelectedCustomer();
    if (selectedTicket == null) {
        m_jTicketEditor.reset();
        m_jTicketEditor.activate();
    } else {
        readTicket(selectedTicket.getTicketId(), selectedTicket.getTicketType());
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void m_jRenduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jRenduActionPerformed

    currentCustomer = m_ticket.getCustomer();
    double toPay = 0.0;
    try {
        toPay = currentCustomer.getCurdebt();
    } catch (NullPointerException npe) {
    }

    if (TicketInfo.isWS()) {
        //WebService Sync needs remote order ID.
        if (m_ticket.getStatus() == 0) {
            JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.hastobesynced")));
            return;
        } else {
            toPay = m_ticket.hasToBePaid();
        }
    } else {
        toPay = currentCustomer.getCurdebt();
    }

    if (toPay > 0.0) {
        JPaymentSelect paymentdialog;
        paymentdialog = JPaymentSelectCustomer.getDialog(this);
        paymentdialog.init(m_App);
        paymentdialog.setPrintSelected(true);

        if (paymentdialog.showDialog(toPay, currentCustomer, null, null)) {

            TicketInfo ticket = new TicketInfo();
            ticket.setTicketType(TicketInfo.RECEIPT_PAYMENT);

            List<PaymentInfo> payments = paymentdialog.getSelectedPayments();

            double total = 0.0;
            for (PaymentInfo p : payments) {
                total += p.getTotal();
                m_ticket.getPayments().add(p);
            }

            payments.add(new PaymentInfoTicket(-total, "debtpaid"));
            currentDebt -= total;

            ticket.setPayments(payments);
            ticket.setUser(m_App.getAppUserView().getUser().getUserInfo());
            ticket.setActiveCash(m_App.getActiveCashIndex());
            ticket.setDate(new Date());
            ticket.setCustomer(currentCustomer);
            ticket.setDateReturn(paymentdialog.getrDate());
            ticket.setStatus(m_ticket.getStatus());

            try {
                m_dlSales.saveTicket(ticket, m_App.getInventoryLocation());
            } catch (BasicException eData) {
                MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.nosaveticket"), eData);
                msg.show(this);
            }


            // reload customer
            CustomerInfoExt c;
            try {
                c = m_dlSales.loadCustomerExt(currentCustomer.getId());
                if (c == null) {
                    MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotfindcustomer"));
                    msg.show(this);
                } else {
                    //                   editCustomer(c);
                }
            } catch (BasicException ex) {
                c = null;
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotfindcustomer"), ex);
                msg.show(this);
            }

            m_jRendu.setEnabled(m_ticket != null && (ticket.isPickable()));
            if (ticket != null) {
                try {
                    ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                    script.put("ticket", ticket);
                    script.put("customer", currentCustomer);
                    m_TTP2.printTicket(script.eval(m_dlSystem.getResourceAsXML("Printer.CustomerPaid")).toString());
                } catch (ScriptException e) {
                    JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.cannotprint"), e));
                } catch (TicketPrinterException e) {
                    JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.cannotprint"), e));
                }
            }

            hasDebt();

            if (currentDebt <= 0.0) {
                m_ticket.setRendu();
                try {
                    m_dlSales.setRendu(m_ticket.getId());
                    m_jRendu.setEnabled(false);


                } catch (BasicException ex) {
                    Logger.getLogger(JTicketsBagTicket.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                m_jRendu.setEnabled(true);
            }
            haschanged = true;
            printTicket();
        }

    } else {
        m_ticket.setRendu();
        try {
            m_dlSales.setRendu(m_ticket.getId());
            m_jRendu.setEnabled(false);


        } catch (BasicException ex) {
            Logger.getLogger(JTicketsBagTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        haschanged = true;
        printTicket();
    }

    /**
     * TODO
     */
}//GEN-LAST:event_m_jRenduActionPerformed

private void jDebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDebtActionPerformed

    JPaymentSelect paymentdialog;
    paymentdialog = JPaymentSelectCustomer.getDialog(this);
    paymentdialog.init(m_App);
    paymentdialog.setPrintSelected(true);

    if (paymentdialog.showDialog(currentCustomer.getCurdebt(), currentCustomer, null, null)) {

        DataLogicSales dlsales = (DataLogicSales) m_App.getBean("com.openbravo.pos.forms.DataLogicSales");

        TicketInfo ticket = new TicketInfo();
        ticket.setTicketType(TicketInfo.RECEIPT_PAYMENT);

        List<PaymentInfo> payments = paymentdialog.getSelectedPayments();

        double total = 0.0;
        for (PaymentInfo p : payments) {
            total += p.getTotal();
        }

        payments.add(new PaymentInfoTicket(-total, "debtpaid"));
        ticket.setPayments(payments);
        ticket.setUser(m_App.getAppUserView().getUser().getUserInfo());
        ticket.setActiveCash(m_App.getActiveCashIndex());
        ticket.setDate(new Date());
        ticket.setCustomer(currentCustomer);
        ticket.setDateReturn(paymentdialog.getrDate());

        try {
            dlsales.saveTicket(ticket, m_App.getInventoryLocation());
        } catch (BasicException eData) {
            MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.nosaveticket"), eData);
            msg.show(this);
        }


        // reload customer
        CustomerInfoExt c;
        try {
            c = dlsales.loadCustomerExt(currentCustomer.getId());
            if (c == null) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotfindcustomer"));
                msg.show(this);
            } else {
                //                   editCustomer(c);
            }
        } catch (BasicException ex) {
            c = null;
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotfindcustomer"), ex);
            msg.show(this);
        }

        hasDebt();

        m_jRendu.setEnabled(m_ticket != null && (ticket.isPickable()));
        if (ticket != null) {
            try {
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                script.put("ticket", ticket);
                script.put("customer", currentCustomer);
                m_TTP2.printTicket(script.eval(m_dlSystem.getResourceAsXML("Printer.CustomerPaid")).toString());
            } catch (ScriptException e) {
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.cannotprint"), e));
            } catch (TicketPrinterException e) {
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.cannotprint"), e));
            }
        }
    }
}//GEN-LAST:event_jDebtActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jDebt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jrbRefunds;
    private javax.swing.JRadioButton jrbSales;
    private javax.swing.JPanel m_jButtons;
    private javax.swing.JButton m_jEdit;
    private com.openbravo.editor.JEditorKeys m_jKeys;
    private javax.swing.JPanel m_jOptions;
    private javax.swing.JPanel m_jPanelTicket;
    private javax.swing.JButton m_jPrint;
    private javax.swing.JButton m_jRefund;
    private javax.swing.JButton m_jRendu;
    private com.openbravo.editor.JEditorIntegerPositive m_jTicketEditor;
    private javax.swing.JLabel m_jTicketId;
    // End of variables declaration//GEN-END:variables

    private boolean hasDebt() {


        if (currentDebt > 0.0) {
            m_jRendu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/indebt.png")));
            return true;
        } else {
            m_jRendu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/apply.png")));
            return false;
        }

    }
//        private void hasDebt() {
//        jDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/apply.png")));
//        jDebt.setEnabled(false);
//        try {
//           currentCustomer = m_ticket.getCustomer();
//
//          // if (currentCustomer.getCurdebt()>0.0 && m_ticket.getDebt()>0.0) {
//            if (currentCustomer.getCurdebt()>0.0) {
//                jDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/indebt.png")));
//                m_jRendu.setEnabled(false);
//                jDebt.setEnabled(true);
//            }
//        } catch (NullPointerException ne) {
//           logger.info("**************************************************************************");
//        }
//    }
//    private Boolean hasDebt() {
//        try {
//            currentCustomer = m_ticket.getCustomer();
//            if (TicketInfo.isWS()) {
//                return (currentCustomer.getCurdebt() > 0.0 && m_ticket.getDebt() > 0.0);
//            } else {
//                return (currentCustomer.getCurdebt() > 0.0);
//            }
//
//
//        } catch (NullPointerException ne) {
//            return false;
//        }
//    }
}
