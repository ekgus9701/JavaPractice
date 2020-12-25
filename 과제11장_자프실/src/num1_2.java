import java.awt.*;
import javax.swing.*;

public class num1_2 extends JFrame{

	public num1_2() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
		
		this.setContentPane(new MyPanel());
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.drawOval(50, 30, 50, 50);
			g.setColor(Color.BLACK);
			g.drawOval(110, 30, 50, 50);
			g.setColor(Color.RED);
			g.drawOval(170, 30, 50, 50);
			g.setColor(Color.YELLOW);
			g.drawOval(80, 60, 50, 50);
			g.setColor(Color.GREEN);
			g.drawOval(145, 60, 50, 50);

		}
	}
	
	
	public static void main(String[] args) {
		new num1_2();
	}
}