
import java.awt.Color;


public class frmcolor extends javax.swing.JFrame {
    int i;
        Color cor;
        Color[] color = new Color[]{Color.RED,Color.BLUE,Color.YELLOW,Color.PINK,Color.MAGENTA,Color.BLACK,new Color(124,29,0)};
    
    public frmcolor() {
        initComponents();
        lstcolor.setSelectedIndex(2);
    }
    
    void color() {
        i=lstcolor.getSelectedIndex();
        switch(i) {
            case 0:
                cor=color[0];
                break;
            case 1:
                cor=color[1];
                break;
            case 2:
                cor=color[2];
                break;
            case 3:
                cor=color[3];
                break;
            case 4:
                cor=color[4];
                break;
            case 5:
                cor=color[5];
                break;
            case 6:
                cor=color[6];
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        chklbl = new javax.swing.JCheckBox();
        chktxt = new javax.swing.JCheckBox();
        chkbtn = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstcolor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl.setText("LABEL");
        lbl.setOpaque(true);

        btn.setText("BUTTON");

        txt.setEditable(false);
        txt.setText("TextField");

        chklbl.setText("Apply on label");
        chklbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chklblActionPerformed(evt);
            }
        });

        chktxt.setText("Apply on Textfield");
        chktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chktxtActionPerformed(evt);
            }
        });

        chkbtn.setText("Apply on button");
        chkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnActionPerformed(evt);
            }
        });

        lstcolor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Red", "Blue", "Yellow", "Pink", "Magenta", "Black", "Brown" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstcolor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstcolorValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstcolor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(chklbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chktxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn)
                        .addGap(28, 28, 28)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chklbl)
                    .addComponent(chktxt)
                    .addComponent(chkbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chklblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chklblActionPerformed
        color();
        if(chklbl.isSelected()) {
           lbl.setBackground(cor);
        }
       else {
           lbl.setBackground(null);
       }
    }//GEN-LAST:event_chklblActionPerformed

    private void chktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chktxtActionPerformed
        color();
        if(chktxt.isSelected()) {
            txt.setBackground(cor);
        }
       else {
            txt.setBackground(null);
        }
    }//GEN-LAST:event_chktxtActionPerformed

    private void chkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnActionPerformed
       color();
       if(chkbtn.isSelected()) {
           btn.setBackground(cor);
       }
       else {
           btn.setBackground(null);
       }
    }//GEN-LAST:event_chkbtnActionPerformed

    private void lstcolorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstcolorValueChanged
        color();
        if(chklbl.isSelected()) {
            lbl.setBackground(cor);
       }
        else {
            lbl.setBackground(null);
       }
        if(chkbtn.isSelected()) {
            btn.setBackground(cor);
       }
        else {
            btn.setBackground(null);
        }
        if(chktxt.isSelected()) {
            txt.setBackground(cor);
        }
        else {
            txt.setBackground(null);
        }
    }//GEN-LAST:event_lstcolorValueChanged

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
            java.util.logging.Logger.getLogger(frmcolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcolor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcolor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JCheckBox chkbtn;
    private javax.swing.JCheckBox chklbl;
    private javax.swing.JCheckBox chktxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JList<String> lstcolor;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
