import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num7 extends JFrame {
	private JLabel la;
	public num7() {
		this.setTitle("0으로 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		c.add(new FirstPanel(), BorderLayout.NORTH);
		c.add(new SecondPanel(), BorderLayout.SOUTH);
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	private class FirstPanel extends JPanel {
		public FirstPanel() {
			setLayout(new FlowLayout());
			
			la = new JLabel(Integer.toString((int)(Math.random()*59)+1));
			la.setFont(new Font("Arial", Font.PLAIN, 30));
			add(la);
		}
	}
	
	private class SecondPanel extends JPanel {
		public SecondPanel() {
			setLayout(new FlowLayout());
			
			JButton [] button = new JButton[3];
			button[0] = new JButton("+2");
			button[1] = new JButton("-1");
			button[2] = new JButton("%4");
			
			for(int i = 0; i < 3; i++) {
				button[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton b = (JButton)e.getSource();
						if(b == button[0]) {
							la.setText(Integer.toString(Integer.parseInt(la.getText()) + 2));
							button[0].setEnabled(false);
							if(button[1].isEnabled() == false && button[2].isEnabled() == false) {
								setTitle("실패");
							}
						}
						else if(b == button[1]) {
							la.setText(Integer.toString(Integer.parseInt(la.getText()) - 1));
							button[1].setEnabled(false);
							if(la.getText().equals("0")) {
								new num7();
								dispose();
							}
							else if(button[0].isEnabled() == false && button[2].isEnabled() == false) {
								setTitle("실패");
							}
						}
						else if(b == button[2]) {
							la.setText(Integer.toString(Integer.parseInt(la.getText()) % 4));
							button[2].setEnabled(false);
							if(la.getText().equals("0")) {
								new num7();
								dispose();
							}
							else if(button[0].isEnabled() == false && button[1].isEnabled() == false) {
								setTitle("실패");
							}
						}
					}
				});

				add(button[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new num7();
	}
}