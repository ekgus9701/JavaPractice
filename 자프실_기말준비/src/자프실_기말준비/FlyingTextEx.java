package ������_�⸻�غ�;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ������_�⸻�غ�.MouseListenerEx.MyMouseAdapter;

public class FlyingTextEx extends JFrame{
	private JLabel la=new JLabel("Hello");
	private JPanel contentPane = new JPanel();
	
	public FlyingTextEx() {
		super("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(200,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-10);break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(),la.getY()+10);break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10,la.getY());break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10,la.getY());break;
			
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
