/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ForMemShip.java
 *
 * Created on Jan 6, 2006, 6:16:07 PM
 */

//import
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
//also can write {import java.sql.*;}

/**
 *
 * @author ARJUN
 */
public class TYPECON extends javax.swing.JFrame {

    /** Creates new form ForMemShip */
    public TYPECON() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmdNew = new javax.swing.JButton();
        cmdSave = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VEH CONSOLE");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("VAGRounded BT", 1, 18));
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TYPE CONSOLE");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Type No.");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Type Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("Type disc");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel7.setText("Membership Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("YYYY-MM-DD");

        cmdNew.setText("New");
        cmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNewActionPerformed(evt);
            }
        });

        cmdSave.setText("Save");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdClear.setText("Clear");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        back.setText("BACK TO MAIN PAGE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        jTextField1.setEnabled(false);
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9))
                            .addComponent(jTextField7)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField4))
                .addGap(103, 103, 103))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cmdNew)
                .addGap(47, 47, 47)
                .addComponent(cmdClear)
                .addGap(67, 67, 67)
                .addComponent(cmdSave)
                .addGap(59, 59, 59)
                .addComponent(cmdExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNew)
                    .addComponent(cmdClear)
                    .addComponent(cmdSave)
                    .addComponent(cmdExit)
                    .addComponent(back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Statement stmt = null;
    ResultSet rs = null;        // ResultSet for publisher table.
    String sql = "SELECT * FROM VEH_TYPE";
    private void cmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNewActionPerformed

        cmdSave.setEnabled(true);
try {
    //REGISTER
            Class.forName("com.mysql.jdbc.Driver");
             //Class.forName("java.sql.driver");

              //CONNECTION
           Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/travelagency","root","arjun");

           //EXECUTE QUERY
           stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM VEH_TYPE");

           //for memb no
            int MNO=100, Mno = 0;
            while (rs.next()) {
                MNO = rs.getInt("TYPE_no");
                               }
            MNO++;
            Mno = MNO;
           jTextField1.setText(Integer.toString(Mno));
              //for status
        
          jTextField2.setFocusable(true);
 }

catch(Exception e){
  JOptionPane.showMessageDialog(null ,e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
      e.printStackTrace();
                  }
}//GEN-LAST:event_cmdNewActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
try{
       //REGISTER
            Class.forName("com.mysql.jdbc.Driver");
               //Class.forName("java.sql.driver");

            //CONNECTION
       String db_url="jdbc:mysql://localhost:3306/travelagency";
       String pwd="arjun";
       String user="root";
           
       Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
      
       //EXECUTED QUERIES
        stmt=conn.createStatement();

          rs=stmt.executeQuery(sql);
          
   
                              

int no=Integer.parseInt(jTextField1.getText());
String name=jTextField2.getText();
String DISC1=jTextField3.getText();
String DISC2=jTextField4.getText();
String date=jTextField7.getText();



int then=JOptionPane.showConfirmDialog(null,"ARE YOU REALLY WANT TO BECOME MEMBER","FOR CONFORMATION",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

if(then==JOptionPane.YES_OPTION){
     String ssql="INSERT INTO VEH_TYPE(TYPE_no, TYPE_name, TYPE_DISC, V_date)values("+(no)+", '"+(name)+"', '"+(DISC1+DISC2)+"', '"+(date)+"');";
  int rowsEffected = stmt.executeUpdate(ssql);
              
         JOptionPane.showMessageDialog(this, "  "+'\n' + " THE REC IS MODIFIED");
  }

  cmdSave.setEnabled(false);

}
catch(Exception e){
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
                   }
   
}//GEN-LAST:event_cmdSaveActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
jTextField1.setText("");
jTextField2.setText("");

jTextField3.setText("");

jTextField4.setText("");
jTextField7.setText("");
 cmdSave.setEnabled(false);
}//GEN-LAST:event_cmdClearActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
 System.exit(0);
}//GEN-LAST:event_cmdExitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new mainpage().setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       jTextField1.setEditable(false);
 
        cmdSave.setEnabled(false);  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TYPECON().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdNew;
    private javax.swing.JButton cmdSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}