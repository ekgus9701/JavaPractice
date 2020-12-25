import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num4 extends JFrame {

	public num4() {
		this.setTitle("이미지 위에 원 드래...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private Point p = null;
		public MyPanel() {
			addMouseMotionListener(new MouseMotionListener() {
				public void mouseDragged(MouseEvent e) {
					p = e.getPoint();
					repaint();
				}
				public void mouseMoved(MouseEvent e) {}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image img = new ImageIcon("C:\\Users\\lg\\Desktop\\이화\\2-2\\java프로그래밍및실습\\images_11\\back.jpg").getImage();
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			g.setColor(Color.GREEN);
			
			if(p == null) return;
			g.fillOval(p.x, p.y, 15, 15);
			
		}
	}
	
	public static void main(String[] args) {
		new num4();
	}
}