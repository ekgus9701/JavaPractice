import java.awt.*;
import javax.swing.*;
 
public class num2 extends JFrame {
    
    private class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            int x = (int)(Math.random()*(getWidth()-50));
            int y = (int)(Math.random()*(getHeight()-50));
            
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }
    }
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                repaint();
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }
    
	public num2() {
        this.setTitle("¿øÀ» 0.5ÃÊ  ...");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        this.setContentPane(new MyPanel());
        Thread t = new Thread(new thread());
        t.start();
        
        this.setSize(300, 300);
        this.setVisible(true);
    }

    
    public static void main(String[] args) {
        new num2();
    }
}