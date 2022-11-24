import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmSearch extends javax.swing.JFrame {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    

    public frmSearch() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC registered");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","tiger");
            System.out.println("Connection established");
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbField = new javax.swing.JComboBox<>();
        cmbOperation = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCriteria = new javax.swing.JTextField();
        btnEmpty = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRec = new javax.swing.JTable();
        lblOutput = new javax.swing.JLabel();

        jProgressBar1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(153, 255, 153));
        jProgressBar1.setValue(80);
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Specify Search Criteria Below");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Field");

        cmbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno" }));
        cmbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFieldActionPerformed(evt);
            }
        });

        cmbOperation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "<=", ">=", "!=" }));
        cmbOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperationActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Criteria");

        txtCriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriteriaActionPerformed(evt);
            }
        });

        btnEmpty.setText("Empty Table");
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });

        btnSearch.setText("Search in Database");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmpty)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(cmbOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txtCriteria)))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpty)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        DefaultTableModel tblempty=(DefaultTableModel)tblRec.getModel();
        int row= tblempty.getRowCount();
        for(int i=0;i<row;i++){
           tblempty.removeRow(0);
        }
         lblOutput.setText(""+tblRec.getRowCount()+"Rows Fetched");
        
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtCriteria.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(this,"Please fill criteria before searching");
        else{
            try{
                DefaultTableModel tbladd = (DefaultTableModel)tblRec.getModel();
                if(tbladd.getRowCount()!=0)
                    btnEmpty.doClick();
                rs=stmt.executeQuery("select*from empl where "+cmbField.getSelectedItem()+" "+cmbOperation.getSelectedItem()+" '"+txtCriteria.getText()+"' ;");
                System.out.println("query run");
             
                while(rs.next()){
                    int empno=rs.getInt("empno");
                    String ename =rs.getString("ename");
                    String job =rs.getString("job");
                    int mgr=rs.getInt("mgr");
                    Date hire=rs.getDate("hiredate");
                    Double sal=rs.getDouble("sal");
                    Double com=rs.getDouble("comm");
                    Double deptno=rs.getDouble("deptno");
                    Object obj[]=new Object[]{empno,ename,job,mgr,hire,sal,com,deptno};
                    tbladd.addRow(obj); 
                    
                    System.out.println("query run loop");
                }
                 lblOutput.setText(""+tblRec.getRowCount());
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperationActionPerformed
        if(txtCriteria.getText().isEmpty()==false)
          btnSearch.doClick();
        lblOutput.setText(""+tblRec.getRowCount());
    }//GEN-LAST:event_cmbOperationActionPerformed

    private void txtCriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriteriaActionPerformed
        
    }//GEN-LAST:event_txtCriteriaActionPerformed

    private void cmbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFieldActionPerformed
       
    }//GEN-LAST:event_cmbFieldActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbField;
    private javax.swing.JComboBox<String> cmbOperation;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTable tblRec;
    private javax.swing.JTextField txtCriteria;
    // End of variables declaration//GEN-END:variables
}
