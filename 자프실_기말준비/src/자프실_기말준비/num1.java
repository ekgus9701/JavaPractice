package ������_�⸻�غ�;
import java.awt.event.*;

import java.awt.*;
import javax.swing.*;

public class num1 extends JFrame {
	private JRadioButton [] animals= new JRadioButton[2];
	private String [] names = {"�罿","��"};
	public num1() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		createRadioButton();
		createText();
		createxy();
		setSize(500,500);
		setVisible(true);
		
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu=new JMenu("������");
		JMenuItem [] menuItem = new JMenuItem[2];
		String[] itemTitle = {"�Ķ���","������"};
		
		MenuActionListener listener = new MenuActionListener();
		for(int i=0;i<menuItem.length;i++) {
			menuItem[i]=new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		
		mb.add(screenMenu);
		setJMenuBar(mb);
		
	}
	
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Container cp=getContentPane();
			//cp.setLayout(new FlowLayout());
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "�Ķ���":
				cp.setBackground(Color.BLUE);
				break;
			
			case "������":
				cp.setBackground(Color.RED);
				break;
		}
		}
	}
	public void createRadioButton() {
		Container c=getContentPane();
		c.setLayout(null);
		ButtonGroup g = new ButtonGroup();
		MyItemListener listener = new MyItemListener();
		for(int i=0;i<animals.length;i++) {
			animals[i]=new JRadioButton(names[i]);
			animals[i].setLocation(i*20,30);
			//animals[i].setSize(20.20);
			g.add(animals[i]);
			c.add(animals[i]);
			animals[i].addItemListener(listener);
		}
		
	}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			Container cp=getContentPane();
			cp.setLayout(null);
			cp.add(new JLabel("�罿"));
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==animals[0]) {
					cp.add(new JLabel("�罿"));
					ImageIcon img = new ImageIcon("images\\image0.jpg");
					JLabel imageLabel = new JLabel(img);
					imageLabel.setLocation(10,40);
					cp.add(imageLabel);
				}
				if(e.getItem()==animals[1]) {
					cp.add(new JLabel("��"));
					ImageIcon img = new ImageIcon("images\\image1.jpg");
					JLabel imageLabel = new JLabel(img);
					imageLabel.setLocation(10,40);
					cp.add(imageLabel);
				}
					
			}
			
		}	
		
	}
	
	public void createText() {
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout()); //null�� �ߴµ� �ƹ��͵� �������ʾƼ� flowlayout���ζ� �����ߴ�.
		cp.add(new JLabel("x��ǥ: "));
		cp.add(new JTextField(15));
		cp.add(new JLabel("y��ǥ: "));
		cp.add(new JTextField(15));
	}
	public void createxy() {
		
		Container c= getContentPane();
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
	}
	
	class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			//public void mouseEntered(MouseEvent e) {
			Container cp= getContentPane();
			JLabel la = new JLabel("x: "+e.getX()+ "y:"+e.getY());
			cp.add(la);
			//}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num1();
	}

}
