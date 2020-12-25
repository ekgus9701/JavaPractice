import java.awt.*;
import javax.swing.*;
 
public class num1 extends JFrame {
    private class thread extends Thread {
        public void run() {
            setTitle("실행 시작");
            try {
                Thread.sleep(10000);
            }
            catch(InterruptedException e) { return; }
            setTitle("실행 종료");
            getContentPane().setBackground(Color.BLUE);
        }
    }
    
    public num1() {
        this.setTitle("");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        getContentPane().setBackground(Color.YELLOW);
        
        thread t = new thread();
        t.start();
        
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new num1();
    }
}
