import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIclass extends JFrame {
     JFrame frm=new JFrame("The Title");
     JButton btn1;
     JButton btn2;
     JTextField txt1;
     JTextField txt2;
     JLabel lbl1;
     JLabel lbl2;
     Container cnt = getContentPane();
     
     public GUIclass() {
        btn1=new JButton("Click Me");
        btn2=new JButton("Click",new ImageIcon("src//9k=.png"));
        txt1=new JTextField("Hello");
        txt2=new JTextField("WOW");
        lbl1=new JLabel("New");
        lbl2=new JLabel("OLD");

        cnt.setLayout(new GridLayout(3,3));
         
        
        cnt.add(lbl1);
        cnt.add(txt1);
        cnt.add(lbl2);
        cnt.add(txt2);
        cnt.add(btn1);
        cnt.add(btn2);
        
        btn1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               JFrame frm1 = new JFrame();
               frm1.setVisible(true);
           }  
        });
    }
    public static void main(String[] args) {
        GUIclass frm=new GUIclass();
        frm.setSize(450,350);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
