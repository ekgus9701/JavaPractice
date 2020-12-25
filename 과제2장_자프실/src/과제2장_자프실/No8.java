package 과제2장_자프실;
import java.util.Scanner;
public class No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money=0;
		System.out.print("커피 주문하세요>>");
		String menu=sc.next();
		int a=sc.nextInt();
		if(menu.equals("에스프레소")) {
			money=2000*a;
			
		}
		if(menu.equals("아메리카노")) {
			money=2500*a;
			
		}
		if(menu.equals("카푸치노")) {
			money=3000*a;
			
		}
		if(menu.equals("카페라떼")) {
			money=3500*a;
			
		}
		System.out.println(money+"원입니다.");
		
		
	}

}
