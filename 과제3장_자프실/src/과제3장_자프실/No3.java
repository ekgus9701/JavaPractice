package 과제3장_자프실;
import java.util.Scanner;
import java.util.InputMismatchException;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		try {
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
			}
		catch(InputMismatchException e){
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
			
		}
		

	}

}
