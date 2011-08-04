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
package com.openbravo.pos.forms;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import java.util.Locale;
import javax.swing.UIManager;
import com.openbravo.format.Formats;
import com.openbravo.pos.instance.InstanceQuery;
import com.openbravo.pos.ticket.TicketInfo;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import net.virtuemart.www.possync.SyncThread;
import net.virtuemart.www.possync.WSInfo;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;

/**
 *
 * @author adrianromero
 */
public class StartPOS {

    private static Logger logger = Logger.getLogger("com.openbravo.pos.forms.StartPOS");

    /** Creates a new instance of StartPOS */
    private StartPOS() {
    }

    public static boolean registerApp() {

        // vemos si existe alguna instancia        
        InstanceQuery i = null;
        try {
            i = new InstanceQuery();
            i.getAppMessage().restoreWindow();
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static void main(final String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                if (!registerApp()) {
                    System.exit(1);
                }

                AppConfig config = new AppConfig(args);
                config.load();

                // set WS.
                String wsuser = config.getProperty("ws.user");
                String wspassword = config.getProperty("ws.password");
                String wsurl = config.getProperty("ws.URL");
                String wsposid = config.getProperty("ws.posid");
                String wspayid = config.getProperty("ws.payid");

                WSInfo.setWspassword(wspassword);
                WSInfo.setWspayid(wspayid);
                WSInfo.setWsposid(wsposid);
                WSInfo.setWsurl(wsurl);
                WSInfo.setWsuser(wsuser);

                if (wsposid != null
                        && (wsuser == null || wsuser.equals("")
                        || wsurl.equals("") || wsurl == null
                        || wspassword.equals("") || wspassword == null)) {
                    JOptionPane.showMessageDialog(null, "Config Error ! : Please configure Web Service correctly !");

                }

                // set Locale.
                String slang = config.getProperty("user.language");
                String scountry = config.getProperty("user.country");
                String svariant = config.getProperty("user.variant");
                if (slang != null && !slang.equals("") && scountry != null && svariant != null) {
                    Locale.setDefault(new Locale(slang, scountry, svariant));
                }

                // Set the format patterns
                Formats.setIntegerPattern(config.getProperty("format.integer"));
                Formats.setDoublePattern(config.getProperty("format.double"));
                Formats.setCurrencyPattern(config.getProperty("format.currency"));
                Formats.setPercentPattern(config.getProperty("format.percent"));
                Formats.setDatePattern(config.getProperty("format.date"));
                Formats.setTimePattern(config.getProperty("format.time"));
                Formats.setDateTimePattern(config.getProperty("format.datetime"));

                // Set the look and feel.
                try {

                    Object laf = Class.forName(config.getProperty("swing.defaultlaf")).newInstance();

                    if (laf instanceof LookAndFeel) {
                        UIManager.setLookAndFeel((LookAndFeel) laf);
                    } else if (laf instanceof SubstanceSkin) {
                        SubstanceLookAndFeel.setSkin((SubstanceSkin) laf);
                    }
                } catch (Exception e) {
                    logger.log(Level.WARNING, "Cannot set look and feel", e);
                }

                // For printing the Hostname in the ticke
                String hostname = config.getProperty("machine.hostname");
                TicketInfo.setHostname(hostname);


                if (config.getProperty("ws.posid") != null) {
                    try {
                        int posid = Integer.parseInt(config.getProperty("ws.posid"));

                        if (posid > 0) {
                            TicketInfo.setPosID(posid);
//                          UUID.setId(posid);
                        }

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                if (config.getProperty("ws.payid") != null) {
                    try {
                        int payid = Integer.parseInt(config.getProperty("ws.payid"));

                        if (payid > 0) {
                            TicketInfo.setPayID(payid);
//                          UUID.setId(posid);
                        }

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                String screenmode = config.getProperty("machine.screenmode");

                JRootApp app;

                if ("fullscreen".equals(screenmode)) {
                    JRootKiosk rootkiosk = new JRootKiosk();
                    rootkiosk.initFrame(config);
                    rootkiosk.setTitle("   >>> " + hostname + " <<< " + rootkiosk.getTitle());
                    app = rootkiosk.getRootapp();
                } else {
                    JRootFrame rootframe = new JRootFrame();
                    rootframe.initFrame(config);

                    rootframe.setTitle("   >>> " + hostname + " <<< " + rootframe.getTitle());
                    app = rootframe.getRootapp();
                }

                //ZAV
                if (TicketInfo.isWS() ) {

                    if (Boolean.valueOf(config.getProperty("label.wsproductstart"))) {
                        try {
                            // app.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                             ProcessAction myProcess = (ProcessAction) app.getBean("net.virtuemart.www.possync.ProductsSyncCreate");
                              SyncThread p = new SyncThread(myProcess, app);
                              p.setDaemon (true);
                              p.start();
                              
                        } catch (BeanFactoryException e) {
                            JOptionPane.showMessageDialog(app, "Product Sync bean error");
                            e.printStackTrace();

                        }
                    }
                    if (Boolean.valueOf(config.getProperty("label.wsuserstart"))) {
                        try {
                             //app.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                             ProcessAction myProcess = (ProcessAction) app.getBean("net.virtuemart.www.possync.UsersSyncCreate");
                             SyncThread p = new SyncThread(myProcess, app);
                              p.setDaemon (true);
                              p.start();

                        } catch (BeanFactoryException e) {
                            JOptionPane.showMessageDialog(app, "Users Sync bean error");
                            e.printStackTrace();

                        }
                    }
                }



            }
        });
    }
}
