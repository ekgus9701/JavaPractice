import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner (System.in);
		System.out.println("exit�� �Է��ϸ� ����!");
		
		while(true) {
			
			System.out.print(">>������ �Է�<<");
			String text = a.nextLine();
			
			if(text.equals("exit"))
				break;
		}
		System.out.println("���α׷��� �����մϴ�!");
		a.close();
	}
	

}
