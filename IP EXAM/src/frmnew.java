
import java.awt.event.KeyEvent;

public class frmnew extends javax.swing.JFrame {
    public frmnew() {
        initComponents();
    }
        void sum() {
        double n1 , n2 , n3 , n4;
        n1=Double.parseDouble(txt1.getText());
        n2=Double.parseDouble(txt2.getText());
        n3=Double.parseDouble(txt3.getText());
        n4=n1+n2+n3;
        are1.append("\n"+n4);
    }
        void max()  {
        double n1 , n2 , n3 , n4;
        n1=Double.parseDouble(txt1.getText());
        n2=Double.parseDouble(txt2.getText());
        n3=Double.parseDouble(txt3.getText());
        if(n1>=n2 && n2>=n3) 
            n4=n1;
        else if(n1>=n3 && n3>=n2)
            n4=n1;
        else if(n2>=n1 && n1>=n3)
            n4=n2;
        else if(n2>=n3 && n3>=n1)
            n4=n2;
        else if(n3>=n2 && n2>=n1)
            n4=n3;
        else
            n4=n3;
        are1.append("\n"+n4);
        }
        void avg() {
        double n1 , n2 , n3 , n4;
        n1=Double.parseDouble(txt1.getText());
        n2=Double.parseDouble(txt2.getText());
        n3=Double.parseDouble(txt3.getText());
        n4=(n1+n2+n3)/3;
        are1.append("\n"+n4);    
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        are1 = new javax.swing.JTextArea();
        btns = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        btnm = new javax.swing.JButton();
        btnr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt1CaretUpdate(evt);
            }
        });
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        are1.setEditable(false);
        are1.setColumns(20);
        are1.setRows(5);
        are1.setFocusable(false);
        jScrollPane1.setViewportView(are1);

        btns.setText("sum");
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });
        btns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnsKeyTyped(evt);
            }
        });

        btna.setText("average");
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
            }
        });
        btna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnaKeyTyped(evt);
            }
        });

        btnm.setText("max");
        btnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmActionPerformed(evt);
            }
        });
        btnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnmKeyTyped(evt);
            }
        });

        btnr.setText("reset");
        btnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrActionPerformed(evt);
            }
        });
        btnr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnrKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btna)
                        .addGap(18, 18, 18)
                        .addComponent(btnm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnr)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed
        avg();
        btnm.requestFocus();
    }//GEN-LAST:event_btnaActionPerformed

    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed
        sum();
        btna.requestFocus();
    }//GEN-LAST:event_btnsActionPerformed

    private void btnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmActionPerformed
        max();
        btnr.requestFocus();
    }//GEN-LAST:event_btnmActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        txt2.requestFocus();
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        btns.requestFocus();
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        txt3.requestFocus();
    }//GEN-LAST:event_txt2ActionPerformed

    private void btnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrActionPerformed
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        are1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrActionPerformed

    private void txt1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt1CaretUpdate
        
    }//GEN-LAST:event_txt1CaretUpdate

    private void btnsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btns.doClick();
    }//GEN-LAST:event_btnsKeyTyped

    private void btnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnaKeyTyped
       if(evt.getKeyChar()==KeyEvent.VK_ENTER)
           btna.doClick();
    }//GEN-LAST:event_btnaKeyTyped

    private void btnmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnm.doClick();
    }//GEN-LAST:event_btnmKeyTyped

    private void btnrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnrKeyTyped
       if(evt.getKeyChar()==KeyEvent.VK_ENTER)
           btnr.doClick();
    }//GEN-LAST:event_btnrKeyTyped

    private void btnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsKeyPressed
     public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea are1;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnm;
    private javax.swing.JButton btnr;
    private javax.swing.JButton btns;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
