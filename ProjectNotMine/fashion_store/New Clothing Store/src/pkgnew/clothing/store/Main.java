
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.clothing.store;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author manjeet
 */
public class Main extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
String e,p;
int c;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signup = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        paswd = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        mbanner = new javax.swing.JLabel();
        registered = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        SignIn = new javax.swing.JButton();
        signbox = new javax.swing.JLabel();
        Men = new javax.swing.JButton();
        Women = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1340, 840));
        setMinimumSize(new java.awt.Dimension(1080, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signup.setForeground(new java.awt.Color(204, 204, 204));
        signup.setText("New User?");
        getContentPane().add(signup);
        signup.setBounds(300, 390, 80, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(300, 320, 190, 30);

        paswd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paswd.setForeground(new java.awt.Color(204, 204, 204));
        paswd.setText("Password:");
        getContentPane().add(paswd);
        paswd.setBounds(300, 290, 100, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 250, 190, 30);

        user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setText("Username:");
        getContentPane().add(user);
        user.setBounds(300, 220, 70, 30);

        mbanner.setBackground(new java.awt.Color(0, 255, 255));
        mbanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/banner.png"))); // NOI18N
        mbanner.setOpaque(true);
        getContentPane().add(mbanner);
        mbanner.setBounds(20, 10, 1040, 130);

        registered.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registered.setForeground(new java.awt.Color(204, 204, 204));
        registered.setText("* For Registered Users Only");
        getContentPane().add(registered);
        registered.setBounds(890, 150, 170, 20);

        signin.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        signin.setForeground(new java.awt.Color(204, 204, 204));
        signin.setText("Sign In");
        getContentPane().add(signin);
        signin.setBounds(290, 180, 170, 40);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("our store.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 430, 70, 16);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Create your account now to get access to");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 410, 260, 20);

        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        getContentPane().add(signUp);
        signUp.setBounds(300, 460, 80, 28);

        SignIn.setText("Sign In");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn);
        SignIn.setBounds(300, 360, 80, 28);

        signbox.setBackground(new java.awt.Color(153, 204, 255));
        signbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/ghdghm.png"))); // NOI18N
        signbox.setOpaque(true);
        getContentPane().add(signbox);
        signbox.setBounds(290, 180, 480, 330);

        Men.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/2011-font-b-winter-b-font-male-font-b-urban-b-font-casual-straight-100-cotton.jpg"))); // NOI18N
        Men.setText("Enter Men Section");
        Men.setToolTipText("Click to enter");
        Men.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Men.setEnabled(false);
        Men.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenActionPerformed(evt);
            }
        });
        getContentPane().add(Men);
        Men.setBounds(30, 180, 230, 330);

        Women.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/blooming silk mini dress.jpg"))); // NOI18N
        Women.setText("Enter Women Section");
        Women.setToolTipText("Click to enter");
        Women.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Women.setEnabled(false);
        Women.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WomenActionPerformed(evt);
            }
        });
        getContentPane().add(Women);
        Women.setBounds(810, 180, 240, 330);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 840);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/floraltexture-97034.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1080, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WomenActionPerformed
        // TODO add your handling code here:
        Women y;
        y = new Women();
        y.setVisible(true);
        
    }//GEN-LAST:event_WomenActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
        sign_up m;
        m = new sign_up();
        m.setVisible(true);
    }//GEN-LAST:event_signUpActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
        String email = jTextField1.getText();
        String pass = new String(jPasswordField1.getPassword());
        try{Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/menagerie?user=root&password=tiger");
        stmt= con.createStatement();
        rs = stmt.executeQuery("select * from sign_up where email='"+ email +"' ;");
        while(rs.next()){
        String p = rs.getString("password");
        if(p.equals(pass)){Men.setEnabled(true);
        Women.setEnabled(true);
        JOptionPane.showMessageDialog(null,"You Have Signed In Successfully"); }
        else {JOptionPane.showConfirmDialog(null,"Username Or Password Is Incorrect!",null,-1,0);}
        }
     //rs.close();
     stmt.close();
     con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
        
        
        
        
        
    }//GEN-LAST:event_SignInActionPerformed

    private void MenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenActionPerformed
        // TODO add your handling code here:
        Men x;
        x = new Men();
        x.setVisible(true);
    }//GEN-LAST:event_MenActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Men;
    private javax.swing.JButton SignIn;
    private javax.swing.JButton Women;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mbanner;
    private javax.swing.JLabel paswd;
    private javax.swing.JLabel registered;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel signbox;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}