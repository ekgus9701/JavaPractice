package 자프실_기말준비;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import 자프실_기말준비.MouseListenerEx.MyMouseAdapter;

public class keyCharEx extends JFrame{
	private JLabel la=new JLabel("<Enter>키로 배경색이 바뀝니다.");
	
	public keyCharEx(){
		super("키 리스너의 문자키 입력예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		setSize(250,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			switch(e.getKeyChar()) {
			case '\n':
				la.setText("r="+r+", g="+g+", b="+b);
				getContentPane().setBackground(new Color(r,g,b));
				
				break;
			case 'q':
				System.exit(0);
			}
		}
			
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new keyCharEx();
	}

}
