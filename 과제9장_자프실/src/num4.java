import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num4 extends JFrame {
	
	public num4() {
		this.setTitle("+,- Å°·Î Æù...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container con = getContentPane();
		
		con.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		con.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
            	Font f = la.getFont();
				int size = f.getSize();
				if(e.getKeyChar() == '+') {
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-' && size > 10) {
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});
		
		con.add(la);
		
		this.setSize(400, 300);
		this.setVisible(true);
		
		con.setFocusable(true);
		con.requestFocus();
	}
	
	public static void main(String[] args) {
		new num4();
	}
}