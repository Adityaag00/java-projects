import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pcgameslist.java
 *
 * Created on Jan 2, 2012, 6:09:16 PM
 */

/**
 *
 * @author RAJESH HUMAR
 */
public class pcgameslist extends javax.swing.JFrame {
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
String DB="jdbc:mysql://localhost/board_project";
    /** Creates new form pcgameslist */
    public pcgameslist() {
        initComponents();
    DefaultTableModel tab = (DefaultTableModel) table.getModel();
     try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection(DB,"root","kvuc");
stmt=con.createStatement();
rs=stmt.executeQuery("select  *from lib where btitle like 'pcgames%' ;");
String n,d,c,e;
while (rs.next())
{  n =  rs.getString(1);
 d = rs.getString(3);
 c = rs.getString(8);
 e = rs.getString(7);
Object rec[]={n,d,c,e};
tab.addRow(rec);
}
rs.close();
stmt.close();
con.close();
}
catch (Exception e)
{ JOptionPane.showMessageDialog(null,"Error in Connection"); }  }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        exit = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List of PC Games Available in Library");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText(" LISTS OF P C GAMES ");

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCESSION NO.", "NAME", "RELEASE DATE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        exit.setBackground(new java.awt.Color(204, 204, 255));
        exit.setFont(new java.awt.Font("Bauhaus 93", 1, 36));
        exit.setForeground(new java.awt.Color(0, 0, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_exitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pcgameslist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
