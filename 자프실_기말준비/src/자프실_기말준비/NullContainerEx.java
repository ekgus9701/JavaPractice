package 자프실_기말준비;
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.ORANGE);
		cp.setLayout(null);
		
		JLabel la = new JLabel("HEllO, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		cp.add(la);
		
		for(int i=0;i<10;i++) {
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			button.setLocation(i*15,i*15);
			button.setSize(50,20);
			cp.add(button);
		}
		
		setSize(300,200);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}