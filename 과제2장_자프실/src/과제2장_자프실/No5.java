package ����2��_������;
import java.util.Scanner;
public class No5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		
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
