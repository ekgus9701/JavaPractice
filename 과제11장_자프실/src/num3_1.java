import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num3_1 extends JFrame {
	
	public num3_1() {
		this.setTitle("두 이미지 나란히");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image img1 = new ImageIcon("C:\\Users\\lg\\Desktop\\이화\\2-2\\java프로그래밍및실습\\images_11\\a.jpg").getImage();
			Image img2 = new ImageIcon("C:\\Users\\lg\\Desktop\\이화\\2-2\\java프로그래밍및실습\\images_11\\b.jpg").getImage();
			
			g.drawImage(img1, 0, 0, getWidth()/2, getHeight(), this);
			g.drawImage(img2, getWidth()/2, 0, getWidth()/2, getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new num3_1();
	}
}