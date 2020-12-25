import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num1 extends JFrame{
	private JLabel [] label = new JLabel[4];
	private ImageIcon [] img = { 
			new ImageIcon("C:\\Users\\lg\\Desktop\\images\\img1.jpg"),
			new ImageIcon("C:\\Users\\lg\\Desktop\\images\\img2.jpg"),
			new ImageIcon("C:\\Users\\lg\\Desktop\\images\\img3.jpg"),
			new ImageIcon("C:\\Users\\lg\\Desktop\\images\\img4.jpg")
	};
	public num1() {
		this.setTitle("4 Images");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout());
		
		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel(img[i]);
			c.add(label[i]);
		}
		
		this.setSize(800, 250);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new num1();
	}
}
