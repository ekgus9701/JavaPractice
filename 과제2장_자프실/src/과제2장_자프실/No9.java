package 과제2장_자프실;
import java.util.Scanner;
public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		int a=sc.nextInt();
		int first = a/10;
		int second = a%10;
		
		if(first==3||first==6||first==9) {
			if(second==3||second==6||second==9) {
				System.out.println("박수짝짝");
				
			}
			else {
				System.out.println("박수짝");
			}
		}
		if(first!=3&&first!=6&&first!=9) {
			if(second==3||second==6||second==9) {
				System.out.println("박수짝");
				
			}
			else {
				System.out.println("박수없음");
			}
		}
	}

}
