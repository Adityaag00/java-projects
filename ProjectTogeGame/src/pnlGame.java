
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;




public class pnlGame extends javax.swing.JPanel implements KeyListener{
    private int ballx=0;
    private int ballx1=0;
    private int bally=0;
    private int bally1=0;
    private int ballxs=5;
    private int ballys=7;
    private int ballxs1=5;
    private int ballys1=7;
    private int ballxs2=7;
    private int ballys2=8;
    private int paddlex=0;
    private int score=0;
    private int score1=0;
    private boolean first=true;
    private boolean gameover=false;
    private int bally2;
    private boolean first1=true;
    private int ballx2;
    BufferedImage toge;
    
    public pnlGame() throws IOException {
        initComponents();
        setSize(600, 700);
        
        Timer tim = new Timer(17,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballx+=ballxs;
                bally+=ballys;
                
                if((bally+40)>=590 && (ballx+30)>=paddlex && (ballx-30)<=(paddlex+160)) {
                    ballys=-7;
                    score++;
                }
                
                if(bally>=640) {
                    gameover=true;
                    score=0;
                    bally=0;
                }
                
                if(ballx<=0) 
                    ballxs=5;
                
                if(ballx>=540)
                    ballxs=-5;
                
                if(bally<=0)
                    ballys=7;
                
                
                ballx1+=ballxs1;
                bally1+=ballys1;

                if((bally1+40)>=590 && (ballx1+30)>=paddlex && (ballx1-30)<=(paddlex+160)) {
                    ballys1=-3;
                    if(score>4)
                        score+=1;
                }

                if(bally1>=640) {
                    if(score>4) {
                        gameover=true;
                        score=0;
                    }
                    bally1=0;
                }

                if(ballx1<=0) 
                    ballxs1=3;

                if(ballx1>=540)
                    ballxs1=-3;

                if(bally1<=0)
                    ballys1=3;
                
                ballx2+=ballxs2;
                bally2+=ballys2;

                if((bally2+40)>=590 && (ballx2+30)>=paddlex && (ballx2-30)<=(paddlex+160)) {
                    ballys2=-3;
                    if(score>8)
                        score+=3;
                }

                if(bally2>=640) {
                    if(score>8) {
                        gameover=true;
                        score=0;
                    }
                    bally2=0;
                }

                if(ballx2<=0) 
                    ballxs2=5;

                if(ballx2>=540)
                    ballxs2=-5;

                if(bally2<=0)
                    ballys2=5;
                
                
                repaint();
                
                if(gameover) {
                    System.out.println(score);
                    gameover=false;
                    first=true;
                    first1=true;
                }
            }
            
        });
        tim.start();   
        toge = ImageIO.read(getClass().getResource("toge.jpg"));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0,0,600,620);
        
        g.setColor(Color.YELLOW);
        g.fillOval(400, 80, 80, 80);
        
        g.setColor(Color.GREEN);
        g.fillRect(0,620,600,80);
        
        /*g.setColor(Color.red);
        g.fillOval(ballx, bally, 40, 40);*/
        
        g.drawImage(toge, ballx, bally, 40, 40, this);
        
        if(score>4) {
            if(first==true) {
                first=false;
                bally1=0;
            }
            g.drawImage(toge, ballx1, bally1, 40, 40, this);
        }
        
        if(score>8) {
            if(first1==true) {
                first1=false;
                bally2=0;
            }
            g.drawImage(toge, ballx2, bally2, 40, 40, this);
        }
        
        g.setColor(Color.black);
        g.fillRect(paddlex, 590, 160, 20);
        
        g.setColor(Color.LIGHT_GRAY);
        g.setFont(new Font("Arial",Font.BOLD,90));
        g.drawString(""+score, 10, 90);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String[] args) throws IOException {
        JFrame frm=new JFrame();
        pnlGame pnl=new pnlGame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(600,700);
        frm.add(pnl);
        frm.setVisible(true);
        frm.addKeyListener(pnl);
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT) {
            paddlex+=160;
            repaint();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT) {
            paddlex-=160;
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT) {
            paddlex+=60;
            repaint();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT) {
            paddlex-=60;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
