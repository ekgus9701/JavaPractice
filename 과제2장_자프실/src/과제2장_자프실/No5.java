package 과제2장_자프실;
import java.util.Scanner;
public class No5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		
		boolean a=sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		
		switch(op){
			case "AND" :
				if(a == true && b == true)
					System.out.println("true");
				else 
					System.out.println("false");
				break;
			case "OR" :
				if(a == true || b == true)
					System.out.println("true");
				else 
					System.out.println("false");
				break;
		}
	}

}
