import java.util.*;
public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			String s=sc.nextLine();
			if(s.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			StringTokenizer st = new StringTokenizer(s," ");
			int n=st.countTokens();
			System.out.println("���� ������ "+n);
			
			
		}
		
		
		

	}

}