import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num4 extends JFrame{
	private JCheckBox [] checkB = new JCheckBox[2];
	private String [] checkT = { "버튼 비활성화", "버튼 감추기" };
	private JButton btn = new JButton("test button");

	public num4() {
		this.setTitle("CheckBox...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < checkB.length; i++) {
			checkB[i] = new JCheckBox(checkT[i]);
			c.add(checkB[i]);
			checkB[i].addItemListener(new ItemListener() {
				
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == checkB[0]) {
							btn.setEnabled(false);
						}
						else {
							btn.setVisible(false);
						}
					}
					else {
						if(e.getItem() == checkB[0]) {
							btn.setEnabled(true);
						}
						else {
							btn.setVisible(true);
						}
					}
				}
			});
		}
		
		c.add(btn);
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new num4();
	}
}