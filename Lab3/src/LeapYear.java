import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		int year;
		
		System.out.println("������ �Է��ϼ���: ");
		
		year = num.nextInt();
		
		if((year%4==0 && year%100!=0)|| year%400==0)
			System.out.println("����!");
		else System.out.println("���!");
		
		num.close();
	}

}
