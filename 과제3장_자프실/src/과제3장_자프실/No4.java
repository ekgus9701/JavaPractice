package 과제3장_자프실;
import java.util.InputMismatchException;
import java.util.Scanner;
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i[]= {"일","월","화","수","목","금","토"};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요>>");
			
			
			try{
				
				int n=sc.nextInt();
				if(n<0) {
					System.out.println("프로그램 종료합니다...");
					break;
				}
				else {
					n=n%7;
					System.out.println(i[n]);
				}
				
			}
			catch(InputMismatchException e){
				System.out.println("경고! 수를 입력하지 않았습니다.");
				sc.next();
				
			
			}
			

			
			
		}
	}
}
