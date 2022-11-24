
package projimagedatabase;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


class  filechoosefilter extends FileFilter {
        public boolean accept(File file) {
            boolean reu = (file.isDirectory() || file.getName().toLowerCase().endsWith(".jpeg") || file.getName().toLowerCase().endsWith(".gif") || file.getName().toLowerCase().endsWith(".png") || file.getName().toLowerCase().endsWith(".jpg"));
            return reu;
        }
        public String getDescription() {
             return "File *.jpeg,*.png,*.gif,*.jpg";
        }
    
}

public class frmImageDateBaseAdd extends javax.swing.JFrame {
    static File file = null;
    String filepath = "";
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public frmImageDateBaseAdd() {
        initComponents();
        diafilechooser.addChoosableFileFilter(new filechoosefilter());
        lblimg.setToolTipText("Preview Unavailable");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC registered");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/imageMysqlTest","root","tiger");
            System.out.println("Connection established");
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpath = new javax.swing.JLabel();
        txtfilepath = new javax.swing.JTextField();
        diafilechooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lblpreview = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblpath.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblpath.setText("Path:");

        txtfilepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilepathActionPerformed(evt);
            }
        });

        diafilechooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diafilechooserActionPerformed(evt);
            }
        });
        diafilechooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                diafilechooserPropertyChange(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblpreview.setBackground(new java.awt.Color(204, 0, 204));
        lblpreview.setForeground(new java.awt.Color(255, 255, 255));
        lblpreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpreview.setText("Image Preview");
        lblpreview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblpreview.setOpaque(true);

        lblimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimg.setText("Preview Unavailable");
        lblimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblimg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblpreview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("See");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpath, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfilepath))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(diafilechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpath)
                    .addComponent(txtfilepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diafilechooser, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfilepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilepathActionPerformed
        txtfilepath.selectAll();
        txtfilepath.requestFocus();
    }//GEN-LAST:event_txtfilepathActionPerformed

    private void diafilechooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diafilechooserActionPerformed
        try {
            String act = evt.getActionCommand();
            file = diafilechooser.getSelectedFile();
            filepath = file.getAbsolutePath();
            if(file.isFile() && file != null && (act.equals(JFileChooser.APPROVE_SELECTION))) {
                Insets ins = lblimg.getInsets();
                Dimension size = lblimg.getSize();
                lblimg.setText("");
                ImageIcon icon = new ImageIcon(filepath);
                lblimg.setToolTipText(diafilechooser.getSelectedFile().getName());
                lblimg.setIcon(new ImageIcon(icon.getImage().getScaledInstance(size.width-ins.right-ins.left,size.height-ins.top-ins.bottom,Image.SCALE_SMOOTH)));
            }
            else if(file.isFile() && file != null && (act.equals(JFileChooser.CANCEL_SELECTION)))
            System.exit(0);

            boolean check = new filechoosefilter().accept(file);

            if(check == false)
            JOptionPane.showMessageDialog(this,"Please Select Appropriate File!!!Selected File Should Be Image...","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception h) {
            JOptionPane.showMessageDialog(null, h.getMessage());
        }

    }//GEN-LAST:event_diafilechooserActionPerformed

    private void diafilechooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_diafilechooserPropertyChange
        try {
            filepath = diafilechooser.getCurrentDirectory().toString();
            txtfilepath.setText(filepath);
            file = diafilechooser.getSelectedFile();

            lblimg.setIcon(new ImageIcon("src\\Z.png"));
            lblimg.setText("Preview Unavailable");
            lblimg.setText("Preview Unavailable");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_diafilechooserPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ps=conn.prepareStatement("insert into imageData (name,image) values (?,?)");
            ps.setString(1, file.getName());
            
            InputStream fin = new FileInputStream(file);
            
            ps.setBinaryStream(2, fin);
            int i=ps.executeUpdate();
            
            if(i>=1)
                JOptionPane.showMessageDialog(null, "Added");
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            frmShow frm = new frmShow();
            frm.setVisible(true);
        } 
        catch (SQLException ex) {
            Logger.getLogger(frmImageDateBaseAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmImageDateBaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmImageDateBaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmImageDateBaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmImageDateBaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmImageDateBaseAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser diafilechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblpath;
    private javax.swing.JLabel lblpreview;
    private javax.swing.JTextField txtfilepath;
    // End of variables declaration//GEN-END:variables
}
