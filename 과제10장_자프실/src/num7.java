import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num7 extends JFrame {
	private JLabel la;
	private Point sp;
	
	public num7() {
		this.setTitle("이미지 드래깅");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(null);
		
		ImageIcon imgIcon = new ImageIcon("C:\\Users\\lg\\Desktop\\images\\img.jpg");
		la = new JLabel(imgIcon);
		
		int width = imgIcon.getIconWidth();
		int height = imgIcon.getIconHeight();
		
		la.setBounds(150, 150, width, height);
		la.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sp = e.getPoint();
			}
		});
		
		la.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				Point p1 = e.getPoint();
                Point p2 = la.getLocation();
                la.setLocation(p2.x + p1.x - sp.x, p2.y + p1.y - sp.y);
            }
			public void mouseMoved(MouseEvent e) {}
		});
		
		c.add(la);
		
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new num7();
	}
}