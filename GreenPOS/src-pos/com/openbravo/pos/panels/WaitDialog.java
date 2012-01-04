package com.openbravo.pos.panels;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * DOESNT WORK !
 * @author Tii
 */

public class WaitDialog extends JDialog {
    public WaitDialog() {
        this((JDialog)null);
    }

    public WaitDialog(JDialog owner) {
        try {
            JLabel imageLabel = new JLabel();
            this.setTitle("Please wait ...");
            ImageIcon ii = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("/com/openbravo/images/sync.gif")));
            imageLabel.setIcon(ii);
            //            this.setAlwaysOnTop(true);
            this.setPreferredSize(new Dimension(ii.getIconWidth(), ii.getIconHeight()));
            Dimension dim = getToolkit().getScreenSize();
            Rectangle abounds = getBounds();
            setLocation((dim.width - abounds.width - ii.getIconWidth()) / 2, (dim.height - abounds.height - ii.getIconHeight()) / 2);
            this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            this.getContentPane().add(imageLabel, java.awt.BorderLayout.CENTER);
            this.setVisible(true);
            this.setAlwaysOnTop(true);
            this.setResizable(false);
            this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            this.setModal(false);
            this.repaint();
            this.pack();
        } catch (IOException ex) {
            Logger.getLogger(WaitDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}