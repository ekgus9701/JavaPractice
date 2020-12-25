import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num5 extends JFrame {
	private int x, y;
	public num5() {
		this.setTitle("클릭 연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container con = getContentPane();
		
		con.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setLocation(50,50);
		la.setSize(30,30);
		
		la.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				JLabel la=(JLabel)e.getSource();
				Container c=la.getParent();
				int xBound=c.getWidth()-la.getWidth();
				int yBound=c.getHeight()-la.getHeight();
				int x=(int)(Math.random()*xBound);
				int y=(int)(Math.random()*yBound);
				la.setLocation(x, y);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		con.add(la);
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new num5();
	}
}