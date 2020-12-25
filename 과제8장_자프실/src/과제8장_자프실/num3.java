package 과제8장_자프실;

import java.awt.*;
import javax.swing.*;

public class num3 extends JFrame {
	public num3() {
		setTitle("FlowLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("100 + 200"));
		c.add(new JButton("="));
		c.add(new JLabel("300"));
		setSize(400, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new num3();
	}
}