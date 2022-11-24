import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class frmAddBook extends javax.swing.JFrame {
    int counter=0;
    public frmAddBook() {
        initComponents();
        txtName.requestFocus();
        txtSNo.setEditable(false);
        txtSNo.setText(""+(++counter));
    }
    boolean checkValue()
    {
        if(txtName.getText().isEmpty() || txtEMail.getText().isEmpty() || 
                txtPhone.getText().isEmpty())
            return false;
        else
            return true;
    }

    void clearFields()
    {
        txtName.setText("");
        txtEMail.setText("");
        txtPhone.setText("");
        txtName.requestFocus();
    }

    void clearRecord() {
        if(tblAddBook.getRowCount()>0 && tblAddBook.getSelectedRow()!=-1) {
            DefaultTableModel tblModel=(DefaultTableModel)tblAddBook.getModel();
            tblModel.removeRow(tblAddBook.getSelectedRow());
        }
        else
            JOptionPane.showMessageDialog(this,"Please select a record...","Error",JOptionPane.ERROR_MESSAGE);
    }

    void showStatistics()
    {
        JOptionPane.showMessageDialog(this,"There are "+tblAddBook.getRowCount()+" records","Table Info",JOptionPane.INFORMATION_MESSAGE);
    }

    void addRecord() {
        if(checkValue()) {
            Object []newrow={txtSNo.getText(),txtName.getText(),txtEMail.getText(),txtPhone.getText()};
            DefaultTableModel tblModel=(DefaultTableModel)tblAddBook.getModel();
            tblModel.addRow(newrow);
            clearFields();
            txtSNo.setText(""+(++counter));
        }
        else {
            JOptionPane.showMessageDialog(this,"Please fill all the values...","Error",JOptionPane.ERROR_MESSAGE);
            txtName.requestFocus();
        }
    }

    void search() {
        int i;
        String valAt;
        if(txtSearch.getText().isEmpty() || txtValue.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please fill all the values...","Error",JOptionPane.ERROR_MESSAGE);
            txtSearch.requestFocus();
        }
        else if(tblAddBook.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this,"Please enter some records, Table Empty !!!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                int colno=Integer.parseInt(txtSearch.getText());
                String val=txtValue.getText();
                if(colno>0 && colno<=tblAddBook.getColumnCount())
                {
                    for(i=0,--colno;i<tblAddBook.getRowCount();i++)  
                    {
                        valAt=(String)tblAddBook.getValueAt(i,colno);
                        if(val.equals(valAt))
                        {
                            JOptionPane.showMessageDialog(this,"Found at Record no: "+(i+1),"Found",JOptionPane.INFORMATION_MESSAGE);
                       
                            break;
                        }
                    }

                    if(i==tblAddBook.getRowCount())
                            JOptionPane.showMessageDialog(this,"Record with this value doesn't exist","Failed",JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    JOptionPane.showMessageDialog(this,"Column no=> "+colno+" doesn't exist","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this,"Please enter valid values...","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    void exiting()
    {                             
        int res;
        res=JOptionPane.showConfirmDialog(this,"Are you sure to exit??","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_OPTION)
            System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddBook = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnStat = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSNo = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEMail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtValue = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        tlbAdd = new javax.swing.JButton();
        tlbClear = new javax.swing.JButton();
        tlbStat = new javax.swing.JButton();
        tlbSearch = new javax.swing.JButton();
        tlbExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        miAdd = new javax.swing.JMenuItem();
        miClear = new javax.swing.JMenuItem();
        miStat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        mEdit = new javax.swing.JMenu();
        miSearch = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tblAddBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No.", "Name", "E-Mail ID", "Phone"
            }
        ));
        tblAddBook.setName(""); // NOI18N
        tblAddBook.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblAddBook.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAddBook);

        btnAdd.setText("Add Record");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnAddKeyTyped(evt);
            }
        });

        btnClear.setText("Clear record");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnStat.setText("Statistics");
        btnStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("S No.  :");

        jLabel2.setText("Name  :");

        jLabel3.setText("E-Mail ID  :");

        jLabel4.setText("Phone  :");

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtEMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEMailKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEMail)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addGap(12, 12, 12)
                        .addComponent(btnStat)
                        .addGap(12, 12, 12)
                        .addComponent(btnExit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Search In Which Column(2/3/4) ?");

        jLabel6.setText("Search Value  :");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        tlbAdd.setIcon(new ImageIcon("src\\Z(3).png"));
        tlbAdd.setToolTipText("Addi Record");
        tlbAdd.setFocusable(false);
        tlbAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbAddActionPerformed(evt);
            }
        });
        jToolBar1.add(tlbAdd);

        tlbClear.setIcon(new ImageIcon("src\\9k=.png"));
        tlbClear.setToolTipText("Clear The Selected Record");
        tlbClear.setFocusable(false);
        tlbClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbClearActionPerformed(evt);
            }
        });
        jToolBar1.add(tlbClear);

        tlbStat.setIcon(new ImageIcon("src\\Z(2).png"));
        tlbStat.setToolTipText("Show Statistics");
        tlbStat.setFocusable(false);
        tlbStat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbStat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbStatActionPerformed(evt);
            }
        });
        jToolBar1.add(tlbStat);

        tlbSearch.setIcon(new ImageIcon("src\\Z(1).png"));
        tlbSearch.setToolTipText("Search Value In Record");
        tlbSearch.setFocusable(false);
        tlbSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbSearchActionPerformed(evt);
            }
        });
        jToolBar1.add(tlbSearch);

        tlbExit.setIcon(new ImageIcon("src\\Z.png"));
        tlbExit.setToolTipText("Exit Application");
        tlbExit.setFocusable(false);
        tlbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbExitActionPerformed(evt);
            }
        });
        jToolBar1.add(tlbExit);

        mFile.setMnemonic('F');
        mFile.setText("File");

        miAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        miAdd.setMnemonic('A');
        miAdd.setText("Add Record");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        mFile.add(miAdd);

        miClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        miClear.setMnemonic('C');
        miClear.setText("Clear Record");
        miClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClearActionPerformed(evt);
            }
        });
        mFile.add(miClear);

        miStat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        miStat.setMnemonic('T');
        miStat.setText("Statistics");
        miStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStatActionPerformed(evt);
            }
        });
        mFile.add(miStat);
        mFile.add(jSeparator1);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        miExit.setMnemonic('E');
        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        mFile.add(miExit);

        jMenuBar1.add(mFile);

        mEdit.setMnemonic('D');
        mEdit.setText("Edit");

        miSearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSearch.setMnemonic('S');
        miSearch.setText("Search");
        miSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchActionPerformed(evt);
            }
        });
        mEdit.add(miSearch);

        jMenuBar1.add(mEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnSearch)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
      addRecord();
    }//GEN-LAST:event_miAddActionPerformed

    private void miClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClearActionPerformed
        clearRecord();
    }//GEN-LAST:event_miClearActionPerformed

    private void tlbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbAddActionPerformed
        addRecord();
    }//GEN-LAST:event_tlbAddActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        exiting();
    }//GEN-LAST:event_miExitActionPerformed

    private void tlbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbClearActionPerformed
        clearRecord();
    }//GEN-LAST:event_tlbClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
    }//GEN-LAST:event_formWindowClosing

    private void tlbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbExitActionPerformed
        exiting();
    }//GEN-LAST:event_tlbExitActionPerformed

    private void miStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStatActionPerformed
        showStatistics();
    }//GEN-LAST:event_miStatActionPerformed

    private void btnStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatActionPerformed
        showStatistics();
    }//GEN-LAST:event_btnStatActionPerformed

    private void tlbStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbStatActionPerformed
        showStatistics();
    }//GEN-LAST:event_tlbStatActionPerformed

    private void tlbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbSearchActionPerformed
        search();
    }//GEN-LAST:event_tlbSearchActionPerformed

    private void miSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchActionPerformed
        search();
    }//GEN-LAST:event_miSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addRecord();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearRecord();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exiting();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            txtEMail.requestFocus();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtEMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEMailKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            txtPhone.requestFocus();
    }//GEN-LAST:event_txtEMailKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnAdd.requestFocus();
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void btnAddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            btnAdd.doClick();
    }//GEN-LAST:event_btnAddKeyTyped

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
            java.util.logging.Logger.getLogger(frmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mEdit;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miClear;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miSearch;
    private javax.swing.JMenuItem miStat;
    private javax.swing.JTable tblAddBook;
    private javax.swing.JButton tlbAdd;
    private javax.swing.JButton tlbClear;
    private javax.swing.JButton tlbExit;
    private javax.swing.JButton tlbSearch;
    private javax.swing.JButton tlbStat;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSNo;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
