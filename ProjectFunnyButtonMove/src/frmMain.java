import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Random;
import javax.swing.*;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class frmMain extends JFrame {

    Random rnd = new Random();
   
    public frmMain() {
        initComponents();
        labelBackground.setIcon(new ImageIcon(getClass().getResource("duck photo.jpg")));
        this.setSize(720, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btn1.setText("no");
        btn1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn1MouseMoved(evt);
            }
        });
        btn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn1FocusGained(evt);
            }
        });
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(550, 77, 70, 40);

        btn2.setText("yes");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btn2KeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                btn2KeyReleased(evt);
            }
            public void keyTyped(KeyEvent evt) {
                btn2KeyTyped(evt);
            }
        });
        btn2.setBounds(90, 77, 70, 40);
        getContentPane().add(btn2);
        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Century", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are You A Fool ???");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 6, 205, 24);
        labelBackground.setBounds(0, 0, 800, 300);
        getContentPane().add(labelBackground);
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn1KeyPressed(KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
       
    }//GEN-LAST:event_btn1KeyPressed

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed

    }//GEN-LAST:event_btn1MousePressed

    private void btn1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseMoved
      try {
            int x,y;
            x=rnd.nextInt(600);
            y=rnd.nextInt(200);
            btn1.move(x, y);
        }
        catch(NullPointerException e) {
        }
        
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.dispose();
        frm2 s=new frm2();
        s.setVisible(true);
        InputStream music;
        try {

            music =getClass().getResourceAsStream("Laughter-Mike_Koenig-360558723.wav");
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());   
        }
    }

    private void btn2KeyTyped(KeyEvent evt) {
        
    }

    private void btn2KeyPressed(KeyEvent evt) {
        
    }

    private void btn2KeyReleased(KeyEvent evt) {//GEN-FIRST:event_btn2KeyReleased
       
    }

    private void btn1FocusGained(java.awt.event.FocusEvent evt) {
        btn2.requestFocus();
    }

    public static void main(String args[]) {
        new frmMain().setVisible(true);
    }
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBackground;
}
