
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Main extends JPanel implements ActionListener,KeyListener{
    private static int width=600;
    private static int height=700;
    private int apple_x;
    private int apple_y;
    private int ballN=30;
    private static Timer tim;
    private int[] ballx;
    private int[] bally;
    private int z;
    Random rnd;
    private boolean left=false;
    private boolean right=true;
    private boolean up=false;
    private boolean down=false;
    private boolean ingame=true;
    private boolean stop=false;
    private BufferedImage snk; 
    
    public Main() throws IOException {
        setSize(width, height);
        init();
    }
    
    public void init() throws IOException {
        z=3;
        rnd=new Random();
        locateApple();
        tim=new Timer(120, this);
        tim.start();
        ballx=new int[ballN];
        bally=new int[ballN];
        
        ballx[0]=50;
        ballx[1]=80;
        ballx[2]=110;
        bally[0]=50;
        bally[1]=50;
        bally[2]=50;
        
        snk=ImageIO.read(getClass().getResource("download.jpg"));
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        
        if(ingame) {
            g.setColor(Color.red);
            g.fillOval(apple_x, apple_y, 20, 20);
            
            g.drawImage(snk, ballx[0], bally[0],30,30, this);
            g.setColor(Color.GREEN);
            
            for(int i=1;i<z;i++) {
                g.fillOval(ballx[i], bally[i], 30, 30);
            }
        }
        else {
            gameOver(g);
        }
    }
    
    public void gameOver(Graphics g) {
        Font font=new Font("Arial",Font.BOLD,14);
        g.setColor(Color.white);
        g.setFont(font);
        g.drawString("Game Over", 20, 30);
        tim.stop();
    }
    
    public void checkApples() {
        if(apple_x>=ballx[0] && apple_x<=ballx[0]+30 && apple_y>=bally[0] && apple_y<=bally[0]+30) {
            z++;
            if(right) {
                ballx[z-1]=ballx[z-2]-30;    
            }
            if(left) {
                ballx[z-1]=ballx[z-2]+30;    
            }
            if(up) {
                bally[z-1]=bally[z-2]+30;    
            }
            if(down) {
                bally[z-1]=bally[z-2]-30;    
            }
            
            locateApple();
            System.out.print("Caught");
        }
    }
    
    public void move() {
        for(int i=(z-1);i>0;i--) {
            ballx[i]=ballx[(i-1)];
            bally[i]=bally[(i-1)];
        }
            
        if(left) {
            ballx[0]-=30;
        }
        
        if(right) {
            ballx[0]+=30;
        }
        
        if(up) {
            bally[0]-=30;
        }
        
        if(down) {
            bally[0]+=30;
        }
        
    }
    
    public void checkCollision() {
        for(int i=z;i>0;i--) {
            if((i>4) && (ballx[0])==(ballx[i]) && (bally[0])==(bally[i])) {
                ingame=false;
            }
        }
        
        if(bally[0]>=height) {
            ingame=false;
        }
        
        if(bally[0]<0) {
            ingame=false;
        }
        
        if(ballx[0]>=width) {
            ingame=false;
        }
        
        if(ballx[0]<0) {
            ingame=false;
        }
        
        if(!ingame) {
            tim.stop();
        }
        
    }
    
    public void locateApple() {
        apple_x=rnd.nextInt(width-40);
        apple_y=rnd.nextInt(height-50);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(ingame) {
            checkApples();
            checkCollision();
            move();
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()==KeyEvent.VK_SPACE) {
            if(stop==true) {
                stop=false;
                tim.start();
            }
            else if(stop==false) {
                stop=true;
                tim.stop();
            }
        }
        
        else if(e.getKeyChar() == KeyEvent.VK_ENTER){
            if(!ingame) {
                z=3;
                ingame=true;
                tim.start();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        
        if(key==KeyEvent.VK_LEFT && !right) {
            left=true;
            up=false;
            down=false;
        }
        
        if(key==KeyEvent.VK_RIGHT && !left) {
            right=true;
            up=false;
            down=false;
        }
        
        if(key==KeyEvent.VK_UP && !down) {
            left=false;
            up=true;
            right=false;
        }
        
        if(key==KeyEvent.VK_DOWN && !up) {
            left=false;
            down=true;
            right=false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    public static void main(String[] args) throws IOException {
        JFrame frm=new JFrame();
        frm.setSize(width,height);
        Main main = new Main();
        frm.add(main);
        frm.addKeyListener(main);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}

