
//import com.sun.glass.events.KeyEvent;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class frmnew extends javax.swing.JFrame {
    double firstno,secno,res;
    String operat="";
    boolean already=false;
    
    public frmnew() {
        initComponents();
        this.setTitle("JAVA Calculator");
    }
    public void DoNothing() {
        txtall.setText(txtall.getText());
    }
    public void operation(){
        try 
        {
            firstno=Double.parseDouble(txtall.getText());
            txtall.setText("");
        }
        catch(NumberFormatException e) {
           JOptionPane.showMessageDialog(this,"PLEASE ENTER NUMBER FIRST","ERROR",JOptionPane.ERROR_MESSAGE); 
        }
          
    }
    public void numberInput(String str) {
        if(txtall.getText().length()>14)
          DoNothing();
        else
          txtall.setText(txtall.getText()+str);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diamsg = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diasource = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtall = new javax.swing.JTextField();
        btnrecip = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btnsqrt = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnbackspace = new javax.swing.JButton();
        lblmemory = new javax.swing.JLabel();
        btnmult = new javax.swing.JButton();
        btnmin = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnplusmin = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnmemread = new javax.swing.JButton();
        btnmemadd = new javax.swing.JButton();
        btnmemsave = new javax.swing.JButton();
        btnmemclear = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        menufile = new javax.swing.JMenu();
        menuitemadd = new javax.swing.JMenuItem();
        menuitemsub = new javax.swing.JMenuItem();
        menuitemmult = new javax.swing.JMenuItem();
        menuitemdiv = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuitemequal = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuitemsource = new javax.swing.JMenuItem();

        jLabel1.setIcon(new ImageIcon("src\\calcreal.png"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("App Version 1.01 Developed By Aditya Agrawal");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Support For More Apps ...");

        javax.swing.GroupLayout diamsgLayout = new javax.swing.GroupLayout(diamsg.getContentPane());
        diamsg.getContentPane().setLayout(diamsgLayout);
        diamsgLayout.setHorizontalGroup(
            diamsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diamsgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diamsgLayout.createSequentialGroup()
                .addGroup(diamsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        diamsgLayout.setVerticalGroup(
            diamsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diamsgLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SOURCE CODE");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nimport com.sun.glass.events.KeyEvent;\nimport javax.swing.ImageIcon;\nimport javax.swing.JOptionPane;\n\n\npublic class frmnew extends javax.swing.JFrame {\n    double firstno,secno,res;\n    String operat=\"\";\n    boolean already=false;\n    \n    public frmnew() {\n        initComponents();\n        this.setTitle(\"JAVA Calculator\");\n    }\n    \n    public void ButtonValue(String Number) {\n        txtall.setText(txtall.getText()+Number);\n        txtall.requestFocus();\n    }\n    public void DoNothing() {\n        txtall.setText(txtall.getText());\n        txtall.requestFocus();\n    }\n    public void operation(){\n        firstno=Double.parseDouble(txtall.getText());\n        txtall.setText(\"\");\n        txtall.requestFocus();\n    }\n     @SuppressWarnings(\"unchecked\")\n    // <editor-fold defaultstate=\"collapsed\" desc=\"Generated Code\">                          \n    private void initComponents() {\n\n        diamsg = new javax.swing.JDialog();\n        jLabel1 = new javax.swing.JLabel();\n        jLabel2 = new javax.swing.JLabel();\n        jLabel3 = new javax.swing.JLabel();\n        diasource = new javax.swing.JDialog();\n        jLabel4 = new javax.swing.JLabel();\n        jScrollPane2 = new javax.swing.JScrollPane();\n        jTextArea1 = new javax.swing.JTextArea();\n        txtall = new javax.swing.JTextField();\n        btnrecip = new javax.swing.JButton();\n        btnequal = new javax.swing.JButton();\n        btnsqrt = new javax.swing.JButton();\n        btnclear = new javax.swing.JButton();\n        btnmod = new javax.swing.JButton();\n        btnreset = new javax.swing.JButton();\n        btnbackspace = new javax.swing.JButton();\n        lblmemory = new javax.swing.JLabel();\n        btnmult = new javax.swing.JButton();\n        btnmin = new javax.swing.JButton();\n        btnplus = new javax.swing.JButton();\n        btndiv = new javax.swing.JButton();\n        btn6 = new javax.swing.JButton();\n        btn3 = new javax.swing.JButton();\n        btndot = new javax.swing.JButton();\n        btn9 = new javax.swing.JButton();\n        btn5 = new javax.swing.JButton();\n        btn2 = new javax.swing.JButton();\n        btnplusmin = new javax.swing.JButton();\n        btn8 = new javax.swing.JButton();\n        btn0 = new javax.swing.JButton();\n        btn7 = new javax.swing.JButton();\n        btn4 = new javax.swing.JButton();\n        btnmemread = new javax.swing.JButton();\n        btnmemadd = new javax.swing.JButton();\n        btnmemsave = new javax.swing.JButton();\n        btnmemclear = new javax.swing.JButton();\n        btn1 = new javax.swing.JButton();\n        MenuBar = new javax.swing.JMenuBar();\n        menufile = new javax.swing.JMenu();\n        menuitemadd = new javax.swing.JMenuItem();\n        menuitemsub = new javax.swing.JMenuItem();\n        menuitemmult = new javax.swing.JMenuItem();\n        menuitemdiv = new javax.swing.JMenuItem();\n        jMenu2 = new javax.swing.JMenu();\n        menuitemequal = new javax.swing.JMenuItem();\n        jMenu4 = new javax.swing.JMenu();\n        jMenuItem1 = new javax.swing.JMenuItem();\n        jMenu5 = new javax.swing.JMenu();\n        menuitemsource = new javax.swing.JMenuItem();\n\n        jLabel1.setIcon(new ImageIcon(\"src\\\\calcreal.png\"));\n\n        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);\n        jLabel2.setText(\"App Version 1.01 Developed By Aditya Agrawal\");\n\n        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);\n        jLabel3.setText(\"Support For More Apps ...\");\n\n        javax.swing.GroupLayout diamsgLayout = new javax.swing.GroupLayout(diamsg.getContentPane());\n        diamsg.getContentPane().setLayout(diamsgLayout);\n        diamsgLayout.setHorizontalGroup(\n            diamsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n            .addGroup(diamsgLayout.createSequentialGroup()\n                .addGap(17, 17, 17)\n                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diamsgLayout.createSequentialGroup()\n                .addGroup(diamsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)\n                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))\n                .addContainerGap())\n        );\n        diamsgLayout.setVerticalGroup(\n            diamsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n            .addGroup(diamsgLayout.createSequentialGroup()\n                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addGap(18, 18, 18)\n                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)\n                .addContainerGap())\n        );\n\n        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);\n        jLabel4.setText(\"SOURCE CODE\");\n\n        jTextArea1.setColumns(20);\n        jTextArea1.setRows(5);\n        jScrollPane2.setViewportView(jTextArea1);\n\n        javax.swing.GroupLayout diasourceLayout = new javax.swing.GroupLayout(diasource.getContentPane());\n        diasource.getContentPane().setLayout(diasourceLayout);\n        diasourceLayout.setHorizontalGroup(\n            diasourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n            .addGroup(diasourceLayout.createSequentialGroup()\n                .addGap(90, 90, 90)\n                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addContainerGap(108, Short.MAX_VALUE))\n            .addComponent(jScrollPane2)\n        );\n        diasourceLayout.setVerticalGroup(\n            diasourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n            .addGroup(diasourceLayout.createSequentialGroup()\n                .addContainerGap()\n                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)\n                .addGap(16, 16, 16))\n        );\n\n        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);\n        setResizable(false);\n\n        txtall.setHorizontalAlignment(javax.swing.JTextField.RIGHT);\n        txtall.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                txtallActionPerformed(evt);\n            }\n        });\n        txtall.addKeyListener(new java.awt.event.KeyAdapter() {\n            public void keyTyped(java.awt.event.KeyEvent evt) {\n                txtallKeyTyped(evt);\n            }\n        });\n\n        btnrecip.setText(\"1/x\");\n        btnrecip.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnrecipActionPerformed(evt);\n            }\n        });\n\n        btnequal.setText(\"=\");\n        btnequal.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnequalActionPerformed(evt);\n            }\n        });\n\n        btnsqrt.setFont(new java.awt.Font(\"Yu Gothic\", 0, 12)); // NOI18N\n        btnsqrt.setText(\"√x\");\n        btnsqrt.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnsqrtActionPerformed(evt);\n            }\n        });\n\n        btnclear.setText(\"C\");\n        btnclear.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnclearActionPerformed(evt);\n            }\n        });\n\n        btnmod.setText(\"%\");\n        btnmod.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnmodActionPerformed(evt);\n            }\n        });\n\n        btnreset.setText(\"CE\");\n        btnreset.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnresetActionPerformed(evt);\n            }\n        });\n\n        btnbackspace.setText(\"←\");\n        btnbackspace.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnbackspaceActionPerformed(evt);\n            }\n        });\n\n        lblmemory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));\n\n        btnmult.setText(\"X\");\n        btnmult.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnmultActionPerformed(evt);\n            }\n        });\n\n        btnmin.setText(\"-\");\n        btnmin.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnminActionPerformed(evt);\n            }\n        });\n\n        btnplus.setText(\"+\");\n        btnplus.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnplusActionPerformed(evt);\n            }\n        });\n\n        btndiv.setFont(new java.awt.Font(\"Yu Gothic\", 0, 12)); // NOI18N\n        btndiv.setText(\"/\");\n        btndiv.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btndivActionPerformed(evt);\n            }\n        });\n\n        btn6.setText(\"6\");\n        btn6.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn6ActionPerformed(evt);\n            }\n        });\n\n        btn3.setText(\"3\");\n        btn3.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn3ActionPerformed(evt);\n            }\n        });\n\n        btndot.setText(\".\");\n        btndot.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btndotActionPerformed(evt);\n            }\n        });\n\n        btn9.setFont(new java.awt.Font(\"Yu Gothic\", 0, 12)); // NOI18N\n        btn9.setText(\"9\");\n        btn9.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn9ActionPerformed(evt);\n            }\n        });\n\n        btn5.setText(\"5\");\n        btn5.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn5ActionPerformed(evt);\n            }\n        });\n\n        btn2.setText(\"2\");\n        btn2.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn2ActionPerformed(evt);\n            }\n        });\n\n        btnplusmin.setText(\"+/-\");\n        btnplusmin.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnplusminActionPerformed(evt);\n            }\n        });\n\n        btn8.setFont(new java.awt.Font(\"Yu Gothic\", 0, 12)); // NOI18N\n        btn8.setText(\"8\");\n        btn8.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn8ActionPerformed(evt);\n            }\n        });\n\n        btn0.setText(\"0\");\n        btn0.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn0ActionPerformed(evt);\n            }\n        });\n\n        btn7.setFont(new java.awt.Font(\"Yu Gothic\", 0, 12)); // NOI18N\n        btn7.setText(\"7\");\n        btn7.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn7ActionPerformed(evt);\n            }\n        });\n\n        btn4.setText(\"4\");\n        btn4.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn4ActionPerformed(evt);\n            }\n        });\n\n        btnmemread.setText(\"MR\");\n        btnmemread.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnmemreadActionPerformed(evt);\n            }\n        });\n\n        btnmemadd.setText(\"M+\");\n        btnmemadd.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnmemaddActionPerformed(evt);\n            }\n        });\n\n        btnmemsave.setText(\"MS\");\n        btnmemsave.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnmemsaveActionPerformed(evt);\n            }\n        });\n\n        btnmemclear.setFont(new java.awt.Font(\"Yu Gothic\", 0, 12)); // NOI18N\n        btnmemclear.setText(\"MC\");\n        btnmemclear.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btnmemclearActionPerformed(evt);\n            }\n        });\n\n        btn1.setText(\"1\");\n        btn1.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                btn1ActionPerformed(evt);\n            }\n        });\n\n        menufile.setText(\"File\");\n\n        menuitemadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));\n        menuitemadd.setText(\"Add\");\n        menuitemadd.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                menuitemaddActionPerformed(evt);\n            }\n        });\n        menufile.add(menuitemadd);\n\n        menuitemsub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));\n        menuitemsub.setText(\"Subtract\");\n        menuitemsub.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                menuitemsubActionPerformed(evt);\n            }\n        });\n        menufile.add(menuitemsub);\n\n        menuitemmult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));\n        menuitemmult.setText(\"Multiply\");\n        menuitemmult.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                menuitemmultActionPerformed(evt);\n            }\n        });\n        menufile.add(menuitemmult);\n\n        menuitemdiv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));\n        menuitemdiv.setText(\"Divide\");\n        menuitemdiv.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                menuitemdivActionPerformed(evt);\n            }\n        });\n        menufile.add(menuitemdiv);\n\n        MenuBar.add(menufile);\n\n        jMenu2.setText(\"View\");\n\n        menuitemequal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, 0));\n        menuitemequal.setText(\"Equals\");\n        menuitemequal.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                menuitemequalActionPerformed(evt);\n            }\n        });\n        jMenu2.add(menuitemequal);\n\n        MenuBar.add(jMenu2);\n\n        jMenu4.setText(\"About\");\n        jMenu4.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                jMenu4ActionPerformed(evt);\n            }\n        });\n\n        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ALT, java.awt.event.InputEvent.CTRL_MASK));\n        jMenuItem1.setText(\"About calculator\");\n        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                jMenuItem1ActionPerformed(evt);\n            }\n        });\n        jMenu4.add(jMenuItem1);\n\n        MenuBar.add(jMenu4);\n\n        jMenu5.setText(\"Source\");\n\n        menuitemsource.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));\n        menuitemsource.setText(\"Source Code\");\n        menuitemsource.addActionListener(new java.awt.event.ActionListener() {\n            public void actionPerformed(java.awt.event.ActionEvent evt) {\n                menuitemsourceActionPerformed(evt);\n            }\n        });\n        jMenu5.add(menuitemsource);\n\n        MenuBar.add(jMenu5);\n\n        setJMenuBar(MenuBar);\n\n        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());\n        getContentPane().setLayout(layout);\n        layout.setHorizontalGroup(\n            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n            .addComponent(txtall)\n            .addGroup(layout.createSequentialGroup()\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btnmemread, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnmemsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnmemadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnmemclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnplusmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btndot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btnmult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnplus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btndiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btnmod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnrecip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnequal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addComponent(btnsqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))\n                .addGap(0, 0, Short.MAX_VALUE))\n            .addGroup(layout.createSequentialGroup()\n                .addComponent(lblmemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addComponent(btnbackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))\n        );\n        layout.setVerticalGroup(\n            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n            .addGroup(layout.createSequentialGroup()\n                .addComponent(txtall, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(lblmemory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)\n                        .addComponent(btnbackspace)\n                        .addComponent(btnreset)\n                        .addComponent(btnclear)))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addGroup(layout.createSequentialGroup()\n                        .addComponent(btnsqrt)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btnrecip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))\n                    .addGroup(layout.createSequentialGroup()\n                        .addComponent(btndiv)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btnmult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btnmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))\n                    .addGroup(layout.createSequentialGroup()\n                        .addComponent(btn9)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))\n                    .addGroup(layout.createSequentialGroup()\n                        .addComponent(btn8)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))\n                    .addGroup(layout.createSequentialGroup()\n                        .addComponent(btn7)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))\n                    .addGroup(layout.createSequentialGroup()\n                        .addComponent(btnmemclear)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btnmemread, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)\n                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                        .addComponent(btnmemsave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))\n                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)\n                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)\n                    .addComponent(btnequal)\n                    .addComponent(btnplus)\n                    .addComponent(btndot)\n                    .addComponent(btnplusmin)\n                    .addComponent(btn0)\n                    .addComponent(btnmemadd))\n                .addContainerGap())\n        );\n\n        pack();\n        setLocationRelativeTo(null);\n    }// </editor-fold>                        \n\n    private void txtallActionPerformed(java.awt.event.ActionEvent evt) {                                       \n     \n    }                                      \n\n    private void btnrecipActionPerformed(java.awt.event.ActionEvent evt) {                                         \n        operation();\n        res=1/firstno;\n        txtall.setText(\"\"+res);\n        txtall.requestFocus();\n        already=true;\n    }                                        \n\n    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {                                         \n        secno=Double.parseDouble(txtall.getText());\n        \n        if(operat.equals(\"+\")) {\n            res=firstno+secno;\n        }\n        if(operat.equals(\"-\")) {\n            res=firstno-secno;\n        }\n        if(operat.equals(\"*\")) {\n            res=firstno*secno;\n        }\n        if(operat.equals(\"/\")) {\n            res=firstno/secno;\n        }\n        if(operat.equals(\"%\")) {\n            res=firstno%secno;\n        }\n        if(operat.equals(\"\"))\n            JOptionPane.showMessageDialog(this,\"PLEASE SELECT ANY OPERATION FIRST\",\"ERROR\",JOptionPane.ERROR_MESSAGE);\n        \n        txtall.setText(\"\"+res);\n        txtall.requestFocus();\n        txtall.selectAll();\n    }                                        \n\n    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {                                        \n        operation();\n        res=Math.sqrt(firstno);\n        txtall.setText(\"\"+res);\n        txtall.requestFocus();\n        already=true;\n        if(txtall.getText().equals(\"NaN\"))\n            txtall.setText(\"Invalid Input By User\");\n    }                                       \n\n    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {                                         \n        txtall.setText(\"\");\n        txtall.requestFocus();\n        already=false;\n    }                                        \n\n    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {                                       \n        operation();\n        operat=\"%\";\n    }                                      \n\n    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {                                         \n        txtall.setText(\"\");\n        txtall.requestFocus();\n        already=false;\n        firstno=0;\n        secno=0;\n        operat=\"\";\n\n    }                                        \n\n    private void btnbackspaceActionPerformed(java.awt.event.ActionEvent evt) {                                             \n       if(txtall.getText().length()>0) {\n           StringBuilder stbr = new StringBuilder(txtall.getText());\n           stbr.deleteCharAt(txtall.getText().length()-1);\n           txtall.setText(stbr.toString());\n           txtall.requestFocus();\n       }  \n       if(txtall.getText().length()==0)\n           txtall.requestFocus();\n    }                                            \n\n    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {                                        \n        operation();\n        operat=\"*\";\n    }                                       \n\n    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {                                       \n        operation();\n        operat=\"-\";\n    }                                      \n\n    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {                                        \n        operation();\n        operat=\"+\";\n    }                                       \n\n    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {                                       \n        operation();\n        operat=\"/\";\n    }                                      \n\n    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn6.getText());\n    }                                    \n\n    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn3.getText());\n    }                                    \n\n    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {                                       \n       if(already==true)\n            DoNothing();\n       else\n            ButtonValue(btndot.getText());\n       already=true;\n    }                                      \n\n    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn9.getText());\n    }                                    \n\n    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn5.getText());\n    }                                    \n\n    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn2.getText());\n    }                                    \n\n    private void btnplusminActionPerformed(java.awt.event.ActionEvent evt) {                                           \n        operation();\n        res=(-1)*firstno;\n        txtall.setText(\"\"+res);\n        txtall.requestFocus();\n        already=true;\n    }                                          \n\n    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn8.getText());\n    }                                    \n\n    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn0.getText());\n    }                                    \n\n    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn7.getText());\n        \n    }                                    \n\n    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn4.getText());\n    }                                    \n\n    private void btnmemreadActionPerformed(java.awt.event.ActionEvent evt) {                                           \n        if(lblmemory.getText().length()<=0)\n            JOptionPane.showMessageDialog(this,\"Please Do Memory Save First\",\"ERROR\",JOptionPane.ERROR_MESSAGE);\n        else {\n            txtall.setText(lblmemory.getText());\n            lblmemory.setText(\"\");\n        }\n        txtall.requestFocus();\n    }                                          \n\n    private void btnmemaddActionPerformed(java.awt.event.ActionEvent evt) {                                          \n        if(lblmemory.getText().length()<=0)\n            JOptionPane.showMessageDialog(this,\"Please Do Memory Save First\",\"ERROR\",JOptionPane.ERROR_MESSAGE);\n        else {\n            double memo=Double.parseDouble(lblmemory.getText());\n            double txtfie=Double.parseDouble(txtall.getText());\n            double resultadd=memo+txtfie;\n            txtall.setText(\"\"+resultadd);\n            txtall.requestFocus();\n            txtall.selectAll();\n        }\n    }                                         \n\n    private void btnmemsaveActionPerformed(java.awt.event.ActionEvent evt) {                                           \n        lblmemory.setText(txtall.getText());\n        txtall.setText(\"\");\n        txtall.requestFocus();\n    }                                          \n\n    private void btnmemclearActionPerformed(java.awt.event.ActionEvent evt) {                                            \n        lblmemory.setText(\"\");\n        txtall.requestFocus();\n    }                                           \n\n    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     \n        if(txtall.getText().length()>14)\n          DoNothing();\n        else\n          ButtonValue(btn1.getText());\n    }                                    \n\n    private void txtallKeyTyped(java.awt.event.KeyEvent evt) {                                \n        if(!((evt.getKeyChar()>=KeyEvent.VK_0)&&(evt.getKeyChar()<=KeyEvent.VK_9)))\n            evt.consume();\n        if(txtall.getText().length()>14)\n            evt.consume();\n        txtall.requestFocus();\n        if(evt.getKeyChar()==KeyEvent.VK_ENTER)\n            btnequal.doClick();\n    }                               \n\n    private void menuitemmultActionPerformed(java.awt.event.ActionEvent evt) {                                             \n        btnmult.doClick();\n    }                                            \n\n    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {                                       \n        \n    }                                      \n\n    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           \n        diamsg.pack();\n        diamsg.setLocationRelativeTo(this);\n        diamsg.setVisible(true);\n    }                                          \n\n    private void menuitemaddActionPerformed(java.awt.event.ActionEvent evt) {                                            \n        btnplus.doClick();\n    }                                           \n\n    private void menuitemsubActionPerformed(java.awt.event.ActionEvent evt) {                                            \n        btnmin.doClick();\n    }                                           \n\n    private void menuitemdivActionPerformed(java.awt.event.ActionEvent evt) {                                            \n        btndiv.doClick();\n    }                                           \n\n    private void menuitemequalActionPerformed(java.awt.event.ActionEvent evt) {                                              \n        btnequal.doClick();\n    }                                             \n\n    private void menuitemsourceActionPerformed(java.awt.event.ActionEvent evt) {                                               \n        diasource.pack();\n        diasource.setLocationRelativeTo(this);\n        diasource.setVisible(true);\n    }                                              \n\n    /**\n     * @param args the command line arguments\n     */\n    public static void main(String args[]) {\n        /* Set the Nimbus look and feel */\n        //<editor-fold defaultstate=\"collapsed\" desc=\" Look and feel setting code (optional) \">\n        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.\n         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html \n         */\n        try {\n            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {\n                if (\"Nimbus\".equals(info.getName())) {\n                    javax.swing.UIManager.setLookAndFeel(info.getClassName());\n                    break;\n                }\n            }\n        } catch (ClassNotFoundException ex) {\n            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);\n        } catch (InstantiationException ex) {\n            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);\n        } catch (IllegalAccessException ex) {\n            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);\n        } catch (javax.swing.UnsupportedLookAndFeelException ex) {\n            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);\n        }\n        //</editor-fold>\n\n        /* Create and display the form */\n        java.awt.EventQueue.invokeLater(new Runnable() {\n            public void run() {\n                new frmnew().setVisible(true);\n            }\n        });\n    }\n\n    // Variables declaration - do not modify                     \n    private javax.swing.JMenuBar MenuBar;\n    private javax.swing.JButton btn0;\n    private javax.swing.JButton btn1;\n    private javax.swing.JButton btn2;\n    private javax.swing.JButton btn3;\n    private javax.swing.JButton btn4;\n    private javax.swing.JButton btn5;\n    private javax.swing.JButton btn6;\n    private javax.swing.JButton btn7;\n    private javax.swing.JButton btn8;\n    private javax.swing.JButton btn9;\n    private javax.swing.JButton btnbackspace;\n    private javax.swing.JButton btnclear;\n    private javax.swing.JButton btndiv;\n    private javax.swing.JButton btndot;\n    private javax.swing.JButton btnequal;\n    private javax.swing.JButton btnmemadd;\n    private javax.swing.JButton btnmemclear;\n    private javax.swing.JButton btnmemread;\n    private javax.swing.JButton btnmemsave;\n    private javax.swing.JButton btnmin;\n    private javax.swing.JButton btnmod;\n    private javax.swing.JButton btnmult;\n    private javax.swing.JButton btnplus;\n    private javax.swing.JButton btnplusmin;\n    private javax.swing.JButton btnrecip;\n    private javax.swing.JButton btnreset;\n    private javax.swing.JButton btnsqrt;\n    private javax.swing.JDialog diamsg;\n    private javax.swing.JDialog diasource;\n    private javax.swing.JLabel jLabel1;\n    private javax.swing.JLabel jLabel2;\n    private javax.swing.JLabel jLabel3;\n    private javax.swing.JLabel jLabel4;\n    private javax.swing.JMenu jMenu2;\n    private javax.swing.JMenu jMenu4;\n    private javax.swing.JMenu jMenu5;\n    private javax.swing.JMenuItem jMenuItem1;\n    private javax.swing.JScrollPane jScrollPane2;\n    private javax.swing.JTextArea jTextArea1;\n    private javax.swing.JLabel lblmemory;\n    private javax.swing.JMenu menufile;\n    private javax.swing.JMenuItem menuitemadd;\n    private javax.swing.JMenuItem menuitemdiv;\n    private javax.swing.JMenuItem menuitemequal;\n    private javax.swing.JMenuItem menuitemmult;\n    private javax.swing.JMenuItem menuitemsource;\n    private javax.swing.JMenuItem menuitemsub;\n    private javax.swing.JTextField txtall;\n    // End of variables declaration                   \n}\n\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout diasourceLayout = new javax.swing.GroupLayout(diasource.getContentPane());
        diasource.getContentPane().setLayout(diasourceLayout);
        diasourceLayout.setHorizontalGroup(
            diasourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diasourceLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        diasourceLayout.setVerticalGroup(
            diasourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diasourceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtall.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtall.setFocusable(false);
        txtall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtallKeyPressed(evt);
            }
        });

        btnrecip.setText("1/x");
        btnrecip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecipActionPerformed(evt);
            }
        });
        btnrecip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });
        btnequal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnsqrt.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnsqrt.setText("√x");
        btnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtActionPerformed(evt);
            }
        });
        btnsqrt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnclear.setText("C");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        btnclear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnmod.setText("%");
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });
        btnmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnreset.setText("CE");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        btnreset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnbackspace.setText("←");
        btnbackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackspaceActionPerformed(evt);
            }
        });
        btnbackspace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        lblmemory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnmult.setText("X");
        btnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultActionPerformed(evt);
            }
        });
        btnmult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnmin.setText("-");
        btnmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminActionPerformed(evt);
            }
        });
        btnmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnplus.setText("+");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });
        btnplus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btndiv.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });
        btndiv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        btndot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnplusmin.setText("+/-");
        btnplusmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusminActionPerformed(evt);
            }
        });
        btnplusmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnmemread.setText("MR");
        btnmemread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmemreadActionPerformed(evt);
            }
        });
        btnmemread.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnmemadd.setText("M+");
        btnmemadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmemaddActionPerformed(evt);
            }
        });
        btnmemadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnmemsave.setText("MS");
        btnmemsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmemsaveActionPerformed(evt);
            }
        });
        btnmemsave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btnmemclear.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnmemclear.setText("MC");
        btnmemclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmemclearActionPerformed(evt);
            }
        });
        btnmemclear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newKey(evt);
            }
        });

        menufile.setText("File");

        menuitemadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuitemadd.setText("Add");
        menuitemadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemaddActionPerformed(evt);
            }
        });
        menufile.add(menuitemadd);

        menuitemsub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuitemsub.setText("Subtract");
        menuitemsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemsubActionPerformed(evt);
            }
        });
        menufile.add(menuitemsub);

        menuitemmult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuitemmult.setText("Multiply");
        menuitemmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemmultActionPerformed(evt);
            }
        });
        menufile.add(menuitemmult);

        menuitemdiv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuitemdiv.setText("Divide");
        menuitemdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemdivActionPerformed(evt);
            }
        });
        menufile.add(menuitemdiv);

        MenuBar.add(menufile);

        jMenu2.setText("View");

        menuitemequal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, 0));
        menuitemequal.setText("Equals");
        menuitemequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemequalActionPerformed(evt);
            }
        });
        jMenu2.add(menuitemequal);

        MenuBar.add(jMenu2);

        jMenu4.setText("About");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("About calculator");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        MenuBar.add(jMenu4);

        jMenu5.setText("Source");

        menuitemsource.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuitemsource.setText("Source Code");
        menuitemsource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemsourceActionPerformed(evt);
            }
        });
        jMenu5.add(menuitemsource);

        MenuBar.add(jMenu5);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtall)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmemread, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmemsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmemadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmemclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnplusmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnplus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrecip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnequal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblmemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtall, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmemory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbackspace)
                        .addComponent(btnreset)
                        .addComponent(btnclear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsqrt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnrecip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmemclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmemread, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmemsave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnequal)
                    .addComponent(btnplus)
                    .addComponent(btndot)
                    .addComponent(btnplusmin)
                    .addComponent(btn0)
                    .addComponent(btnmemadd))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrecipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecipActionPerformed
        operation();
        res=1/firstno;
        txtall.setText(""+res);
        already=true;
    }//GEN-LAST:event_btnrecipActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        try {
            secno=Double.parseDouble(txtall.getText());

            if(operat.equals("+")) {
                res=firstno+secno;
            }
            if(operat.equals("-")) {
                res=firstno-secno;
            }
            if(operat.equals("*")) {
                res=firstno*secno;
            }
            if(operat.equals("/")) {
                res=firstno/secno;
            }
            if(operat.equals("%")) {
                res=firstno%secno;
            }
            if(operat.equals(""))
                JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY OPERATION FIRST","ERROR",JOptionPane.ERROR_MESSAGE);

            txtall.setText(""+res);
            txtall.selectAll();
        }
        catch(NumberFormatException n) {
           JOptionPane.showMessageDialog(this,"PLEASE ENTER NUMBER FIRST","ERROR",JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btnequalActionPerformed

    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrtActionPerformed
        operation();
        res=Math.sqrt(firstno);
        txtall.setText(""+res);
        already=true;
        if(txtall.getText().equals("NaN"))
            txtall.setText("Invalid Input By User");
    }//GEN-LAST:event_btnsqrtActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtall.setText("");
        already=false;
        firstno=0;
        secno=0;
        operat="";
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
        operation();
        operat="%";
    }//GEN-LAST:event_btnmodActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtall.setText("");
        already=false;
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnbackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackspaceActionPerformed
       if(txtall.getText().length()>0) {
           StringBuilder stbr = new StringBuilder(txtall.getText());
           stbr.deleteCharAt(txtall.getText().length()-1);
           txtall.setText(stbr.toString());
           txtall.requestFocus();
           
           if(txtall.getText().indexOf('.')==-1) {
              already=false; 
           }
          /* for(int k=0;k<txtall.getText().length();k++) {               
               if(stbr.charAt(k)==('.')) {
                  already=true;
                  break;
               }
               else 
                   already=false;
           }*/
       }  
    }//GEN-LAST:event_btnbackspaceActionPerformed

    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultActionPerformed
        operation();
        operat="*";
    }//GEN-LAST:event_btnmultActionPerformed

    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminActionPerformed
        operation();
        operat="-";
    }//GEN-LAST:event_btnminActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        operation();
        operat="+";
    }//GEN-LAST:event_btnplusActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        operation();
        operat="/";
    }//GEN-LAST:event_btndivActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        numberInput("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       numberInput("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if(already==true)
            DoNothing();
       else
            numberInput(".");
       already=true;
    }//GEN-LAST:event_btndotActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        numberInput("1");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        numberInput("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        numberInput("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnplusminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusminActionPerformed
        operation();
        res=(-1)*firstno;
        txtall.setText(""+res);
        already=true;
    }//GEN-LAST:event_btnplusminActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        numberInput("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        numberInput("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        numberInput("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        numberInput("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnmemreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmemreadActionPerformed
        if(lblmemory.getText().length()<=0)
            JOptionPane.showMessageDialog(this,"Please Do Memory Save First","ERROR",JOptionPane.ERROR_MESSAGE);
        else {
            txtall.setText(lblmemory.getText());
            lblmemory.setText("");
        }
    }//GEN-LAST:event_btnmemreadActionPerformed

    private void btnmemaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmemaddActionPerformed
        if(lblmemory.getText().length()<=0)
            JOptionPane.showMessageDialog(this,"Please Do Memory Save First","ERROR",JOptionPane.ERROR_MESSAGE);
        else {
            double memo=Double.parseDouble(lblmemory.getText());
            double txtfie=Double.parseDouble(txtall.getText());
            double resultadd=memo+txtfie;
            txtall.setText(""+resultadd);
            txtall.selectAll();
        }
    }//GEN-LAST:event_btnmemaddActionPerformed

    private void btnmemsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmemsaveActionPerformed
        lblmemory.setText(txtall.getText());
        txtall.setText("");
    }//GEN-LAST:event_btnmemsaveActionPerformed

    private void btnmemclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmemclearActionPerformed
        lblmemory.setText("");
    }//GEN-LAST:event_btnmemclearActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        numberInput("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void menuitemmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemmultActionPerformed
        btnmult.doClick();
    }//GEN-LAST:event_menuitemmultActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        diamsg.pack();
        diamsg.setLocationRelativeTo(this);
        diamsg.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuitemaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemaddActionPerformed
        btnplus.doClick();
    }//GEN-LAST:event_menuitemaddActionPerformed

    private void menuitemsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemsubActionPerformed
        btnmin.doClick();
    }//GEN-LAST:event_menuitemsubActionPerformed

    private void menuitemdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemdivActionPerformed
        btndiv.doClick();
    }//GEN-LAST:event_menuitemdivActionPerformed

    private void menuitemequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemequalActionPerformed
        btnequal.doClick();
    }//GEN-LAST:event_menuitemequalActionPerformed

    private void menuitemsourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemsourceActionPerformed
        diasource.pack();
        diasource.setLocationRelativeTo(this);
        diasource.setVisible(true);
    }//GEN-LAST:event_menuitemsourceActionPerformed

    private void txtallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtallKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
            evt.consume();
        txtall.requestFocus();
    }//GEN-LAST:event_txtallKeyPressed

    private void newKey(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newKey
        switch(evt.getKeyChar()) {
            case '1':
                btn1.doClick();
                break;
            case '2':
                btn2.doClick();
                break;
            case '3':
                btn3.doClick();
                break;
            case '4':
                btn4.doClick();
                break;
            case '5':
                btn5.doClick();
                break;
            case '6':
                btn6.doClick();
                break;
            case '7':
                btn7.doClick();
                break;
            case '8':
                btn1.doClick();
                break;
            case '9':
                btn9.doClick();
                break;
            case '+':
                btnplus.doClick();
                break; 
            case '-':
                btnmin.doClick();
                break; 
            case '/':
                btndiv.doClick();
                break; 
            case '*':
                btnmult.doClick();
                break; 
            case '%':
                btnmod.doClick();
                break; 
            case '.':
                btndot.doClick();
                break; 
            case KeyEvent.VK_ENTER:
                btnequal.doClick();
                break;  
            case 'C':
            case 'c':    
                btnreset.doClick();
                break;  
            case 'L':
            case 'l':    
                btnclear.doClick();
                break; 
            case KeyEvent.VK_BACK_SPACE:
                btnbackspace.doClick();
                break; 
        }
    }//GEN-LAST:event_newKey

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
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbackspace;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnmemadd;
    private javax.swing.JButton btnmemclear;
    private javax.swing.JButton btnmemread;
    private javax.swing.JButton btnmemsave;
    private javax.swing.JButton btnmin;
    private javax.swing.JButton btnmod;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnplusmin;
    private javax.swing.JButton btnrecip;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsqrt;
    private javax.swing.JDialog diamsg;
    private javax.swing.JDialog diasource;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblmemory;
    private javax.swing.JMenu menufile;
    private javax.swing.JMenuItem menuitemadd;
    private javax.swing.JMenuItem menuitemdiv;
    private javax.swing.JMenuItem menuitemequal;
    private javax.swing.JMenuItem menuitemmult;
    private javax.swing.JMenuItem menuitemsource;
    private javax.swing.JMenuItem menuitemsub;
    private javax.swing.JTextField txtall;
    // End of variables declaration//GEN-END:variables
}
