package 자프실_기말준비;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new GridLayout(1,10));
		
		for(int i=0;i<10;i++) {
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			cp.add(button);
		}
		
		setSize(500,200);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}