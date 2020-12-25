import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class num3 extends JFrame {
	
	public num3() {
		setTitle("그래픽 문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createButton();
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num3();
	}
	public void createButton() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn=new JButton("클릭하세요");
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setContentPane(new MyPanel());
				//repaint();
		}
		});
	
		c.add(btn);
		
		}
	}
	
	class MyPanel extends JPanel{
		int i=0;
		public void paintComponent(Graphics g) {
			int x=(int)(Math.random()*450);
			int y=(int)(Math.random()*450);
			super.paintComponent(g);
			
			if(i%5==0) {
				g.setColor(Color.RED);
				g.fillRect(x, y, 50, 50);
				i+=1;
			}
			
			if(i%5==1) {
				g.setColor(Color.GREEN);
				g.fillRect(x, y, 50, 50);
				i+=1;
			}
			if(i%5==2) {
				g.setColor(Color.BLUE);
				g.fillRect(x, y, 50, 50);
				i+=1;
			}
			if(i%5==3) {
				g.setColor(Color.YELLOW);
				g.fillRect(x, y, 50, 50);
				i+=1;
			}
			if(i%5==4) {
				g.setColor(Color.BLACK);
				g.fillRect(x, y, 50, 50);
				i+=1;
			}
		}

}
