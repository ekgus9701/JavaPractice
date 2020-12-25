import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Bonus2 extends JFrame {
	private JButton [] button = new JButton[16];			// ��ư
	private JTextField firstTextfield = new JTextField(10);		// ù ��° �ؽ�Ʈ �ʵ�
	private JTextField secondTextfield = new JTextField(10);	// �� ��° �ؽ�Ʈ �ʵ�
	private int [] changeOperand = new int[10];			// ���� �Լ��� �̿��ؼ� �ι�° �ǿ����ڸ� ó���ϱ� ���� �迭
	private int firstOperand = 0;			// ù ��° �ǿ�����
	private int secondOperand = 0;			// �� ��° �ǿ�����
	private char operator;				// ������
	
	public Bonus2() {
		this.setTitle("������ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(3, 3));
		
		c.add(new FirstPanel(), BorderLayout.NORTH);
		c.add(new SecondPanel());
		
		this.setSize(300, 300);
		this.setVisible(true);

	}
	
	private class FirstPanel extends JPanel {		// ù ��° �г� ����
		public FirstPanel() {
			setBackground(Color.GRAY);
			setLayout(new FlowLayout());
			
			add(new JLabel("����"));
			
			add(firstTextfield);
			firstTextfield.setEditable(false);		// ����ڰ� Ű����� ���� �Է��� �� ������ ó��
			
			add(new JLabel("���"));
			
			add(secondTextfield);
			secondTextfield.setEditable(false);		// ����ڰ� Ű����� ���� �Է��� �� ������ ó��
		}
	}
	
	private class SecondPanel extends JPanel {		// �� ��° �г� ����
		public SecondPanel() {
			setLayout(new GridLayout(4, 4, 5, 5));
			
			for(int i = 0; i < 10; i++) {
				button[i] = new JButton(Integer.toString(i));
				button[i].addActionListener(new MyActionListener());
				add(button[i]);
			}
			
			JButton button_ce = new JButton("CE");
			JButton button_calc = new JButton("���");
			JButton button_add = new JButton("+");
			JButton button_sub = new JButton("-");
			JButton button_mul = new JButton("x");
			JButton button_div = new JButton("/");
			
			button_ce.addActionListener(new MyActionListener());
			button_calc.addActionListener(new MyActionListener());
			button_add.addActionListener(new MyActionListener());
			button_sub.addActionListener(new MyActionListener());
			button_mul.addActionListener(new MyActionListener());
			button_div.addActionListener(new MyActionListener());
			
			button_add.setBackground(Color.CYAN);
			button_sub.setBackground(Color.CYAN);
			button_mul.setBackground(Color.CYAN);
			button_div.setBackground(Color.CYAN);
			
			add(button_ce);
			add(button_calc);
			add(button_add);
			add(button_sub);
			add(button_mul);
			add(button_div);
		}

	
	}
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			
			int index = 0;
			// changeOperand �迭�� ������ Ȯ���ϱ� ���� ����� ����
			
			if(button.getText().equals("CE")) {		// ���� ���õ� ��� ���� �ʱ�ȭ
				firstTextfield.setText("");
				secondTextfield.setText("");
				firstOperand = 0;
				secondOperand = 0;
			}
			else if(button.getText().equals("���")) {
				String str = firstTextfield.getText();
				for(int i = firstTextfield.getText().length()-1; i >= 0; i--) {
					char c = str.charAt(i);
					// ù ��° �ؽ�Ʈ �ʵ忡 ����Ǿ� �ִ� ���ڸ� �ڿ��� ���� �ϳ��� �о����(�� ��° �ǿ����ڸ� ã�� ����)
					
					if(c == '+' | c == '-' | c == 'x' | c == '/') { 
						operator = c;
						break;
					}
					// �����ڸ� �������� ������ �ؽ�Ʈ�� �ǿ������̱� ������ �����ڸ� ã���� �� �̻� ������ �� �ʿ䰡 ����
					
					else {
						changeOperand[index] = Integer.parseInt(Character.toString(c));
						secondOperand += changeOperand[index]*(Math.pow(10, index));
						// ���� �Լ��� ����ؼ� �� ��° �ǿ����� ó��
						
						index++;
					}
				}
				
				switch(operator) {
				case '+':
					secondTextfield.setText(Float.toString(firstOperand + secondOperand));
					break;
				case '-':
					secondTextfield.setText(Float.toString(firstOperand - secondOperand));
					break;
				case 'x':
					secondTextfield.setText(Float.toString(firstOperand * secondOperand));
					break;
				case '/':
					secondTextfield.setText(Float.toString(firstOperand / secondOperand));
					break;
				}
			}
			
			else if(button.getText().equals("+") | button.getText().equals("-") | button.getText().equals("x") | button.getText().equals("/")) {
			// �ؽ�Ʈ �ʵ忡 �����ڰ� �ԷµǸ� ������ �ԷµǾ��� �ؽ�Ʈ���� ù ��° �ǿ����ڷ� firstOperand ������ ����

				firstOperand = Integer.parseInt(firstTextfield.getText());
		
				switch(button.getText()) {
				case "+":
					firstTextfield.setText(firstTextfield.getText() + "+");
					break;
				case "-":
					firstTextfield.setText(firstTextfield.getText() + "-");
					break;
				case "x":
					firstTextfield.setText(firstTextfield.getText() + "x");
					break;
				case "/":
					firstTextfield.setText(firstTextfield.getText() + "/");
					break;
				}
			}
			
			else {
				for(int i = 0; i < 10; i++) {
					if(button.getText().equals(Integer.toString(i))) {
						firstTextfield.setText(firstTextfield.getText() + Integer.toString(i));
					}
				}
			}
		}
	}
	
	public static void main(String args[]) {
		new Bonus2();
	}
}