import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num3_1 extends JFrame {
	
	public num3_1() {
		this.setTitle("�� �̹��� ������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image img1 = new ImageIcon("C:\\Users\\lg\\Desktop\\��ȭ\\2-2\\java���α׷��ֹ׽ǽ�\\images_11\\a.jpg").getImage();
			Image img2 = new ImageIcon("C:\\Users\\lg\\Desktop\\��ȭ\\2-2\\java���α׷��ֹ׽ǽ�\\images_11\\b.jpg").getImage();
			
			g.drawImage(img1, 0, 0, getWidth()/2, getHeight(), this);
			g.drawImage(img2, getWidth()/2, 0, getWidth()/2, getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new num3_1();
	}
}