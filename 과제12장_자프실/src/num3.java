import java.awt.*;
import javax.swing.*;
 
public class num3 extends JFrame {
    private JLabel WalkingLabel;
    private String text;
    private int length;
    private int index = 1;
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                WalkingLabel.setText(text.substring(0, index));
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
                index++;
                if(index > length) index = 0;
            }
        }
    }
    
    public num3() {
        this.setTitle("걸어서 나...");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        getContentPane().setLayout(new FlowLayout());
        
        WalkingLabel = new JLabel("나는 당신을 사랑합니다.");
        
        add(WalkingLabel);
        
        text = WalkingLabel.getText();
        length = text.length();
        
        Thread t = new Thread(new thread());
        t.start();
        
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
 
    
    public static void main(String[] args) {
        new num3();
    }
}
