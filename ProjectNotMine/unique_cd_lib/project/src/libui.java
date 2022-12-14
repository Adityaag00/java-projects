import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * add.java
 *
 * Created on Dec 26, 2011, 5:47:21 PM
 */

/**
 *
 * @author RAJESH HUMAR
 */
public class libui extends javax.swing.JFrame {

    /** Creates new form add */
    public libui() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBTitle = new javax.swing.JTextField();
        txtAuth2 = new javax.swing.JTextField();
        txtAuth1 = new javax.swing.JTextField();
        txtAcno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdition = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        cmdNew = new javax.swing.JButton();
        cmdSave = new javax.swing.JButton();
        cmdEdit = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disk Console");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Directors");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Accession No.");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Disk Title");

        txtBTitle.setToolTipText("title with prefix(such as movie/album etc.) followesd by -  ");

        txtAuth2.setToolTipText("co director's name");

        txtAuth1.setToolTipText("director's name..");

        txtAcno.setToolTipText("disk id ..");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Purchase Date");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Producer");

        jComboBox1.setForeground(new java.awt.Color(0, 255, 204));
        jComboBox1.setModel(new DefaultComboBoxModel() );
        jComboBox1.setToolTipText("select producer");

        txtPrice.setToolTipText("price");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Edition");

        txtEdition.setToolTipText("edition");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(YYYY-MM-DD)");

        txtPDate.setToolTipText("purchase date");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 12));
        jLabel9.setForeground(new java.awt.Color(0, 204, 51));
        jLabel9.setText("Status");

        txtStatus.setToolTipText("status");

        cmdNew.setBackground(new java.awt.Color(204, 204, 255));
        cmdNew.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        cmdNew.setForeground(new java.awt.Color(204, 0, 102));
        cmdNew.setText("New");
        cmdNew.setToolTipText("enter new record");
        cmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNewActionPerformed(evt);
            }
        });

        cmdSave.setBackground(new java.awt.Color(204, 204, 255));
        cmdSave.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        cmdSave.setForeground(new java.awt.Color(204, 0, 102));
        cmdSave.setText("Save");
        cmdSave.setToolTipText("save entered record");
        cmdSave.setEnabled(false);
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdEdit.setBackground(new java.awt.Color(204, 204, 255));
        cmdEdit.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        cmdEdit.setForeground(new java.awt.Color(204, 0, 102));
        cmdEdit.setText("Edit");
        cmdEdit.setToolTipText("edit record");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdDelete.setBackground(new java.awt.Color(204, 204, 255));
        cmdDelete.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        cmdDelete.setForeground(new java.awt.Color(204, 0, 102));
        cmdDelete.setText("Delete");
        cmdDelete.setToolTipText("delete record");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdClear.setBackground(new java.awt.Color(204, 204, 255));
        cmdClear.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        cmdClear.setForeground(new java.awt.Color(204, 0, 102));
        cmdClear.setText("Clear");
        cmdClear.setToolTipText("clear textfields");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        cmdExit.setBackground(new java.awt.Color(204, 204, 255));
        cmdExit.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        cmdExit.setForeground(new java.awt.Color(0, 204, 204));
        cmdExit.setText("Exit");
        cmdExit.setToolTipText("click to exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAuth2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAuth1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                    .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cmdNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdSave)
                        .addGap(18, 18, 18)
                        .addComponent(cmdEdit)
                        .addGap(18, 18, 18)
                        .addComponent(cmdDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAuth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAuth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM Lib";
    // for table Publisher
    Statement stmt1 = null;
    ResultSet rs1 = null;
    String SQL1 = "SELECT * FROM publisher";

    private void cmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNewActionPerformed
        // Activate the Save button when New button pressed
        cmdSave.setEnabled(true);
        DefaultComboBoxModel cModel = (DefaultComboBoxModel) jComboBox1.getModel();
        cModel.removeAllElements();
        txtStatus.setEditable(false);
        // Activate the Save button when New button clicked
        cmdSave.setEnabled(true);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/board_project","root","kvuc");

            stmt = con.createStatement();   // Connection string for  ResultSet - rs.
            rs = stmt.executeQuery(SQL);
            int acno=0, ACNO = 0;
            while (rs.next()) {
                ACNO = rs.getInt("acc_no");
            }
            ACNO++;
            acno = ACNO;
            txtAcno.setText(Integer.toString(acno));
            stmt1 = con.createStatement();   // To list publishers in JComboBox1 component
            rs1 = stmt1.executeQuery(SQL1);
            while (rs1.next()) {
                String pubno = rs1.getString("pub_id");
                String pubName = rs1.getString("pub_name");
                // To make the publisher no. as 4 digit because we will extract 4 digit from list value
                // in mouse click event
                txtStatus.setText("Y"); // Because it is a new book, when it will be issue,
                // it's status will be N.
                if (pubno.length() < 4) {
                    int x = pubno.length();
                    int nl = 4 - x;
                    while (nl > 0){
                        pubno = pubno + " ";
                        nl--;
                    }
                }
                cModel.addElement(pubno + "- " + pubName);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
}//GEN-LAST:event_cmdNewActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/board_project","root","kvuc");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            int Acno = Integer.parseInt(txtAcno.getText().trim());
            String bTitle = txtBTitle.getText();
            String Auth1 = txtAuth1.getText();
            String Auth2 = txtAuth2.getText();
            // Creating a String object pName
            String pName = (String) jComboBox1.getSelectedItem();
            // Extract the first 4 characters as publisher number into a variable
            String PubNo = String.valueOf(pName.substring(0, 3).trim());
            int pno = Integer.parseInt(PubNo);
            jLabel10.setText(""+pno);
            float Price = Float.parseFloat(txtPrice.getText());
            int edition = Integer.parseInt(txtEdition.getText());
            String Pdate = txtPDate.getText();
            char BStatus = 'Y';
            int code = JOptionPane.showConfirmDialog(this, "Are you sure to add?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {
                String strSQL = "INSERT INTO Lib(acc_no, btitle, author1, author2, pub_id, price, pdate, edition, status) VALUES ("+(Acno)+", '"+(bTitle)+"', '"+(Auth1)+"', '"+(Auth2)+"', "+(pno)+", "+(Price)+", '"+(Pdate)+"', "+(edition)+", '"+(BStatus)+"')";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Record added successfully into Lib table");
            }
            cmdSave.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdSaveActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
new edit().setVisible(true);
}//GEN-LAST:event_cmdEditActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
new Delet().setVisible(true);
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        DefaultComboBoxModel cModel = (DefaultComboBoxModel) jComboBox1.getModel();
        txtAcno.setText("");
        txtBTitle.setText("");
        txtAuth1.setText("");
        txtAuth2.setText("");
        cModel.removeAllElements();
        txtPrice.setText("");
        txtEdition.setText("");
        txtPDate.setText("");
        txtStatus.setText("");
        cmdSave.setEnabled(false);
}//GEN-LAST:event_cmdClearActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_cmdExitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdNew;
    private javax.swing.JButton cmdSave;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAcno;
    private javax.swing.JTextField txtAuth1;
    private javax.swing.JTextField txtAuth2;
    private javax.swing.JTextField txtBTitle;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtPDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

}
