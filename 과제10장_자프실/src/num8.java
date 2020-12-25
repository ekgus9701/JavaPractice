import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num8 extends JFrame{
	private JLabel [] lab = new JLabel[10];
	private int index = 0;

	public num8() {
		this.setTitle("Ten 레이블 클릭");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		Container c = getContentPane();
		
		c.setLayout(null);
		
		for(int i = 0; i < lab.length; i++) {
			
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			
			lab[i] = new JLabel(Integer.toString(i));
			lab[i].setBounds(x, y, 20, 20);
			lab[i].setForeground(Color.MAGENTA);
			c.add(lab[i]);
			lab[i].addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					
					if(lab[index] == la) {
						la.setVisible(false);
						index++;
						
						if(index == 10) {
							new num8();
							dispose();
						}
					}
				}
			});
		}
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new num8();
	}
}