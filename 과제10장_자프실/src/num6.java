import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num6 extends JFrame{
	private JTextField textf1;
	private JTextField textf2;
	private JRadioButton [] rb = new JRadioButton[4];
	private String [] rb_text = {"decimal", "binary", "octal", "hex"};

	public num6() {
		this.setTitle("Digit Changer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		ButtonGroup buttonG = new ButtonGroup();
		
		textf1 = new JTextField(10);
		textf2 = new JTextField(10);
		
		c.add(textf1);
		c.add(new JLabel("->"));
		c.add(textf2);
		
		for(int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(rb_text[i]);
			c.add(rb[i]);
			
			rb[i].addItemListener(new ItemListener() {
				
				public void itemStateChanged(ItemEvent e) {
					
					if(e.getStateChange() == ItemEvent.SELECTED && !textf1.getText().equals("")) {
						if(e.getItem() == rb[0]) {
							textf2.setText(Integer.toString(Integer.parseInt(textf1.getText())));
						}
						else if(e.getItem() == rb[1]) {
							textf2.setText(Integer.toBinaryString(Integer.parseInt(textf1.getText())));
						}
						else if(e.getItem() == rb[2]) {
							textf2.setText(Integer.toOctalString(Integer.parseInt(textf1.getText())));
						}
						else {
							textf2.setText(Integer.toHexString(Integer.parseInt(textf1.getText())));
						}
					}
				}
			});
			buttonG.add(rb[i]);

		}
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new num6();
	}
}