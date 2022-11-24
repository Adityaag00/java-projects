package projcomboboxfilter;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class frmComboBOx extends JFrame{
    private JFrame frame;
    private final JComboBox comboBox = new JComboBox();
    private static ArrayList<String>listForComboBox= new ArrayList<String>();
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmComboBOx window = new frmComboBOx();
                    window.frame.setVisible(true);
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        listForComboBox.add("Lion");
        listForComboBox.add("LionKing");
        listForComboBox.add("Mufasa");
        listForComboBox.add("Nala");
        listForComboBox.add("KingNala");
        listForComboBox.add("Animals");
        listForComboBox.add("Anims");
        listForComboBox.add("Fish");
        listForComboBox.add("Jelly Fish");
        listForComboBox.add("I am the boss");


    }
    
    public frmComboBOx() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 412, 165);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        comboBox.setEditable(true);


        for(String detail : listForComboBox) {
            comboBox.addItem(detail); 
        }
        final JTextField textfield = (JTextField) comboBox.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(!textfield.getText().isEmpty()){
                            comboBoxFilter(textfield.getText());
                        }
                    }
                });

            }
        });
        comboBox.setBounds(10, 39, 364, 29);
        frame.getContentPane().add(comboBox);
    }
     public void comboBoxFilter(String enteredText) {
         System.out.println(comboBox.getItemCount());

            if (!comboBox.isPopupVisible()) {
                comboBox.showPopup();
            }

            ArrayList<String> filterArray= new ArrayList<String>();
            for (int i = 0; i < listForComboBox.size(); i++) {
                if (listForComboBox.get(i).toLowerCase().contains(enteredText.toLowerCase())) {
                    filterArray.add(listForComboBox.get(i));
                }
            }
            if (filterArray.size() > 0) {
                DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) comboBox.getModel();
                model.removeAllElements();
                model.addElement("");
                for (String s: filterArray)
                    model.addElement(s);

                JTextField textfield = (JTextField) comboBox.getEditor().getEditorComponent();
                textfield.setText(enteredText);
            }
        }
}