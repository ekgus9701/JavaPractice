package 과제2장_자프실;
import java.util.Scanner;
public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		String grade=sc.next();
		switch(grade) {
			case "A":
			case "B":
				System.out.println("Excellent");
				break;
			case "C":
			case "D":
				System.out.println("Good");
				break;
			case "F":
				System.out.println("Bye");
				break;
		}
		
	}

}
