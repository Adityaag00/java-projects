
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;


public class CircularJButton extends JButton{
    
    CircularJButton(String text) {
        super(text);
        Dimension dim=getPreferredSize();
        
        dim.width=dim.height=Math.max(dim.width, dim.height);
        setPreferredSize(dim);
        
        setContentAreaFilled(false);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        if(getModel().isArmed()) {
            g.setColor(Color.lightGray);
        }
        else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(new Color(0,0,0));
        g.drawOval(0, 0, getSize().width, getSize().height);
    }
    
    Shape shape;
    
    public boolean Contains(int x,int y) {
        if(shape==null || !shape.getBounds().equals(getBounds())) {
            shape=new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }
}
