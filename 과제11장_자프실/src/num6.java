import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num6 extends JFrame {
	
	public num6() {
		this.setTitle("그래픽 이미지 10%...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private Image img = new ImageIcon("C:\\Users\\lg\\Desktop\\이화\\2-2\\java프로그래밍및실습\\images_11\\apple.jpg").getImage();
		private int x = img.getWidth(this), y = img.getHeight(this);
		
		public MyPanel() {
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						x = x + x/10;
						y = y + y/10;
					}
					else if(e.getKeyChar() == '-') {
						x = x - x/10;
						y = y - y/10;
					}
					repaint();
				}
			});
			
			this.setFocusable(true);
			this.requestFocus();
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 10, 10, x, y, this);
		}
	}
	
	public static void main(String[] args) {
		new num6();
	}
}