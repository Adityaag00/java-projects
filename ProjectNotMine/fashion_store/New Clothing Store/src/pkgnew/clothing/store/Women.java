/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.clothing.store;

/**
 *
 * @author manjeet
 */
public class Women extends javax.swing.JFrame {

    /**
     * Creates new form Women
     */
    public Women() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        accessories = new javax.swing.JButton();
        dresses = new javax.swing.JButton();
        jackets = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 710));
        getContentPane().setLayout(null);

        accessories.setBackground(new java.awt.Color(175, 12, 93));
        accessories.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        accessories.setText("ACCESSORIES");
        accessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessoriesActionPerformed(evt);
            }
        });
        getContentPane().add(accessories);
        accessories.setBounds(770, 0, 230, 60);

        dresses.setBackground(new java.awt.Color(175, 12, 93));
        dresses.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        dresses.setText("DRESSES");
        dresses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dressesActionPerformed(evt);
            }
        });
        getContentPane().add(dresses);
        dresses.setBounds(390, 0, 240, 60);

        jackets.setBackground(new java.awt.Color(175, 12, 93));
        jackets.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jackets.setText("JACKETS/COATS");
        jackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jacketsActionPerformed(evt);
            }
        });
        getContentPane().add(jackets);
        jackets.setBounds(30, 0, 250, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/SW_Environmental_Flash.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 340, 240, 340);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/500x_freepeoplecover325.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 330, 280, 350);

        jLabel6.setBackground(new java.awt.Color(204, 0, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/Charlotte-Casiraghi-Gucci-Forever-Now-01.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 70, 420, 250);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/large_640x_83d3263a9ba028ed9d2338dc0e990930eddccff2_page0025.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 340, 290, 330);

        jLabel8.setBackground(new java.awt.Color(204, 0, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/13581-women-s-accessories-spring-2013.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(530, 70, 460, 250);

        jLabel1.setBackground(new java.awt.Color(175, 12, 93));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/little_heart_with_pink_background-wide.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1040, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jacketsActionPerformed
        // TODO add your handling code here:
        jackets_f a = new jackets_f();
        a.setVisible(true);
    }//GEN-LAST:event_jacketsActionPerformed

    private void dressesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dressesActionPerformed
        // TODO add your handling code here:
        dresses_f a = new dresses_f();
        a.setVisible(true);
               
    }//GEN-LAST:event_dressesActionPerformed

    private void accessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessoriesActionPerformed
        // TODO add your handling code here:
        accessories_f a = new accessories_f();
        a.setVisible(true);
    }//GEN-LAST:event_accessoriesActionPerformed

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
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Women().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accessories;
    private javax.swing.JButton dresses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JButton jackets;
    // End of variables declaration//GEN-END:variables
}
