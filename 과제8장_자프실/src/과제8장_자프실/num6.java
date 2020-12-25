package 과제8장_자프실;

import java.awt.*;
import javax.swing.*;
 
public class num6 extends JFrame{
	num6(){
        setTitle("Random Labels");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane(); 
        setSize(300,300);
        c.setLayout(null);
        
        for(int i = 0; i < 20; i++) {
            JLabel label = new JLabel(Integer.toString(i));
            
            int x = (int)(Math.random()*220) + 30;
            int y = (int)(Math.random()*220) + 30;
            
            label.setLocation(x,y);
            label.setSize(20,20);
            label.setForeground(Color.MAGENTA);
            c.add(label);
        }  
       
        setVisible(true);
    }
    public static void main(String[] argv) {
        new num6();
    }
}
