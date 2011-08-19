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
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
         private static int count=0;


         public SyncThread(ProcessAction pa) {
                this.pa = pa;

                this.frame = new JFrame("GreenPOS WS");
                this.frame.setSize(400, 400);
                
                this.frame.setLayout(new SpringLayout());
                this.frame.setResizable(false);


                //Add the ubiquitous "Hello World" label.
                this.label = new JTextArea("Sync in progress ...");

                this.label.setPreferredSize(new Dimension(180,70));
                this.label.setOpaque(true);
                this.label.setBackground(Color.green);
                this.label.setAlignmentX(JLabel.CENTER);

                this.frame.getContentPane().add(label);

                this.ii = ImageLoader.getImage(SyncThread.class, "sync.gif");
                Icon ic = new ImageIcon(this.ii);
                this.imageLabel = new JLabel(ic);
                this.frame.getContentPane().add(this.imageLabel);
                this.frame.setPreferredSize(new Dimension(180, 270));

                //Display the window.
                this.frame.pack();
                this.frame.setVisible(true);


         }

         public void run() {
            if (count > 1) {
                this.label.setBackground(Color.red);
                this.label.setText("ERROR : Already in progress");
                this.frame.repaint();
            } else {
                
                count++;
                try {

                    MessageInf m = pa.execute();

                    this.label.setBackground(Color.yellow);
                    this.label.setText(m.getMessageMsg());
                    this.frame.repaint();

                } catch (Exception ex) {
                    this.label.setText("Sync error : "+ex.toString());
                    this.frame.repaint();

                }
                count--;
            }

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
