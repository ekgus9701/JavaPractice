import java.util.*;
public class StringRotateOnEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println("<Enter>�� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		
		while(true) {
			String key=sc.nextLine();
			if(key.equals("")) {
				String first = Character.toString(text.charAt(0));
				String last = text.substring(1);
				text=last.concat(first);
				System.out.println(text+" >>");
				
			}
			else if(key.equals("q"))
				break;
			else
				System.out.print(text+" >>");
		}
		System.out.println("�����մϴ�...");
		sc.close();
	}

}
