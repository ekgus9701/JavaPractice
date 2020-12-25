package chap2;
import java.util.*;
public class chap2_2 {

	public static void main(String[] args) {
		System.out.println("이름, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("당신의 이름은 " +name);
		boolean single=sc.nextBoolean();
		System.out.println("당신의 독신여부는 "+single);
		

	}

}
