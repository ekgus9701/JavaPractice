import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class num1 extends JFrame {
	public num1(){
		setTitle("배경색 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createButton();
		setSize(500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num1();
	}
	public void createButton() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn=new JButton("클릭");
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				getContentPane().setBackground(new Color(r,g,b));
			}
		});
	
		c.add(btn);
		
		}
}


