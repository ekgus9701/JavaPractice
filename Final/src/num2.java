import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class num2  extends JFrame {
	JRadioButton [] animals= new JRadioButton[3];
	String [] names = {"강아지","고양이","토끼"};
	ImageIcon[] i = {new ImageIcon("images\\dog.jpg"),
			new ImageIcon("images\\cat.jpg"),
			new ImageIcon("images\\rabbit.jpg")};
	JLabel la=new JLabel();
	
	public num2() {
		this.setTitle("애완동물 ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new BorderLayout());
		ButtonGroup g = new ButtonGroup();
		JPanel jp=new JPanel();
		
		MyItemListener listener = new MyItemListener();
		for(int i=0;i<animals.length;i++) {
			animals[i]=new JRadioButton(names[i]);
			g.add(animals[i]);
			
			animals[i].addItemListener(new MyItemListener());
			jp.add(animals[i]);
		}
		this.add(jp,BorderLayout.NORTH);
		this.add(la,BorderLayout.CENTER);

		setSize(600,400);
		setVisible(true);
		
	}

	class MyItemListener implements ItemListener {
		
		public void itemStateChanged(ItemEvent e) {
			Container c =getContentPane();
			c.setLayout(new FlowLayout());
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(animals[0].isSelected()){
				la.setIcon(i[0]);
			}
			else if(animals[1].isSelected()){
				la.setIcon(i[1]);
			}
			else{
				la.setIcon(i[2]);
			}
		}
	}
					
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num2();
	}

}
