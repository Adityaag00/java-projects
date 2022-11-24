import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javax.swing.Timer;


public class frmMain extends javax.swing.JFrame {
    JFXPanel pnl;
    Random rnd;
    
    public frmMain() {
        initComponents();
        
        rnd=new Random();
        int height=Toolkit.getDefaultToolkit().getScreenSize().height;
        int width=Toolkit.getDefaultToolkit().getScreenSize().width;
        setSize(width,height);
        pnl = new JFXPanel();
        getContentPane().add(pnl);
        
        Canvas can = new Canvas(width,height);
        GraphicsContext gc = can.getGraphicsContext2D();
        
        Timer tim = new Timer(16,(ActionEvent evt) -> {
            double r=rnd.nextDouble();
            double g=rnd.nextDouble();
            double b=rnd.nextDouble();
            int rad=rnd.nextInt(100);
            double ext=rnd.nextDouble();
            int x = rnd.nextInt(width);
            int y = rnd.nextInt(height);
            double op = rnd.nextDouble();
            
            gc.setFill(Color.color(r, g, b, op));
            gc.fillOval(x,y, rad, rad+(ext*10));
        });
        tim.start();
        
        VBox root = new VBox();
        root.getChildren().addAll(can);
        
        Scene scn = new Scene(root,width,height);
        scn.setFill(Color.TRANSPARENT);
        
        scn.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tim.stop();
            }
        });
        
        pnl.setScene(scn);
        pnl.setSize(width,height);
        
        setBackground(new java.awt.Color(0, 0, 0, 0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
