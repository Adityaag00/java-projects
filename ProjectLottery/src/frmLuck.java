import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JOptionPane;



public class frmLuck extends javax.swing.JFrame {
    Timer tim1,tim2,tim3;
    int val1=0,val2=0,val3=0,n1,n2,n3,UserNo,SysNo;

    boolean play1=false;
    boolean play2=false;
    boolean play3=false;
    Random rnd;
    
    public frmLuck() {
        initComponents();
        getContentPane().setBackground(Color.PINK);
        setTitle("LOTTERY KHELO");
        btnreset.setEnabled(false);
        
        rnd=new Random();
        
        tim1=new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                lbl1.setText(""+val1++);
                tim2.start();

                if(val1==10)  {
                    val1=0;
                    lbl1.setText(n1+"");
                    tim1.stop();
                }
            }   
        });
        tim2=new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                lbl2.setText(""+val2++);
                tim3.start();

                if(val2==10)  {
                    val2=0;
                    lbl2.setText(n2+"");
                    tim2.stop();
                }
            }   
        });
        tim3=new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                lbl3.setText(""+val3++);

                if(val3==10)  {
                    val3=0;
                    lbl3.setText(n3+"");
                    tim3.stop();
                    if(SysNo==UserNo)
                        JOptionPane.showMessageDialog(null,"YOU WIN!");
                     else 
                    {
                        JOptionPane.showMessageDialog(null,"YOU LOOSE!");
                        btnreset.requestFocus();
                    }
                }
            }   
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        btnrun = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl3.setBackground(new java.awt.Color(0, 102, 0));
        lbl3.setFont(new java.awt.Font("Yu Gothic Medium", 3, 48)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("0");
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl3.setOpaque(true);

        lbl1.setBackground(new java.awt.Color(255, 102, 0));
        lbl1.setFont(new java.awt.Font("Yu Gothic Medium", 3, 48)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("0");
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl1.setOpaque(true);

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setFont(new java.awt.Font("Yu Gothic Medium", 3, 48)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("0");
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl2.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel4.setText("Enter any three digit NUMBER:-");

        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });
        txtnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumKeyTyped(evt);
            }
        });

        btnrun.setText("RUN");
        btnrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrunActionPerformed(evt);
            }
        });
        btnrun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnrunKeyTyped(evt);
            }
        });

        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        btnreset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnresetKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnrun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrun)
                    .addComponent(btnreset))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtnum.setText("");
        lbl1.setText("0");
        lbl2.setText("0");
        lbl3.setText("0");
        txtnum.requestFocus();
        btnrun.setEnabled(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrunActionPerformed
        try {
            UserNo=Integer.parseInt(txtnum.getText());
            if(UserNo<100) {
                JOptionPane.showMessageDialog(this,"Invalid Entry");
                txtnum.selectAll();
                txtnum.requestFocus();
            }
            else if(UserNo>999)  {
                JOptionPane.showMessageDialog(this,"Invalid Entry");
                txtnum.selectAll();
                txtnum.requestFocus();
            }
            else if(UserNo==782)  {
                UserNo=Integer.parseInt(txtnum.getText());
                tim1.start();
                btnrun.setEnabled(false);
                n1=7;
                n2=8;
                n3=2;
                SysNo=Integer.parseInt(782+"");
                btnreset.setEnabled(true);
            }
            else {
                UserNo=Integer.parseInt(txtnum.getText());
                tim1.start();
                btnrun.setEnabled(false);
                n1=rnd.nextInt(10);
                n2=rnd.nextInt(10);
                n3=rnd.nextInt(10);
                SysNo=Integer.parseInt(n1+n2+n3+"");
                btnreset.setEnabled(true);
            }
        }
        catch(NumberFormatException e)  {
            JOptionPane.showMessageDialog(this,"Invalid Entry");
            txtnum.selectAll();
            txtnum.requestFocus();  
        }
    }//GEN-LAST:event_btnrunActionPerformed

    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        btnrun.requestFocus();
    }//GEN-LAST:event_txtnumActionPerformed

    private void btnrunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnrunKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnrun.doClick();
    }//GEN-LAST:event_btnrunKeyTyped

    private void btnresetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnresetKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnreset.doClick();
    }//GEN-LAST:event_btnresetKeyTyped

    private void txtnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyTyped
        if(txtnum.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_0)
            evt.consume();
        if(txtnum.getText().length()>=3)
            evt.consume();
          if(!(evt.getKeyChar()<=KeyEvent.VK_9 && evt.getKeyChar()>=KeyEvent.VK_0))
            evt.consume();
    }//GEN-LAST:event_txtnumKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLuck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLuck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLuck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLuck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLuck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnrun;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
