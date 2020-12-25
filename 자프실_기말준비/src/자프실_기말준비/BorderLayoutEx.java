package 자프실_기말준비;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new BorderLayout(30,20));
		
		cp.add(new JButton("add"),BorderLayout.NORTH);
		cp.add(new JButton("sub"),BorderLayout.SOUTH);
		cp.add(new JButton("mul"),BorderLayout.EAST);
		cp.add(new JButton("div"),BorderLayout.WEST);
		cp.add(new JButton("calculate"),BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}