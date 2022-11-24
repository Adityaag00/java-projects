import javax.swing.*;
import java.awt.*;


public class SimpleAnimation {
    int x=70;
    int y=70;
    int i;
    boolean game=false;
    
    
    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation ();
        gui.go();
        if(gui.game==true)
            System.exit(0);
        
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.setResizable(false);
        
        frame.getContentPane().add(drawPanel);
        frame.setSize(550,600);
        frame.setVisible(true);
        
        for(i=0;i<=500;i++)  {
            
            x++;
            y++;
            
            drawPanel.repaint();
            
            if(i==500)
              game=true;
            
            try {
                Thread.sleep(20);
            }
            catch(Exception e) {   
            }
        }
        
    }
    
    class MyDrawPanel extends JPanel {
        
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            
            
            g.setColor(Color.green);
            g.fillOval(x,y,50,50);
        }
    }
}