import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num1 extends JFrame {
		public num1() {
			this.setTitle("마우스 올...");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
					
			Container con = getContentPane();
			
			con.setLayout(new FlowLayout());
			
			JLabel la = new JLabel("자기야");
			
			la.addMouseListener(new MouseListener() {
				public void mouseEntered(MouseEvent e) {
					la.setText("사랑해");
				}
				public void mouseExited(MouseEvent e) {
					la.setText("자기야");
				}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {}
			});
			
			con.add(la);
			
			this.setSize(400, 300);
			this.setVisible(true);
		}
		
		public static void main(String[] args) {
			new num1();
		}
}
