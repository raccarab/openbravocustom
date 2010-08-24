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

package com.openbravo.pos.payment;

import com.openbravo.basic.BasicException;
import com.openbravo.beans.JCalendarDialog;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JFrame;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.format.Formats;
import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.forms.DataLogicSystem;
import java.awt.ComponentOrientation;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author adrianromero
 */
public abstract class JPaymentSelect extends javax.swing.JDialog 
                            implements JPaymentNotifier {

    private PaymentInfoList m_aPaymentInfo;
    private boolean printselected;
    
    private boolean accepted;
    
    private AppView app;
    private double m_dTotal;
    private Date m_rDate;
    private boolean m_isPressing;

    private boolean m_isPositive;
    private boolean m_isComplete;

    public Date getrDate(){
        return m_rDate;
    }

    private CustomerInfoExt customerext;
    private DataLogicSystem dlSystem;
    
    private Map<String, JPaymentInterface> payments = new HashMap<String, JPaymentInterface>();
    private String m_sTransactionID;
    
//    private static Logger logger = Logger.getLogger("com.openbravo.data.loader.PreparedSentence");

    /** Creates new form JPaymentSelect */
    protected JPaymentSelect(java.awt.Frame parent, boolean modal, ComponentOrientation o) {
        super(parent, modal);
        initComponents();    
        
        this.applyComponentOrientation(o);
        
        getRootPane().setDefaultButton(m_jButtonOK);
      
    }
    /** Creates new form JPaymentSelect */
    protected JPaymentSelect(java.awt.Dialog parent, boolean modal, ComponentOrientation o) {
        super(parent, modal);
        initComponents();       
        
        this.applyComponentOrientation(o);        
    }    
    
    public void init(AppView app) {
        this.app = app;
        dlSystem = (DataLogicSystem) app.getBean("com.openbravo.pos.forms.DataLogicSystem");
        printselected = true;
        try {
            if(app.getProperties().getProperty("machine.printerenabled").compareTo("false")==0 ){
                printselected = false;
 //            logger.info("***************"+app.getProperties().getProperty("machine.printerenabled"));
            } 
        } catch (NullPointerException npe) {
            //configuration not set > print = true !
        }



    }
    
    public void setPrintSelected(boolean value) {
        printselected = value;
    }
    
    public boolean isPrintSelected() {
        return printselected;
    }

    public List<PaymentInfo> getSelectedPayments() {
        return m_aPaymentInfo.getPayments();
    }
            
    public boolean showDialog(double total, CustomerInfoExt customerext, Date datereturn, Boolean isPressing) {
        
        m_aPaymentInfo = new PaymentInfoList();
        accepted = false;
        
        m_dTotal = total;
        m_rDate = datereturn;
        if (isPressing==null)
           m_isPressing = false;
        else
            m_isPressing = isPressing;

        if (m_isPressing && customerext==null) {
            int res = JOptionPane.showConfirmDialog(this, AppLocal.getIntString("message.nocustomernodebt"), AppLocal.getIntString("title.editor"), JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            return false;
        }

        this.customerext = customerext;        

        m_jButtonPrint.setSelected(printselected);
        m_jTotalEuros.setText(Formats.CURRENCY.formatValue(new Double(m_dTotal)));

        if (m_isPressing) {
            jReturnDate.setEnabled(true);
            btnDateStart.setEnabled(true);
            jCancelDate.setEnabled(true);
        } else {
            jReturnDate.setEnabled(false);
            btnDateStart.setEnabled(false);
            jCancelDate.setEnabled(false);
        }

        jReturnDate.setText(Formats.TIMESTAMP.formatValue(datereturn));

        addTabs();

        if (m_jTabPayment.getTabCount() == 0) {
            // No payment panels available            
            m_aPaymentInfo.add(getDefaultPayment(total));
            accepted = true;

        } else {
            getRootPane().setDefaultButton(m_jButtonOK);
            printState();
            setVisible(true);
        }
        

        // gets the print button state
        printselected = m_jButtonPrint.isSelected();
        
        // remove all tabs        
        m_jTabPayment.removeAll();

        return accepted;
    }  
    
    protected abstract void addTabs();
    protected abstract void setStatusPanel(boolean isPositive, boolean isComplete);
    protected abstract PaymentInfo getDefaultPayment(double total);
    
    protected void setOKEnabled(boolean value) {
        m_jButtonOK.setEnabled(value);        
    }
    
    protected void setAddEnabled(boolean value) {
        m_jButtonAdd.setEnabled(value);
    }
        
    protected void addTabPayment(JPaymentCreator jpay) {
        if (app.getAppUserView().getUser().hasPermission(jpay.getKey())) {
            
            JPaymentInterface jpayinterface = payments.get(jpay.getKey());
            if (jpayinterface == null) {
                jpayinterface = jpay.createJPayment();
                payments.put(jpay.getKey(), jpayinterface);
            }
            
            jpayinterface.getComponent().applyComponentOrientation(getComponentOrientation());
            //AppLocal.getIntString(jpay.getLabelKey())
            m_jTabPayment.addTab("",
                    new javax.swing.ImageIcon(getClass().getResource(jpay.getIconKey())),
                    jpayinterface.getComponent());
        }
    }

    private Date getDefaultReturnDate() {

        Calendar cal = Calendar.getInstance();
                Date tomorrow = new Date();


                cal.setTime(new Date(tomorrow.getYear(),tomorrow.getMonth(),tomorrow.getDate()));
                cal.add(Calendar.DATE, 2);
                if (cal.DAY_OF_WEEK == cal.SUNDAY)
                   cal.add(Calendar.DATE, 1);

                cal.setTimeInMillis(cal.getTimeInMillis()+57600000);

                return (Date) cal.getTime();
    }
    
    public interface JPaymentCreator {
        public JPaymentInterface createJPayment();
        public String getKey();
        public String getLabelKey();
        public String getIconKey();
    }

    public class JPaymentCashCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentCashPos(JPaymentSelect.this, dlSystem);
        }
        public String getKey() { return "payment.cash"; }
        public String getLabelKey() { return "tab.cash"; }
        public String getIconKey() { return "/com/openbravo/images/cash.png"; }
    }

    public class JPaymentCashCreditCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentCashPosCredit(JPaymentSelect.this, dlSystem);
        }
        public String getKey() { return "payment.cash"; }
        public String getLabelKey() { return "tab.cash"; }
        public String getIconKey() { return "/com/openbravo/images/cash.png"; }
    }
        
    public class JPaymentChequeCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentCheque(JPaymentSelect.this);
        }
        public String getKey() { return "payment.cheque"; }
        public String getLabelKey() { return "tab.cheque"; }
        public String getIconKey() { return "/com/openbravo/images/desktop.png"; }
    }  
        
    public class JPaymentPaperCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentPaper(JPaymentSelect.this, "paperin");
        }
        public String getKey() { return "payment.paper"; }
        public String getLabelKey() { return "tab.paper"; }
        public String getIconKey() { return "/com/openbravo/images/knotes.png"; }
    }

    public class JPaymentMagcardCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
           return new JPaymentMagcard(app, JPaymentSelect.this);
           //  return new JPaymentMagcardCredit(app, JPaymentSelect.this, dlSystem);
        }
        public String getKey() { return "payment.magcard"; }
        public String getLabelKey() { return "tab.magcard"; }
        public String getIconKey() { return "/com/openbravo/images/vcard.png"; }
    }

    public class JPaymentMagcardCreditCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentMagcardCredit(app, JPaymentSelect.this, dlSystem);
        }
        public String getKey() { return "payment.magcard"; }
        public String getLabelKey() { return "tab.magcard"; }
        public String getIconKey() { return "/com/openbravo/images/vcard.png"; }
    }
        
    public class JPaymentFreeCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentFree(JPaymentSelect.this);
        }
        public String getKey() { return "payment.free"; }
        public String getLabelKey() { return "tab.free"; }
        public String getIconKey() { return "/com/openbravo/images/package_toys.png"; }
    }
        
    public class JPaymentDebtCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentDebt(JPaymentSelect.this);
        }
        public String getKey() { return "payment.debt"; }
        public String getLabelKey() { return "tab.debt"; }
        public String getIconKey() { return "/com/openbravo/images/kdmconfig32.png"; }
    }

    public class JPaymentCashRefundCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentRefund(JPaymentSelect.this, "cashrefund");
        }
        public String getKey() { return "refund.cash"; }
        public String getLabelKey() { return "tab.cashrefund"; }
        public String getIconKey() { return "/com/openbravo/images/cash.png"; }
    }
        
    public class JPaymentChequeRefundCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentRefund(JPaymentSelect.this, "chequerefund");
        }
        public String getKey() { return "refund.cheque"; }
        public String getLabelKey() { return "tab.chequerefund"; }
        public String getIconKey() { return "/com/openbravo/images/desktop.png"; }
    }
       
    public class JPaymentPaperRefundCreator implements JPaymentCreator {
        public JPaymentInterface createJPayment() {
            return new JPaymentRefund(JPaymentSelect.this, "paperout");
        }
        public String getKey() { return "refund.paper"; }
        public String getLabelKey() { return "tab.paper"; }
        public String getIconKey() { return "/com/openbravo/images/knotes.png"; }
    }    
       
    public class JPaymentMagcardRefundCreator implements JPaymentCreator {
       public JPaymentInterface createJPayment() {     
            return new JPaymentMagcard(app, JPaymentSelect.this);
        }
        public String getKey() { return "refund.magcard"; }
        public String getLabelKey() { return "tab.magcard"; }
        public String getIconKey() { return "/com/openbravo/images/vcard.png"; }
    }    
    
    protected void setHeaderVisible(boolean value) {
        jPanel6.setVisible(value);
    }
    
    private void printState() {
        
        m_jRemaininglEuros.setText(Formats.CURRENCY.formatValue(new Double(m_dTotal - m_aPaymentInfo.getTotal())));
        m_jButtonRemove.setEnabled(!m_aPaymentInfo.isEmpty());
        m_jTabPayment.setSelectedIndex(0); // selecciono el primero
        ((JPaymentInterface) m_jTabPayment.getSelectedComponent()).activate(customerext, m_dTotal - m_aPaymentInfo.getTotal(), m_sTransactionID);      
        jReturnDate.setText(Formats.TIMESTAMP.formatValue(m_rDate));

    }
    
    protected static Window getWindow(Component parent) {
        if (parent == null) {
            return new JFrame();
        } else if (parent instanceof Frame || parent instanceof Dialog) {
            return (Window)parent;
        } else {
            return getWindow(parent.getParent());
        }
    }       
    
    public void setStatus(boolean isPositive, boolean isComplete) {
        m_isComplete=isComplete;
        m_isPositive=isPositive;
        if (m_rDate==null && m_isPressing)
          setStatusPanel(isPositive, isComplete && false);
        else
          setStatusPanel(isPositive, isComplete);
    }

    private void setStatusPressing(boolean isPressing) {
         //       logger.info(" CALL setStatus : "+isPositive+" "+isComplete+" "+m_isPressing);
        if (m_rDate==null && m_isPressing)
          setStatusPanel(m_isPositive, m_isComplete && isPressing );
        else
          setStatusPanel(m_isPositive, m_isComplete);
    }
    
    public void setTransactionID(String tID){
        this.m_sTransactionID = tID;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        m_jLblTotalEuros1 = new javax.swing.JLabel();
        m_jTotalEuros = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        m_jLblRemainingEuros = new javax.swing.JLabel();
        m_jRemaininglEuros = new javax.swing.JLabel();
        m_jButtonAdd = new javax.swing.JButton();
        m_jButtonRemove = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        m_jTabPayment = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        m_jButtonPrint = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        m_jButtonOK = new javax.swing.JButton();
        m_jButtonCancel = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jReturnDate = new javax.swing.JTextField();
        btnDateStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCancelDate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(AppLocal.getIntString("payment.title")); // NOI18N
        setResizable(false);

        m_jLblTotalEuros1.setText(AppLocal.getIntString("label.totalcash")); // NOI18N
        jPanel4.add(m_jLblTotalEuros1);

        m_jTotalEuros.setBackground(java.awt.Color.white);
        m_jTotalEuros.setFont(new java.awt.Font("Dialog", 1, 14));
        m_jTotalEuros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        m_jTotalEuros.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow")), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jTotalEuros.setOpaque(true);
        m_jTotalEuros.setPreferredSize(new java.awt.Dimension(125, 25));
        m_jTotalEuros.setRequestFocusEnabled(false);
        jPanel4.add(m_jTotalEuros);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        m_jLblRemainingEuros.setText(AppLocal.getIntString("label.remainingcash")); // NOI18N
        jPanel6.add(m_jLblRemainingEuros);

        m_jRemaininglEuros.setBackground(java.awt.Color.white);
        m_jRemaininglEuros.setFont(new java.awt.Font("Dialog", 1, 14));
        m_jRemaininglEuros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        m_jRemaininglEuros.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow")), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jRemaininglEuros.setOpaque(true);
        m_jRemaininglEuros.setPreferredSize(new java.awt.Dimension(125, 25));
        m_jRemaininglEuros.setRequestFocusEnabled(false);
        jPanel6.add(m_jRemaininglEuros);

        m_jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/btnplus.png"))); // NOI18N
        m_jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButtonAddActionPerformed(evt);
            }
        });
        jPanel6.add(m_jButtonAdd);

        m_jButtonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/btnminus.png"))); // NOI18N
        m_jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButtonRemoveActionPerformed(evt);
            }
        });
        jPanel6.add(m_jButtonRemove);

        jPanel4.add(jPanel6);

        getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        m_jTabPayment.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        m_jTabPayment.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        m_jTabPayment.setFocusable(false);
        m_jTabPayment.setRequestFocusEnabled(false);
        m_jTabPayment.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                m_jTabPaymentStateChanged(evt);
            }
        });
        jPanel3.add(m_jTabPayment, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.BorderLayout());

        m_jButtonPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/fileprint.png"))); // NOI18N
        m_jButtonPrint.setSelected(true);
        m_jButtonPrint.setFocusPainted(false);
        m_jButtonPrint.setFocusable(false);
        m_jButtonPrint.setMargin(new java.awt.Insets(8, 16, 8, 16));
        m_jButtonPrint.setRequestFocusEnabled(false);
        jPanel2.add(m_jButtonPrint);
        jPanel2.add(jPanel1);

        m_jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/button_ok.png"))); // NOI18N
        m_jButtonOK.setText(AppLocal.getIntString("Button.OK")); // NOI18N
        m_jButtonOK.setFocusPainted(false);
        m_jButtonOK.setFocusable(false);
        m_jButtonOK.setMargin(new java.awt.Insets(8, 16, 8, 16));
        m_jButtonOK.setRequestFocusEnabled(false);
        m_jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButtonOKActionPerformed(evt);
            }
        });
        jPanel2.add(m_jButtonOK);

        m_jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/button_cancel.png"))); // NOI18N
        m_jButtonCancel.setText(AppLocal.getIntString("Button.Cancel")); // NOI18N
        m_jButtonCancel.setFocusPainted(false);
        m_jButtonCancel.setFocusable(false);
        m_jButtonCancel.setMargin(new java.awt.Insets(8, 16, 8, 16));
        m_jButtonCancel.setRequestFocusEnabled(false);
        m_jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButtonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(m_jButtonCancel);

        jPanel5.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel7.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel7.setVerifyInputWhenFocusTarget(false);
        jPanel7.setLayout(null);

        jReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnDateActionPerformed(evt);
            }
        });
        jPanel7.add(jReturnDate);
        jReturnDate.setBounds(110, 30, 180, 30);

        btnDateStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/date.png"))); // NOI18N
        btnDateStart.setMaximumSize(new java.awt.Dimension(58, 42));
        btnDateStart.setMinimumSize(new java.awt.Dimension(58, 42));
        btnDateStart.setPreferredSize(new java.awt.Dimension(58, 42));
        btnDateStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateStartActionPerformed(evt);
            }
        });
        jPanel7.add(btnDateStart);
        btnDateStart.setBounds(20, 10, 80, 50);

        jLabel1.setText("Date Retour ");
        jPanel7.add(jLabel1);
        jLabel1.setBounds(110, 0, 80, 30);

        jCancelDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/button_cancel.png"))); // NOI18N
        jCancelDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelDateActionPerformed(evt);
            }
        });
        jPanel7.add(jCancelDate);
        jCancelDate.setBounds(290, 30, 40, 30);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-672)/2, (screenSize.height-500)/2, 672, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void m_jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButtonRemoveActionPerformed

        m_aPaymentInfo.removeLast();
        printState();        
        
    }//GEN-LAST:event_m_jButtonRemoveActionPerformed

    private void m_jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButtonAddActionPerformed

        PaymentInfo returnPayment = ((JPaymentInterface) m_jTabPayment.getSelectedComponent()).executePayment();

        if (returnPayment != null) {
            m_aPaymentInfo.add(returnPayment);
            printState();
        }        
        
    }//GEN-LAST:event_m_jButtonAddActionPerformed

    private void m_jTabPaymentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_m_jTabPaymentStateChanged

        if (m_jTabPayment.getSelectedComponent() != null) {
            ((JPaymentInterface) m_jTabPayment.getSelectedComponent()).activate(customerext, m_dTotal - m_aPaymentInfo.getTotal(), m_sTransactionID);
        }
        
    }//GEN-LAST:event_m_jTabPaymentStateChanged

    private void m_jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButtonOKActionPerformed
        
        PaymentInfo returnPayment = ((JPaymentInterface) m_jTabPayment.getSelectedComponent()).executePayment();


        if (returnPayment != null) {
            m_aPaymentInfo.add(returnPayment);

            accepted = true;
            dispose();
        }           
        
    }//GEN-LAST:event_m_jButtonOKActionPerformed

    private void m_jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButtonCancelActionPerformed

        dispose();
        
    }//GEN-LAST:event_m_jButtonCancelActionPerformed

    private void btnDateStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateStartActionPerformed

        Date date;
        try {
            date = (Date) Formats.TIMESTAMP.parseValue(jReturnDate.getText());
        } catch (BasicException e) {
            date = null;
        }

        if (date == null) {

                date = getDefaultReturnDate();


        } 

        date = JCalendarDialog.showCalendarTimeHours(this, date);
        if (date != null) {

            jReturnDate.setText(Formats.TIMESTAMP.formatValue(date));
            m_rDate=date;

              setStatusPressing(true);
        } else {
            setStatusPressing(false);
        }
}//GEN-LAST:event_btnDateStartActionPerformed

    private void jReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReturnDateActionPerformed

    private void jCancelDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelDateActionPerformed
        jReturnDate.setText(null);
        m_rDate=null;
        setStatusPressing(false);
    }//GEN-LAST:event_jCancelDateActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDateStart;
    private javax.swing.JButton jCancelDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jReturnDate;
    private javax.swing.JButton m_jButtonAdd;
    private javax.swing.JButton m_jButtonCancel;
    private javax.swing.JButton m_jButtonOK;
    private javax.swing.JToggleButton m_jButtonPrint;
    private javax.swing.JButton m_jButtonRemove;
    private javax.swing.JLabel m_jLblRemainingEuros;
    private javax.swing.JLabel m_jLblTotalEuros1;
    private javax.swing.JLabel m_jRemaininglEuros;
    private javax.swing.JTabbedPane m_jTabPayment;
    private javax.swing.JLabel m_jTotalEuros;
    // End of variables declaration//GEN-END:variables
    
}
