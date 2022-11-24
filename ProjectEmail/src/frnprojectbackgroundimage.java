
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;
        
public class frnprojectbackgroundimage extends javax.swing.JFrame {
    boolean play=false,play1=false;
    Timer tim1,tim2;
    
    public frnprojectbackgroundimage() {
        initComponents();
        setSize(681, 400);
        LabelBackGround.setSize(681,400);
        
        
        tim1=new Timer(8000,new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                if(isTrue()) {  
                    MsgDia.pack();
                    MsgDia.setLocationRelativeTo(null);
                    MsgDia.setVisible(true);
                    LabelMsg.setText("User Id and Password you entered is Correct"); 
                    msgdia1.dispose();
                    tim1.stop();
                } 
         
                else {
                    MsgDia.pack();
                    MsgDia.setLocationRelativeTo(null);
                    MsgDia.setVisible(true);
                    LabelMsg.setText("User Id and Password you entered is WRONG!!!");
                    msgdia1.dispose();
                    tim1.stop();
               }
            } 
        });
        tim2=new Timer(8000,new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                if(isInvalid()) {  
                    msgdia3.pack();
                    msgdia3.setLocationRelativeTo(null);
                    msgdia3.setVisible(true);
                    lbl2.setText("Please Fill The Respective Columns Carefully"); 
                    msgdia2.dispose();
                    tim2.stop();
                } 
         
                else {
                   msgdia2.dispose();
                   tim2.stop();
                   msgdia3.pack();
                  msgdia3.setLocationRelativeTo(null);
                  msgdia3.setVisible(true);
                  lbl2.setText("Mail Sent......");
                }
            } 
        });
    }
    boolean isTrue() {
        String user,pwd;
        user = txtUser.getText();
        pwd=new String(pwdlogin.getPassword());
        if((user.equals("Aditya")&&pwd.equals("Genius")) || (user.equals("Roman")&&pwd.equals("Reigns")) )
            return true;
        else
            return false;
    }
   
    boolean isInvalid() {
        if(txtto.getText().trim().isEmpty() || txtfrom.getText().trim().isEmpty() || txtsub.getText().trim().isEmpty() || tamail.getText().trim().isEmpty())   
            return true ;
        else
            return false;
        } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MsgDia = new javax.swing.JDialog();
        LabelMsg = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();
        frm3 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtto = new javax.swing.JTextField();
        txtfrom = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tamail = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        msgdia1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        msgdia3 = new javax.swing.JDialog();
        lbl2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        msgdia2 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pwdlogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        LabelBackGround = new javax.swing.JLabel();

        LabelMsg.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N

        btnok.setText("Okay");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        btnok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnokKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout MsgDiaLayout = new javax.swing.GroupLayout(MsgDia.getContentPane());
        MsgDia.getContentPane().setLayout(MsgDiaLayout);
        MsgDiaLayout.setHorizontalGroup(
            MsgDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MsgDiaLayout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(btnok)
                .addGap(20, 20, 20))
        );
        MsgDiaLayout.setVerticalGroup(
            MsgDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MsgDiaLayout.createSequentialGroup()
                .addComponent(LabelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btnok)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel3.setText("To:");

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel4.setText("From:");

        jLabel5.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel5.setText("Sub:");

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel6.setText("Mail:");

        tamail.setColumns(20);
        tamail.setLineWrap(true);
        tamail.setRows(5);
        tamail.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tamail);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frm3Layout = new javax.swing.GroupLayout(frm3.getContentPane());
        frm3.getContentPane().setLayout(frm3Layout);
        frm3Layout.setHorizontalGroup(
            frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frm3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(frm3Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frm3Layout.createSequentialGroup()
                        .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsub, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frm3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        frm3Layout.setVerticalGroup(
            frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frm3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new ImageIcon("src\\ajax-loader(1).gif"));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Verifying...");

        javax.swing.GroupLayout msgdia1Layout = new javax.swing.GroupLayout(msgdia1.getContentPane());
        msgdia1.getContentPane().setLayout(msgdia1Layout);
        msgdia1Layout.setHorizontalGroup(
            msgdia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdia1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgdia1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        msgdia1Layout.setVerticalGroup(
            msgdia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdia1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
        );

        lbl2.setFont(new java.awt.Font("Elephant", 0, 17)); // NOI18N

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout msgdia3Layout = new javax.swing.GroupLayout(msgdia3.getContentPane());
        msgdia3.getContentPane().setLayout(msgdia3Layout);
        msgdia3Layout.setHorizontalGroup(
            msgdia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdia3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgdia3Layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        msgdia3Layout.setVerticalGroup(
            msgdia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdia3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new ImageIcon("src\\ajax-loader(1).gif"));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sending....");

        javax.swing.GroupLayout msgdia2Layout = new javax.swing.GroupLayout(msgdia2.getContentPane());
        msgdia2.getContentPane().setLayout(msgdia2Layout);
        msgdia2Layout.setHorizontalGroup(
            msgdia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdia2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(msgdia2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        msgdia2Layout.setVerticalGroup(
            msgdia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdia2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(681, 339));
        setResizable(false);
        getContentPane().setLayout(null);

        pwdlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdloginActionPerformed(evt);
            }
        });
        getContentPane().add(pwdlogin);
        pwdlogin.setBounds(510, 170, 120, 20);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 110, 90, 30);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(510, 110, 120, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 160, 100, 30);

        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnLoginKeyTyped(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(560, 230, 70, 30);

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(560, 280, 70, 23);

        jButton5.setText("$$");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(640, 170, 20, 23);

        LabelBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black-and-white-city-skyline-buildings.jpg"))); // NOI18N
        LabelBackGround.setOpaque(true);
        getContentPane().add(LabelBackGround);
        LabelBackGround.setBounds(0, 0, 680, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pwdloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdloginActionPerformed
        btnLogin.requestFocus();
    }//GEN-LAST:event_pwdloginActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        msgdia1.pack();
        msgdia1.setLocationRelativeTo(this);
        msgdia1.setVisible(true);
        
        if(! play) {
           tim1.start();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        pwdlogin.setEchoChar((char)0);
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        pwdlogin.setEchoChar('*');
    }//GEN-LAST:event_jButton5MouseReleased

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
       
           
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        pwdlogin.requestFocus();
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyTyped
       if(evt.getKeyChar()==KeyEvent.VK_ENTER)
           btnLogin.doClick();
        
    }//GEN-LAST:event_btnLoginKeyTyped

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
       if(isTrue()) {
         frm3.pack();
         frm3.setVisible(true);
         frm3.setLocationRelativeTo(this);
         MsgDia.dispose();
       }
       else
           txtUser.setText("");
           pwdlogin.setText("");
           MsgDia.dispose();
           
    }//GEN-LAST:event_btnokActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnokKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnok.doClick();
    }//GEN-LAST:event_btnokKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         msgdia2.pack();
         msgdia2.setLocationRelativeTo(this);
         msgdia2.setVisible(true);
         
         if(! play1) {
            tim2.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frnprojectbackgroundimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frnprojectbackgroundimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frnprojectbackgroundimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frnprojectbackgroundimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frnprojectbackgroundimage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBackGround;
    private javax.swing.JLabel LabelMsg;
    private javax.swing.JDialog MsgDia;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnok;
    private javax.swing.JFrame frm3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JDialog msgdia1;
    private javax.swing.JDialog msgdia2;
    private javax.swing.JDialog msgdia3;
    private javax.swing.JPasswordField pwdlogin;
    private javax.swing.JTextArea tamail;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtfrom;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txtto;
    // End of variables declaration//GEN-END:variables

    private void setPreferredSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
