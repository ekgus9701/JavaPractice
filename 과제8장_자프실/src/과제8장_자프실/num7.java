package 과제8장_자프실;

import java.awt.*;
import javax.swing.*;

public class num7 extends JFrame {
	public num7() {
		setTitle("3개의 패널을 가...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel N = new JPanel();
		JPanel C = new JPanel();
		JPanel S = new JPanel();
		
		c.add(N, BorderLayout.NORTH);
		c.add(C, BorderLayout.CENTER);
		c.add(S, BorderLayout.SOUTH);
		
		N.setBackground(Color.YELLOW);
		N.setLayout(new FlowLayout());
		N.add(new JButton("새로 배치"));
		N.add(new JButton("종료"));
		
		C.setLayout(null);
		JLabel [] label = new JLabel[10];
		int n1 = 0;
		int n2 = 0;
		for(int i = 0; i < 10; i++) {
			label[i] = new JLabel("*");
			n1 = (int)(Math.random()*200)+50;
			n2 = (int)(Math.random()*200)+50;
			label[i].setBounds(n1, n2, 20, 20);
			label[i].setForeground(Color.RED);
			c.add(label[i]);
		}
		
		S.setBackground(Color.LIGHT_GRAY);
		S.setLayout(new FlowLayout(FlowLayout.LEFT));
		S.add(new JButton("별 개수 수정"));
		S.add(new JTextField(13));
			
		setVisible(true);
	}
	public static void main(String[] args) {
		new num7();
	}
}