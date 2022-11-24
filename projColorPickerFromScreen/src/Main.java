import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class Main {
    static Color clr;
    static Point pt;
    Timer tim;
    
    public Main() throws AWTException {
        new frmMain().setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Robot rbt = new Robot();
        
        tim = new Timer(0,new ActionListener() {
            public void actionPerformed(ActionEvent Evt) 
            {
                pt = MouseInfo.getPointerInfo().getLocation();
                clr = rbt.getPixelColor(pt.x,pt.y);

                frmMain.txtColor.setBackground(clr);

                frmMain.txtRed.setText(""+clr.getRed());
                frmMain.txtBlue.setText(""+clr.getBlue());
                frmMain.txtGreen.setText(""+clr.getGreen());
                frmMain.txtAlpha.setText(""+clr.getAlpha());
                
                String hex=String.format("#%02X%02X%02X", clr.getRed(),clr.getBlue(),clr.getGreen());
                frmMain.txthex.setText(hex);
                
                Rectangle rect = new Rectangle(pt.x-37, pt.y-35, 80, 80);
                BufferedImage bimg = rbt.createScreenCapture(rect);

                final Dimension dimtx = frmMain.lblImage.getSize();

                final int xinc=dimtx.width-bimg.getWidth();
                final int yinc=dimtx.height-bimg.getHeight();
                
                frmMain.lblImage.setIcon(new ImageIcon(bimg.getScaledInstance(bimg.getWidth()+xinc, bimg.getHeight()+yinc, Image.SCALE_FAST)));
            }
        });
        tim.start(); 
    }
    
    public static void main(String []args) throws AWTException {
        new Main();
    }
}
