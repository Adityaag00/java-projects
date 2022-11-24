import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmJdbc extends javax.swing.JFrame {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rst=null;
    
    int Total=1,Current;
    
    public frmJdbc() {
        initComponents();
        btnNext.requestFocus();
        try{
        /*Class.forName("java.sql.Driver");
        System.out.println("Class successfully found");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","tiger");
        System.out.println("jdbc successfully registered");*/
        conn= MyConnectivity.getSQLConnection();
                
        stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        System.out.println("Statement Created");
        rst=stmt.executeQuery("select * from dept;");
        rst.next();
        showRecords();
        Current=rst.getRow();
        while(rst.next())
            Total++;
        rst.beforeFirst();
        setTitle("Showing "+Current+" of "+Total);
        }
        /*catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this,"Claas not Found ");
        }*/
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Sql Exception"+e.getMessage());
        }
    }
     void showRecords(){
        try{
            txtsno.setText(rst.getInt("deptno")+"");
            txtname.setText(rst.getString("dname"));
            txtloc.setText(rst.getString("loc"));
            Current=rst.getRow();
            setTitle("Showing "+Current+" of "+Total);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"SQL Exception "+e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtsno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtloc = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuInsert = new javax.swing.JMenuItem();
        MenuUpdate = new javax.swing.JMenuItem();
        MenuDelete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("S NO.");

        txtsno.setEditable(false);

        jLabel2.setText("Name");

        txtname.setEditable(false);

        jLabel3.setText("LOC");

        txtloc.setEditable(false);

        btnPrev.setText("Previous");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jMenu1.setText("SQL");

        MenuInsert.setText("Insert Record");
        MenuInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInsertActionPerformed(evt);
            }
        });
        jMenu1.add(MenuInsert);

        MenuUpdate.setText("Update Record");
        MenuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(MenuUpdate);

        MenuDelete.setText("Delete Record");
        MenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(MenuDelete);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrev)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtsno, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try{
            rst.last();
            showRecords();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"SQL Exception "+e.getMessage());
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        try{
            if(!rst.previous()){
                JOptionPane.showMessageDialog(this,"BOF found");
            }
            else{
                showRecords();
            }
       }
       catch(SQLException e){
            JOptionPane.showMessageDialog(this,"SQL Exception "+e.getMessage());
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try{
            if(!rst.next()){
                JOptionPane.showMessageDialog(this,"EOF found");
            }
            else{
                showRecords();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"SQL Exception "+e.getMessage());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try{
            rst.first();
            showRecords();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"SQL Exception "+e.getMessage());
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void MenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeleteActionPerformed
        try{
          dispose();
          rst.close();
          stmt.close();
          conn.close();
          System.out.println("All closed for Main frame");
        }
       
       catch(SQLException e){
            
        }
       frmDelete frmdel = new frmDelete();
       frmdel.pack();
       frmdel.setLocationRelativeTo(this);
       frmdel.setVisible(true);
    }//GEN-LAST:event_MenuDeleteActionPerformed

    private void MenuInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInsertActionPerformed
        try{
          dispose();
          rst.close();
          stmt.close();
          conn.close();
          System.out.println("All closed for Main frame");
        }
       
       catch(SQLException e){
            
        }
       frmInsert frmIns = new frmInsert();
       frmIns.pack();
       frmIns.setLocationRelativeTo(this);
       frmIns.setVisible(true);
       
       
    }//GEN-LAST:event_MenuInsertActionPerformed

    private void MenuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUpdateActionPerformed
        try{
          dispose();
          rst.close();
          stmt.close();
          conn.close();
          System.out.println("All closed for Main frame");
        }
        catch(SQLException e){
            
        }
       frmUpdate frmUpd = new frmUpdate();
       frmUpd.pack();
       frmUpd.setLocationRelativeTo(this);
       frmUpd.setVisible(true);
    }//GEN-LAST:event_MenuUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(frmJdbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJdbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJdbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJdbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmJdbc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuDelete;
    private javax.swing.JMenuItem MenuInsert;
    private javax.swing.JMenuItem MenuUpdate;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtloc;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsno;
    // End of variables declaration//GEN-END:variables
}
