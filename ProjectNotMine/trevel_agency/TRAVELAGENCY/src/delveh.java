import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
/*
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PubDelUI.java
 *
 * Created on May 2, 2010, 6:27:01 PM
 */

/**
 *
 * @author xp_system
 */
public class delveh extends javax.swing.JFrame {

    /** Creates new form PubDelUI */
    public delveh() {
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

        cmdDelete = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veihcle Data Deletion");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        jButton1.setText("BACK TO MAIN FORM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("VEH NO");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("VEH NAME");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setText("OTR DISC");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("TYPE");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("PRICE");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel6.setText("VEH CAPACITY(IN L)");

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT A VEHICLE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setText("BATCH NO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setText("PURCHASE DATE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("BOOKING PRICE(\\DAY)");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel7.setText("STATUS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("ISSUE STATUS");

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("PLEASE WRITE THE VEH NO OF THE VEH TO BE DELETED");

        jButton2.setText("GET RECORD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cmdDelete)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(cmdExit)
                        .addGap(157, 157, 157)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel13)
                                .addGap(53, 53, 53)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmdDelete)
                                    .addComponent(cmdExit)
                                    .addComponent(jButton2))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(127, 127, 127)
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM VEH";
    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed

        try {
       //REGISTER
            Class.forName("com.mysql.jdbc.Driver");
               //Class.forName("java.sql.driver");

            //CONNECTION
       String db_url="jdbc:mysql://localhost:3306/travelagency";
       String pwd="arjun";
       String user="root";

       Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);

       //EXECUTED QUERIES
        stmt=(Statement) conn.createStatement();

          rs=stmt.executeQuery( SQL);

int no=Integer.parseInt(jTextField1.getText());
String name=jTextField2.getText();
String dis1=jTextField3.getText();
String type=jTextField4.getText();
int price=Integer.parseInt(jTextField5.getText());
String cap=jTextField6.getText();
String bno=jTextField7.getText();
String date=jTextField8.getText();
int pbook=Integer.parseInt(jTextField9.getText());
int status=Integer.parseInt(jTextField10.getText());
          String ISSUE=jTextField11.getText();
int then=JOptionPane.showConfirmDialog(null,"ARE YOU REALLY WANT TO SAVE THIS RECORD","FOR CONFORMATION",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

if(then==JOptionPane.YES_OPTION){
     String ssql="DELETE FROM VEH WHERE v_no="+(no)+"";
  int rowsEffected = stmt.executeUpdate(ssql);
 JOptionPane.showMessageDialog(this,JOptionPane.INFORMATION_MESSAGE +" THE VEHICLE RECORD IS UPDATED TO RECORD "+'\n'+ "ALL TRANSACTION WITH DATABASE IS DONE");

  }
}
catch(Exception e) {
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
                   }
}//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
        //new MainUI().setVisible(true);
}//GEN-LAST:event_cmdExitActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
 DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        try {
       //REGISTER
            Class.forName("com.mysql.jdbc.Driver");
               //Class.forName("java.sql.driver");

            //CONNECTION
       String db_url="jdbc:mysql://localhost:3306/travelagency";
       String pwd="arjun";
       String user="root";

       Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);

       //EXECUTED QUERIES
        stmt=(Statement) conn.createStatement();

          rs=stmt.executeQuery( SQL);

  dModel.removeAllElements( );
    jList1.setModel(dModel);

  while(rs.next()) {
                String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                  String issue= rs.getString("issue_status");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);

jTextField1.setText(""+no);
jTextField2.setText(""+name);
jTextField3.setText(""+disc);
jTextField4.setText(""+type);
jTextField5.setText(""+price);
jTextField6.setText(""+cap);
jTextField7.setText(""+batchno);
 jTextField8.setText(""+date);
jTextField9.setText(""+bPrice);
jTextField10.setText(""+st);
   jTextField11.setText(""+issue);
   jTextField12.setText(""+no);
           dModel.addElement(no + "- " + name);
   }
         jList1.setModel(dModel);
        }
catch(Exception e) {
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
                   }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MAINFORM().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
 String MPub = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as roll number into a variable
        String PubN =MPub.trim().substring(0, 4);
        String query = "SELECT * FROM VEH WHERE v_no = " + PubN + ";";
        try {
            // Connect to MySQL database
            // Don't forget to import the two packages
            //  import java.sql.*;
            //  import javax.swing.JOptionPane;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/travelagency","root","arjun");
            // Create SQL statement and execute query.
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                  String issue= rs.getString("issue_status");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);

jTextField12.setText(""+no);
jTextField1.setText(""+no);
jTextField2.setText(""+name);
jTextField3.setText(""+disc);
jTextField4.setText(""+type);
jTextField5.setText(""+price);
jTextField6.setText(""+cap);
jTextField7.setText(""+batchno);
 jTextField8.setText(""+date);
jTextField9.setText(""+bPrice);
jTextField10.setText(""+st);
   jTextField11.setText(""+issue);
            }
            else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN VEH TABLE");
            }

           }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
            e.printStackTrace();
        }
}//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String num=jTextField12.getText();
        try {
            //REGISTER
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("java.sql.driver");

            //CONNECTION
            String db_url="jdbc:mysql://localhost:3306/travelagency";
            String pwd="arjun";
            String user="root";

            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);

            //EXECUTED QUERIES
            stmt=(Statement) conn.createStatement();

            rs=stmt.executeQuery( "SELECT * FROM VEH WHERE V_NO="+num);



            if(rs.next()) {
                String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                String issue= rs.getString("issue_status");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);

                jTextField1.setText(""+no);
                jTextField2.setText(""+name);
                jTextField3.setText(""+disc);
                jTextField4.setText(""+type);
                jTextField5.setText(""+price);
                jTextField6.setText(""+cap);
                jTextField7.setText(""+batchno);
                jTextField8.setText(""+date);
                jTextField9.setText(""+bPrice);
                jTextField10.setText(""+st);
                jTextField11.setText(""+issue);
            }
  else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN VEH TABLE"+'\n'+"THE VEH_NO IS WRONG");
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
            e.printStackTrace();
        }
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delveh().setVisible(true);
            }
        });
    }
    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PubDelUI().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}