package ����2��_������;
import java.util.Scanner;
public class No8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money=0;
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String menu=sc.next();
		int a=sc.nextInt();
		switch(menu) {
			case "����������":
				money=2000*a;
				break;
			case "�Ƹ޸�ī��":
				money=2500*a;
				break;
			case "īǪġ��":
				money=3000*a;
				break;
			case "ī���":
				money=3500*a;
				break;
				
				
		}
		System.out.println(money+"���Դϴ�.");
		
		
	}

}

