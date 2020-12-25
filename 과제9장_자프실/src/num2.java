import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num2 extends JFrame {
	public num2() {
		this.setTitle("키 누르기 ...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container con = getContentPane();
		
		con.setBackground(Color.CYAN);
		
		con.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'R') {
					
					con.setBackground(Color.RED);
				}
			}
			public void keyReleased(KeyEvent e) {
				con.setBackground(Color.CYAN);
			}
			public void keyTyped(KeyEvent e) {}
		});
		
		this.setSize(400, 300);
		this.setVisible(true);
		
		con.setFocusable(true);
		con.requestFocus();
	}
	
	public static void main(String[] args) {
		new num2();
	}
}