import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class frmUpdate extends javax.swing.JFrame {
    Connection updco=null;
    Statement updstmt=null;
    ResultSet updrst=null;
    
        public frmUpdate() {
        initComponents();
        txtname.requestFocus();
        
        try{
            updco=MyConnectivity.getSQLConnection();
            updstmt=updco.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement for update Created");
            updrst=updstmt.executeQuery("select deptno from dept;");
            
            while(updrst.next()){
               combomain.addItem(""+updrst.getInt("deptno"));
            }
            
            updrst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtloc = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        combomain = new javax.swing.JComboBox<>();
        chkboxmain = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("S NO.");

        jLabel2.setText("Name");

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        jLabel3.setText("LOC");

        txtloc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocKeyTyped(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        btnUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnUpdateKeyTyped(evt);
            }
        });

        combomain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomainActionPerformed(evt);
            }
        });
        combomain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combomainKeyTyped(evt);
            }
        });

        chkboxmain.setText("jCheckBox1");
        chkboxmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxmainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(combomain, 0, 112, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkboxmain, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkboxmain)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        frmJdbc frmJ= new frmJdbc();
        frmJ.pack();
        frmJ.setLocationRelativeTo(this);
        frmJ.setVisible(true);
        try{
            updstmt.close();
            updco.close();
            dispose();
        }
         catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Error in Closing ");
       }
        System.out.println("All closed for Updation");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int val = updstmt.executeUpdate("update dept set dname = ('"+txtname.getText()+"'), loc = ('"+txtloc.getText() +"') where deptno = ('"+combomain.getSelectedItem()+"')");
            System.out.println("Table Updated");
            txtloc.setText("");
            txtname.setText("");
            combomain.requestFocus();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(this,"SQL Exception "+e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void combomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomainActionPerformed
        if(chkboxmain.isSelected()) {
            try {
                updrst=updstmt.executeQuery("select * from dept where deptno = '"+combomain.getSelectedItem()+"';");
                updrst.next();
                txtname.setText(updrst.getString("dname"));
                txtloc.setText(updrst.getString("loc"));
                updrst.close();
            }
            catch(SQLException e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_combomainActionPerformed

    private void combomainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combomainKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            txtname.requestFocus();
    }//GEN-LAST:event_combomainKeyTyped

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            txtloc.requestFocus();
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtlocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnUpdate.requestFocus();
    }//GEN-LAST:event_txtlocKeyTyped

    private void btnUpdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnUpdate.doClick();
    }//GEN-LAST:event_btnUpdateKeyTyped

    private void chkboxmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxmainActionPerformed
        if(chkboxmain.isSelected()) {
            try {
                updrst=updstmt.executeQuery("select * from dept where deptno = '"+combomain.getSelectedItem()+"';");
                updrst.next();
                txtname.setText(updrst.getString("dname"));
                txtloc.setText(updrst.getString("loc"));
                updrst.close();
            }
            catch(SQLException e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        else {
            txtname.setText("");
            txtloc.setText("");
        }
    }//GEN-LAST:event_chkboxmainActionPerformed

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
            java.util.logging.Logger.getLogger(frmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkboxmain;
    private javax.swing.JComboBox<String> combomain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtloc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
