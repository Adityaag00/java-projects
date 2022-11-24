
package projectimageanimation;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class pnlAnimation extends JPanel{
    static BufferedImage bimg;
    static int x,y;
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bimg,x,y, 30, 30, null);
    }
    
    public static void main(String[] args) throws IOException{
        bimg=ImageIO.read(new File("src\\projectimageanimation\\z.png"));
        
        JFrame frm=new JFrame();
        frm.setSize(600, 600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnlAnimation pnl=new pnlAnimation();
        frm.add(pnl);
        frm.setVisible(true);
        
        Timer tim = new Timer(17,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                x++;
                y++;
                pnl.repaint();
            }
        });
        tim.start();
    }
 }
