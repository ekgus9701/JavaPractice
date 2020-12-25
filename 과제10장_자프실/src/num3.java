import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num3 extends JFrame{
	private JRadioButton [] radioB = new JRadioButton[2];
	private String [] color = { "Red", "Blue" };

	public num3() {
		this.setTitle("Two Radio ...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		ButtonGroup buttonG = new ButtonGroup();
		
		for(int i = 0; i < radioB.length; i++) {
			radioB[i] = new JRadioButton(color[i]);
			c.add(radioB[i]);
			radioB[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JRadioButton r = (JRadioButton)e.getSource();
					if(e.getActionCommand() == "Red") {
						c.setBackground(Color.RED);
					}
					else {
						c.setBackground(Color.BLUE);
					}
				}
			});
			buttonG.add(radioB[i]);
		}
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new num3();
	}
}