import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PubNavUI.java
 *
 * Created on May 3, 2010, 10:50:29 AM
 */

/**
 *
 * @author xp_system
 */
public class PubNavUI extends javax.swing.JFrame {

    /** Creates new form PubNavUI */
    public PubNavUI() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPAdd = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPh1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPh2 = new javax.swing.JTextField();
        txtPno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cmdFirst = new javax.swing.JButton();
        cmdNext = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        cmdPrev = new javax.swing.JButton();
        cmdLast = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publisher Record Navigation");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Pbone/Mobile");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Phone/Mobile");

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        txtPName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPNamePropertyChange(evt);
            }
        });
        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPNameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Address");

        jLabel6.setFont(new java.awt.Font("VAGRounded BT", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PUBLISHER INFORMATION");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Publisher No./ID");

        cmdFirst.setText("First");
        cmdFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFirstActionPerformed(evt);
            }
        });

        cmdNext.setText("Next");
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        cmdPrev.setText("Previous");
        cmdPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrevActionPerformed(evt);
            }
        });

        cmdLast.setText("Last");
        cmdLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLastActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Status");

        txtStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cmdFirst)
                .addGap(18, 18, 18)
                .addComponent(cmdNext)
                .addGap(20, 20, 20)
                .addComponent(cmdPrev)
                .addGap(18, 18, 18)
                .addComponent(cmdLast)
                .addGap(18, 18, 18)
                .addComponent(cmdExit)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPh2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPh1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdFirst)
                    .addComponent(cmdLast)
                    .addComponent(cmdNext)
                    .addComponent(cmdPrev)
                    .addComponent(cmdExit))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Global variables
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM publisher";
    public void disable_textfields() {
        txtPno.setEditable(false);
        txtPName.setEditable(false);
        txtPAdd.setEditable(false);
        txtPh1.setEditable(false);
        txtPh2.setEditable(false);
        txtStatus.setEditable(false);
    }

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed

}//GEN-LAST:event_txtPNameActionPerformed

    private void txtPNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPNamePropertyChange

}//GEN-LAST:event_txtPNamePropertyChange

    private void txtPNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyPressed

}//GEN-LAST:event_txtPNameKeyPressed

    private void cmdFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFirstActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","raj");
            if (rs.first()) {
                String PubN = rs.getString("pub_id");
                String PubName = rs.getString("pub_name");
                String PubAdd = rs.getString("pub_address");
                String PubPh1 = rs.getString("pub_phone1");
                String PubPh2 = rs.getString("pub_phone2");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtPno.setText(PubN);
                txtPName.setText(PubName);
                txtPAdd.setText(PubAdd);
                txtPh1.setText(PubPh1);
                txtPh2.setText(PubPh2);
                txtStatus.setText(PStatus);
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(true);
            } else {
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(false);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Rhere is no record in table", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdFirstActionPerformed

    private void cmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNextActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","raj");
            if (rs.next()) {
                String PubN = rs.getString("pub_id");
                String PubName = rs.getString("pub_name");
                String PubAdd = rs.getString("pub_address");
                String PubPh1 = rs.getString("pub_phone1");
                String PubPh2 = rs.getString("pub_phone2");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtPno.setText(PubN);
                txtPName.setText(PubName);
                txtPAdd.setText(PubAdd);
                txtPh1.setText(PubPh1);
                txtPh2.setText(PubPh2);
                txtStatus.setText(PStatus);
                cmdFirst.setEnabled(true);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(true);
                cmdLast.setEnabled(true);
            } else {
                cmdNext.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at last record position", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdNextActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_cmdExitActionPerformed

    private void cmdPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrevActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","raj");
            if (rs.previous()) {
                String PubN = rs.getString("pub_id");
                String PubName = rs.getString("pub_name");
                String PubAdd = rs.getString("pub_address");
                String PubPh1 = rs.getString("pub_phone1");
                String PubPh2 = rs.getString("pub_phone2");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtPno.setText(PubN);
                txtPName.setText(PubName);
                txtPAdd.setText(PubAdd);
                txtPh1.setText(PubPh1);
                txtPh2.setText(PubPh2);
                txtStatus.setText(PStatus);
                cmdFirst.setEnabled(true);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(true);
                cmdLast.setEnabled(true);
            } else {
                cmdPrev.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at first position", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdPrevActionPerformed

    private void cmdLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLastActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","raj");
            if (rs.last()) {
                String PubN = rs.getString("pub_id");
                String PubName = rs.getString("pub_name");
                String PubAdd = rs.getString("pub_address");
                String PubPh1 = rs.getString("pub_phone1");
                String PubPh2 = rs.getString("pub_phone2");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtPno.setText(PubN);
                txtPName.setText(PubName);
                txtPAdd.setText(PubAdd);
                txtPh1.setText(PubPh1);
                txtPh2.setText(PubPh2);
                txtStatus.setText(PStatus);
                cmdFirst.setEnabled(true);
                cmdNext.setEnabled(false);
                cmdPrev.setEnabled(true);
                cmdLast.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "You are already at last record", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdLastActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        disable_textfields();
        try {
            // Connect to MySQL database
            // Don't forget to import the two packages
            // import java.sql.*;
            // import javax.swing.JOptionPane;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","raj");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            if (rs.first())
            {
                String PubN = rs.getString("pub_id");
                String PubName = rs.getString("pub_name");
                String PubAdd = rs.getString("pub_address");
                String PubPh1 = rs.getString("pub_phone1");
                String PubPh2 = rs.getString("pub_phone2");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtPno.setText(PubN);
                txtPName.setText(PubName);
                txtPAdd.setText(PubAdd);
                txtPh1.setText(PubPh1);
                txtPh2.setText(PubPh2);
                txtStatus.setText(PStatus);
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(true);
            }
            else
            {
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(false);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Rhere is no record in table", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PubNavUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdFirst;
    private javax.swing.JButton cmdLast;
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtPAdd;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPh1;
    private javax.swing.JTextField txtPh2;
    private javax.swing.JTextField txtPno;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

}