package ����2��_������;
import java.util.Scanner;
public class No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money=0;
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String menu=sc.next();
		int a=sc.nextInt();
		if(menu.equals("����������")) {
			money=2000*a;
			
		}
		if(menu.equals("�Ƹ޸�ī��")) {
			money=2500*a;
			
		}
		if(menu.equals("īǪġ��")) {
			money=3000*a;
			
		}
		if(menu.equals("ī���")) {
			money=3500*a;
			
		}
		System.out.println(money+"���Դϴ�.");
		
		
	}

}
