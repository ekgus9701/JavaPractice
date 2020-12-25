import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
 
public class num4 extends JFrame {
    private Calendar c;
    private int hour, min, second;
    private JLabel time;
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                String clockText = Integer.toString(hour);
                clockText = clockText.concat(":");
                clockText = clockText.concat(Integer.toString(min));
                clockText = clockText.concat(":");
                clockText = clockText.concat(Integer.toString(second));
                
                time.setText(clockText);
            }
        }
    }
    
    public num4() {
        this.setTitle("µðÁöÅÐ ½Ã...");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        Container ct = getContentPane();
        
        ct.setLayout(null);
        
        time = new JLabel();
        time.setFont(new Font("Arial", Font.ITALIC, 80));
        time.setBounds(35, 30, 400, 100);
        ct.add(time);
        
        Thread t = new Thread(new thread());
        t.start();
        
        this.setSize(400, 400);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new num4();
    }
}
