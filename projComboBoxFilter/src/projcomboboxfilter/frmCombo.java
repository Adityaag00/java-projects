
package projcomboboxfilter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class frmCombo extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rst=null,rst2;
    Statement stmt=null;
    
    public frmCombo() throws ClassNotFoundException,SQLException {
        initComponents();
        combobox.setEditable(true);
//        combobox.setBounds(10, 39, 364, 29);
//        combobox.addItem("");
//        combobox.addItem("");
//        combobox.addItem("");
//        combobox.addItem("");
//        combobox.addItem("");
        try{
            Class.forName("java.sql.Driver");
            System.out.println("Class successfully found");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","tiger");
            System.out.println("jdbc successfully registered");
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement for insert Created");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"SQL Exception");
        }
        
        
        rst2=stmt.executeQuery("select ename from empl;");
        System.out.println("Querry");
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combobox.getModel();
        model.removeAllElements();

        while(rst2.next()) {
            model.addElement(rst2.getString(1));
            combobox.setModel(model);
        }
        
        final JTextField textfield = (JTextField) combobox.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(!textfield.getText().isEmpty()) {
                            combobo(textfield.getText());
                        }
                        else
                            combob(textfield.getText());
                    }
                });

            }
        });
        //combob(textfield.getText());
    }
    
    void combobo(String str) {
        if (!combobox.isPopupVisible()) {
            combobox.showPopup();
            System.out.println("Pop");
        }
        try {
            rst=stmt.executeQuery("select ename from empl where ename like '"+str+"%';");
            System.out.println("Querry");
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combobox.getModel();
            model.removeAllElements();
            
            while(rst.next()) {
                model.addElement(rst.getString(1));
                combobox.setModel(model);
            }
             JTextField textfield = (JTextField) combobox.getEditor().getEditorComponent();
             textfield.setText(str);
        } 
        catch (SQLException ex) {
            Logger.getLogger(frmCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
    }
    
    void combob(String str) {
        if (!combobox.isPopupVisible()) {
            combobox.showPopup();
        }
        try {
            rst=stmt.executeQuery("select ename from empl;");
            System.out.println("Querry");
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combobox.getModel();
            model.removeAllElements();
            
            while(rst.next()) {
                model.addElement(rst.getString(1));
                combobox.setModel(model);
            }
             JTextField textfield = (JTextField) combobox.getEditor().getEditorComponent();
             textfield.setText(str);
        } 
        catch (SQLException ex) {
            Logger.getLogger(frmCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combobox.setMaximumRowCount(1000);
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        
    }//GEN-LAST:event_comboboxActionPerformed

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
            java.util.logging.Logger.getLogger(frmCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmCombo().setVisible(true);
                } 
                catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmCombo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frmCombo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    // End of variables declaration//GEN-END:variables
}
