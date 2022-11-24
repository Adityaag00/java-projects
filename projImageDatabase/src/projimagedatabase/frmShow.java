
package projimagedatabase;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class frmShow extends javax.swing.JFrame {
    JFXPanel pnl;
    ComboBox cmb;
    TextField lbl;
    ImageView imgview;
    int height;
    int width;
    Connection conn=null;
    Statement stmt;
    PreparedStatement ps=null;
    ResultSet rs=null,rst=null;
    
    public frmShow() throws SQLException{
        initComponents();
        height=Toolkit.getDefaultToolkit().getScreenSize().height;
        width=Toolkit.getDefaultToolkit().getScreenSize().width;
        pnl = new JFXPanel();
        pnl.setSize(width, height);
        cmb=new ComboBox();
        lbl=new TextField();
        
        HBox hb = new HBox(30);
        hb.getChildren().addAll(cmb,lbl);
        
        imgview=new ImageView();
        
        VBox root = new VBox(30);
        root.getChildren().addAll(hb,imgview);
        
        Scene scn=new Scene(root,width,height);
        pnl.setScene(scn);
        
        setSize(width,height);
        
        getContentPane().add(pnl);
        lbl.setPrefWidth(width-40);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC registered");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/imageMysqlTest","root","tiger");
            System.out.println("Connection established");
            ps=conn.prepareStatement("select s_no from imagedata");
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                cmb.getItems().add(rs.getInt(1));
            }
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        cmb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int i= (int) cmb.getValue();
                    stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    rst=stmt.executeQuery("select name,image from imagedata where s_no="+i+";");
                    rst.next();
                    lbl.setText(rst.getString(1));
                    
                    InputStream stream = rst.getBinaryStream(2);
                    BufferedImage img = ImageIO.read(stream);
//                    boolean happen=ImageIO.write(img, "JPG", new File("D:\\New.jpg"));
//                    if(happen=true)
//                        JOptionPane.showMessageDialog(null, "wrote");
                    
                    Image imgall=img.getScaledInstance(width,height-50,Image.SCALE_SMOOTH);
                    BufferedImage imagenew = new BufferedImage(width, height, Image.SCALE_SMOOTH);
                    imagenew.getGraphics().drawImage(imgall, 0, 0, null);
                    imgview.setImage(SwingFXUtils.toFXImage(imagenew, null));
                } 
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } 
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
            }
            
        });
    }

    public void init() {
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(frmShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmShow().setVisible(true);
                } 
                catch (SQLException ex) {
                    Logger.getLogger(frmShow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
