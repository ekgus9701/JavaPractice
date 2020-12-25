package 과제8장_자프실;
import java.awt.*;
import javax.swing.*;
 
public class num4 extends JFrame{
    num4(){
        Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW,Color.GREEN,
        		Color.CYAN, Color.BLUE,Color.MAGENTA, Color.GRAY,
        		Color.PINK, Color.LIGHT_GRAY};
 
        setTitle("Ten Color Buttons Frame");
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));
        
        for(int i = 0; i < 10; i++) {
        	JButton but=new JButton(Integer.toString(i));
            but.setOpaque(true);
            but.setBackground(color[i]);
            c.add(but);
        }
        
        setVisible(true);
    }
    public static void main(String[] argv) {
        new num4();
    }
}
