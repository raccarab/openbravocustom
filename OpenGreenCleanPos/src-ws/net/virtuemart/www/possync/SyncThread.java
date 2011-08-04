/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.virtuemart.www.possync;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.JRootApp;
import com.openbravo.pos.forms.ProcessAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tii
 */
public class SyncThread extends Thread {
         ProcessAction pa;
         JRootApp app;
         
         public SyncThread(ProcessAction pa, JRootApp app) {
             this.pa = pa;
             this.app = app;
         }

         public void run() {
            try {
                MessageInf m = pa.execute();
                //JOptionPane.showMessageDialog(app, "Sync successful");
            } catch (BasicException ex) {
                 //JOptionPane.showMessageDialog(app, "Sync bean error");
                 ex.printStackTrace();

            }
         }
}
