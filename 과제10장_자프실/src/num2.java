import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num2 extends JFrame{

	public num2() {
		this.setTitle("�޴� �����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		this.setSize(300, 400);
		this.setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu [] menu = new JMenu[4];
		String [] menuName = { "����", "����", "����", "�Է�" };
		
		for(int i = 0; i < menu.length; i++) {
			menu[i] = new JMenu(menuName[i]);
			menuBar.add(menu[i]);
			
			if(menu[i].getText().equals("����")) {
				menu[i].add(new JMenuItem("ȭ��Ȯ��"));
				menu[i].addSeparator();
				menu[i].add(new JMenuItem("������"));
			}
		}
		
		setJMenuBar(menuBar);
	}
	
	public static void main(String[] args) {
		new num2();
	}
}