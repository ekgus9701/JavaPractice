import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� ����!");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			
			if(text.equals("exit")) //"exit"�� �ԷµǸ� �ݺ� ����
				break;//while���� ���
			}
		System.out.println("�����մϴ�!");
		scanner.close();

	}

}
