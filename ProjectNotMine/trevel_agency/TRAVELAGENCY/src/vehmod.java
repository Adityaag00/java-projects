import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PubEditUI.java
 *
 * Created on May 2, 2010, 1:43:56 PM
 */

/**
 *
 * @author xp_system
 */
public class vehmod extends javax.swing.JFrame {

    /** Creates new form PubEditUI */
    public vehmod() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        cmdUpdate = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        GETREC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MODIFICATION VEH");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT A VEHICLE");

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("PLEASE WRITE THE VEH NO OF THE VEH TO BE UPDATED / SELECT FROM LIST");

        GETREC.setText("GET RECORD");
        GETREC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GETRECActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(cmdUpdate)
                        .addGap(46, 46, 46)
                        .addComponent(GETREC)
                        .addGap(65, 65, 65)
                        .addComponent(cmdExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel13)
                        .addGap(53, 53, 53)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(565, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(562, 562, 562))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2))
                    .addGap(69, 69, 69)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(687, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdExit)
                    .addComponent(jButton1)
                    .addComponent(GETREC))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(128, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM VEH";
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

   while (rs.next()) {
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

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
        //new MainUI().setVisible(true);
    }//GEN-LAST:event_cmdExitActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed

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
     String ssql="UPDATE VEH SET  v_name='"+(name)+"', otr_disc='"+(dis1)+"' ,type='"+(type)+"' , price="+(price)+", v_cap='"+(cap)+"', batchno='"+(bno)+"', pdate='"+(date)+"', rs_book ="+(pbook)+", status="+(status)+" ,issue_status='"+ISSUE+"' where V_no = " + (no);
  int rowsEffected = stmt.executeUpdate(ssql);
 JOptionPane.showMessageDialog(this," THE VEHICLE RECORD IS UPDATED TO RECORD "+'\n'+ "ALL TRANSACTION WITH DATABASE IS DONE","",JOptionPane.INFORMATION_MESSAGE );

  }
}
catch(Exception e) {
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
                   }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MAINFORM().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void GETRECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GETRECActionPerformed
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



}
catch(Exception e) {
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
                   }
     // TODO add your handling code here:
    }//GEN-LAST:event_GETRECActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehmod().setVisible(true);
            }
        });
    }
    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PubEditUI().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GETREC;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton jButton1;
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
