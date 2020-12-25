import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num3 extends JFrame {
	public num3() {
		this.setTitle("µå·¡±ëµ¿¾È...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container con = getContentPane();
		
		con.setBackground(Color.GREEN);
		
		con.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				con.setBackground(Color.GREEN);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		con.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				con.setBackground(Color.YELLOW);
			}
			public void mouseMoved(MouseEvent e) {}
		});
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new num3();
	}
}