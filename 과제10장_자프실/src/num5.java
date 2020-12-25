import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class num5 extends JFrame{
	private JTextArea textAr = new JTextArea(7, 28);
	public void creatMenu() {
		JMenuBar menuB = new JMenuBar();
		JMenu m = new JMenu("파일");
		JMenuItem menuI = new JMenuItem("저장");
		
		menuI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textAr.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "입력한 내용이 없습니다", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				else {
					String fileName = JOptionPane.showInputDialog("저장할 파일명을 입력하세요.");
					if(fileName == null) {
						return;
					}
					try {
						FileWriter fileW = new FileWriter(fileName);
						String s = textAr.getText();
						StringTokenizer st = new StringTokenizer(textAr.getText(), "\n");
						
						while(st.hasMoreTokens()) {
							fileW.write(st.nextToken());
							fileW.write("\r\n");
						}
					}
					catch (IOException e1) {};
				}
			}
		});
		
		m.add(menuI);
		menuB.add(m);
		
		setJMenuBar(menuB);
	}
	
	public num5() {
		this.setTitle("파일 저장");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		creatMenu();
		textAr.setLineWrap(true);
		c.add(new JScrollPane(textAr), BorderLayout.CENTER);
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new num5();
	}
}