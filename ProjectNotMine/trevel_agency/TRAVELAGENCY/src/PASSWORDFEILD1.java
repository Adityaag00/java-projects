/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * PASSWORDFEILD.java
 *
 * Created on Jan 7, 2006, 2:47:42 PM
 */

/**
 *
 * @author ARJUN
 */
public class PASSWORDFEILD1 extends javax.swing.JFrame {

    /** Creates new form PASSWORDFEILD */
    public PASSWORDFEILD1() {
        initComponents();
    }

    PASSWORDFEILD1(int x) {


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        INTO = new javax.swing.JButton();
        TOMEMBERSHIPPge = new javax.swing.JButton();
        tomainpage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN FORM");

        jLabel1.setText("YOUR ID NO(STATUS).");

        jLabel2.setText("USER NAME");

        INTO.setText("OK");
        INTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INTOActionPerformed(evt);
            }
        });

        TOMEMBERSHIPPge.setText("BACK TO MAIN PAGE");
        TOMEMBERSHIPPge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOMEMBERSHIPPgeActionPerformed(evt);
            }
        });

        tomainpage.setText("BACK TO MAIN FORM");
        tomainpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomainpageActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bugatti.jpg"))); // NOI18N

        jLabel4.setText("YOUR MEMB NO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TO ADD RECORD OF NEW VEH", "TO UPDATE REC OF NEW VEH", "TO DEL REC OF NEW VEH", "TO ADD NEW COMPANY VEH(TYPE)", "TO UPDATE ABOUT  COMPANY(TYPE)", "TO DELETE COMPANY REC(TYPE)" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECT THE TYPE OF TASK"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(INTO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tomainpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
                            .addComponent(TOMEMBERSHIPPge)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INTO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tomainpage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TOMEMBERSHIPPge, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   Statement stmt = null;
    ResultSet rs = null;        // ResultSet for publisher table.
    String sql = null;
    private void TOMEMBERSHIPPgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOMEMBERSHIPPgeActionPerformed
       new mainpage().setVisible(true);
        this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_TOMEMBERSHIPPgeActionPerformed

    private void tomainpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomainpageActionPerformed
        new MAINFORM().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_tomainpageActionPerformed

    private void INTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INTOActionPerformed
 int idno=0;
String name = null;
 String dno=null;
        try {

            //REGISTER
           Class.forName("com.mysql.jdbc.Driver");
             //Class.forName("java.sql.driver");

              //CONNECTION
           Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/travelagency","root","arjun");

           //EXECUTE QUERY
           stmt = con.createStatement();
             String no=jTextField2.getText();
           rs = stmt.executeQuery("SELECT * FROM MMember WHERE MEMB_NO="+no);

     
            while (rs.next()) {
            name=rs.getString("memb_name");
               idno=rs.getInt("mem_status");
                    dno=""+idno;
                              }

    String pw=new String(jPasswordField1.getPassword());
 String UNAME=jTextField1.getText();
 int x=jComboBox1.getSelectedIndex();
 if(UNAME.equals(name) && pw.equals(dno)){
    if(x==0) {
       new vehcon().setVisible(true);
   this.setVisible(false);}
 else
   if(x==2) {
       new delveh().setVisible(true);
   this.setVisible(false);}
 else
   if(x==1) {
       new vehmod().setVisible(true);
   this.setVisible(false);}

   else
    if(x==3) {
       new TYPECON().setVisible(true);
   this.setVisible(false);}
 else
   if(x==5) {
       new TYPEDELETION().setVisible(true);
   this.setVisible(false);}
 else
   if(x==4) {
       new TYPEMOD().setVisible(true);
   this.setVisible(false);}

                                         
    }
 

 else 
 
            //REGISTER
         JOptionPane.showMessageDialog(null, "YOU ARE NOT AUTHORISED TO DO THIS OR "+'\n'+"PLEASE TYPE THE CORRECT PASSWORD AND I.D NO");

   
                                         
     // int x=jComboBox1.getSelectedIndex();
//jTextField1.setText(""+x);
        }


catch(Exception e){
  JOptionPane.showMessageDialog(null , e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
      e.printStackTrace();
                  }    // TODO add your handling code here:
    }//GEN-LAST:event_INTOActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PASSWORDFEILD1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INTO;
    private javax.swing.JButton TOMEMBERSHIPPge;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton tomainpage;
    // End of variables declaration//GEN-END:variables





}
