package 과제8장_자프실;
import java.awt.*;
import javax.swing.*;

public class num2 extends JFrame {
	num2(){
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(50,5));
        add(new JButton("Center"),BorderLayout.CENTER);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("East"),BorderLayout.EAST);
        
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] argv) {
        new num2();
    }
}
