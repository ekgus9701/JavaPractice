import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num10 extends JFrame{
	private HashMap<String, String> h = new HashMap<String, String>();
	private JTextField textF1;
	private JTextField textF2;
	private JButton [] btn = new JButton[4];
	private String [] btn_text = { "저장", "찾기", "삭제", "모두 보기" };
	private Color [] btn_color = { Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.CYAN };
	private JLabel la;
	private JTextArea ta;

	public num10() {
		this.setTitle("단어 사전 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
				
		textF1 = new JTextField(8);
		textF2 = new JTextField(8);
		ta = new JTextArea(7, 20);
		la = new JLabel(Integer.toString(h.size()));
		
		c.add(new JLabel("영어"));
		c.add(textF1);
		c.add(new JLabel("한글"));
		c.add(textF2);
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btn_text[i]);
			btn[i].setBackground(btn_color[i]);
			c.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					
					if(b == btn[0] && !textF1.getText().equals("")) {
						
						if(h.containsKey(textF1.getText())) {
							h.put(textF1.getText(), textF2.getText());
							ta.setText(ta.getText() + "변경 " + "(" + textF1.getText() + ", " + textF2.getText() + ")\n");
						}
						else {
							h.put(textF1.getText(), textF2.getText());
							ta.setText(ta.getText() + "삽입 " + "(" + textF1.getText() + ", " + textF2.getText() + ")\n");
							la.setText(Integer.toString(h.size()));
						}
						textF1.setText("");
						textF2.setText("");
					}
					
					else if(b == btn[1] && h.size() != 0){
						Set<String> keys = h.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = h.get(key);
							if(textF1.getText().equals(key)) {
								textF2.setText(value);
							}
						}
					}
					else if(b == btn[2] && h.size() != 0) {
						if(h.containsKey(textF1.getText())) {
							ta.setText(ta.getText() + "삭제 " + "(" + textF1.getText() + ", " + h.get(textF1.getText()) + ")\n");
							h.remove(textF1.getText());
						}
						la.setText(Integer.toString(h.size()));
					}
					else {
						ta.setText("");
						Set<String> keys = h.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = h.get(key);
							ta.setText(ta.getText() + "단어 " + "(" + key + ", " + value + ")\n");
						}
						la.setText(Integer.toString(h.size()));
					}
				}
			});
		}
		
		c.add(la);
		c.add(new JScrollPane(ta));
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new num10();
	}
}