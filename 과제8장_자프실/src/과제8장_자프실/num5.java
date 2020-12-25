package 과제8장_자프실;

import java.awt.*;
import javax.swing.*;
 
public class num5 extends JFrame{
	num5(){
        Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,Color.CYAN, 
        		Color.BLUE, Color.MAGENTA, Color.GRAY,Color.PINK, Color.LIGHT_GRAY, 
        		Color.WHITE, Color.DARK_GRAY,Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA}; 
 
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,200);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,4));
        
        for(int i = 0; i < 16; i++) {
        	JLabel l=new JLabel(Integer.toString(i));;
            
            l.setOpaque(true);
            l.setBackground(color[i]);
            
            c.add(l);
        }
        
        setVisible(true);
        
    }
    public static void main(String[] argv) {
        new num5();
    }
}
