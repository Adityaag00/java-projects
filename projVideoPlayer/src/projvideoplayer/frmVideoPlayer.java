
package projvideoplayer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.Timer;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javax.swing.JFileChooser;


public class frmVideoPlayer extends javax.swing.JFrame {
    JFXPanel pnl;
    Media med;
    MediaPlayer mp;
    MediaView mv;
    boolean play=true;
    Timer tim;
    Timer tim1 = null;
    
    public frmVideoPlayer() {
        initComponents();
        
        int height=Toolkit.getDefaultToolkit().getScreenSize().height;
        int width=Toolkit.getDefaultToolkit().getScreenSize().width;
        
        setSize(width,height-200);
        
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        String path=choose.getSelectedFile().getAbsolutePath();
        
        pnl = new JFXPanel();
                
        med= new Media((new File(path)).toURI().toString());
        mp = new MediaPlayer(med);
        mp.play();
        mv=new MediaView(mp);
        
        StackPane root = new StackPane();
        root.getChildren().add(mv);
        
        Scene scn = new Scene(root,width,height-300);
        scn.setFill(Color.BLACK);
        pnl.setScene(scn);
        pnl.setSize(width,height-300);
        
        getContentPane().add(pnl);
        
        mv.setFitHeight(height-105);
        mv.setFitWidth(width);
        
        sld.setMaximum((int)(mp.getMedia().getDuration().toMillis()));
        
        tim = new Timer(1,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sld.setValue((int)mp.getCurrentTime().toMillis());
            }
        } );
        tim.start();
        
        tim1 = new Timer(20,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tim.start();
                tim1.stop();
            }
        } );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sld = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sld.setValue(0);
        sld.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldStateChanged(evt);
            }
        });
        sld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldMouseReleased(evt);
            }
        });
        sld.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sldPropertyChange(evt);
            }
        });

        jButton2.setText("play");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Forward");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(sld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(play==false) {
            mp.play();
            play=true;
        }
        else {
            mp.pause();
            play=false;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sldPropertyChange
        
    }//GEN-LAST:event_sldPropertyChange

    private void sldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldStateChanged
        
    }//GEN-LAST:event_sldStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mp.seek(Duration.millis(sld.getValue()+10000));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldMouseReleased
        
    }//GEN-LAST:event_sldMouseReleased

    private void sldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldMousePressed
        tim.stop();
        mp.seek(Duration.millis(sld.getValue()));
        tim1.start();
    }//GEN-LAST:event_sldMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVideoPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider sld;
    // End of variables declaration//GEN-END:variables
}
