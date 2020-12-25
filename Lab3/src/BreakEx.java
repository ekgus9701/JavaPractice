import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner (System.in);
		System.out.println("exit를 입력하면 종료!");
		
		while(true) {
			
			System.out.print(">>데이터 입력<<");
			String text = a.nextLine();
			
			if(text.equals("exit"))
				break;
		}
		System.out.println("프로그램을 종료합니다!");
		a.close();
	}
	

}
