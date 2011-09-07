/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.virtuemart.www.possync;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.JRootApp;
import com.openbravo.pos.forms.ProcessAction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Tii
 */
public class SyncThread extends Thread {
         private JFrame frame;
         private JTextArea label;
         private JLabel imageLabel;
         private Image ii;
         private ProcessAction pa;
         private String name;

         public SyncThread(ProcessAction pa, String name) {
                this.pa = pa;
                this.name=name;
                
                this.frame = new JFrame("GreenPOS WS");
                
                this.frame.setLayout(new SpringLayout());
                this.ii = ImageLoader.getImage(SyncThread.class, "wait.gif");
                Icon ic = new ImageIcon(this.ii);
                this.imageLabel = new JLabel(ic);
                this.frame.getContentPane().add(this.imageLabel);
                this.frame.repaint();
                this.frame.setResizable(false);

                //Add the ubiquitous "Hello World" label.
                this.label = new JTextArea("");

                this.label.setPreferredSize(new Dimension(300,40));
                this.label.setOpaque(true);
                this.label.setAlignmentX(JLabel.CENTER);

                this.frame.getContentPane().add(label);
                this.frame.setPreferredSize(new Dimension(300, 170));

                //Display the window.
                this.frame.pack();
                this.frame.setVisible(true);


         }

         public void run() {         

            this.label.setBackground(Color.orange);
            this.label.setText("Waiting : Already in progress\n\r"+this.name);
            this.frame.setLocation(Count.getCount()*10,Count.getCount()*40);
            this.frame.repaint();


            while (Count.isLocked()) {

                try {
                    this.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SyncThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Count.incCount();
            this.frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            this.ii = ImageLoader.getImage(SyncThread.class, "sync.gif");
            this.imageLabel.setIcon(new ImageIcon(this.ii));
            
            this.label.setBackground(Color.yellow);
            this.label.setText("Sync in progress ...\n\r"+this.name);
            this.frame.repaint();

            try {

                MessageInf m = pa.execute();
                
                this.ii = ImageLoader.getImage(SyncThread.class, "end.gif");
                this.imageLabel.setIcon(new ImageIcon(this.ii));

                if ( m.getSignalWord()==MessageInf.SGN_SUCCESS) {
                    this.label.setBackground(Color.green);
                } else {
                    this.label.setBackground(Color.red);
                }
                this.label.setText(m.getMessageMsg()+"\n\r"+m.getCause().toString());
                this.frame.repaint();

            } catch (BasicException ex) {
                this.ii = ImageLoader.getImage(SyncThread.class, "end.gif");
                this.imageLabel.setIcon(new ImageIcon(this.ii));

                this.label.setBackground(Color.red);
                this.label.setText("Sync error : "+ex.toString());
                this.frame.repaint();

            }
            Count.decCount();
            this.frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            this.frame.repaint();

         }
}


final class ImageLoader {

  private ImageLoader() {
  }

  public static Image getImage(Class relativeClass, String filename) {
    Image returnValue = null;
    InputStream is = relativeClass.getResourceAsStream(filename);
    if (is != null) {
      BufferedInputStream bis = new BufferedInputStream(is);
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      try {
        int ch;
        while ((ch = bis.read()) != -1) {
          baos.write(ch);
        }
        returnValue = Toolkit.getDefaultToolkit().createImage(
            baos.toByteArray());
      } catch (IOException exception) {
        System.err.println("Error loading: " + filename);
      }
    }
    return returnValue;
  }
}

final class Count implements Serializable {

         private static int count=0;


         public static boolean isLocked() {
             if (count > 0 )
                    return true;
             else
                   return false;
         }

         public static void incCount() {
            count++;
         }

         public static void decCount() {
            count--;
         }

    static int getCount() {
        return count;
    }
}