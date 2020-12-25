import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num5 extends JFrame {
	
	public num5() {
		this.setTitle("���콺�� ��ٰ�...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private Vector<Point> v = new Vector<Point>();
		
		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point p = e.getPoint();
					v.add(p);
					
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLACK);
			
			for(int i = 0; i < v.size(); i++) {
				if(i == 0) {
					g.drawLine(v.elementAt(0).x, v.elementAt(0).y, v.lastElement().x, v.lastElement().y);
				}
			}
			for(int i = 0; i < v.size() - 1; i++) {
				g.drawLine(v.elementAt(i).x, v.elementAt(i).y, v.elementAt(i+1).x, v.elementAt(i+1).y);
			}
		}
	}
	
	public static void main(String[] args) {
		new num5();
	}
}