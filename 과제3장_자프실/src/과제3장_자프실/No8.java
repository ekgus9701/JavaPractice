package ����3��_������;
import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� ���� ��!>>");
			String s = sc.next();
			if(s.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else {
				String str[]= {"����","����","��"};
				int n=(int)(Math.random()*3);
				String win=null; 
				if(s.equals("����")) {
					if(n==0) {
						win="�����ϴ�.";
					}
					if(n==1) {
						win="��ǻ�Ͱ� �̰���ϴ�.";
					}
					if(n==2) {
						win="��ǻ�Ͱ� �����ϴ�.";
					}
				}
				if(s.equals("����")) {
					if(n==1) {
						win="�����ϴ�.";
					}
					if(n==2) {
						win="��ǻ�Ͱ� �̰���ϴ�.";
					}
					if(n==0) {
						win="��ǻ�Ͱ� �����ϴ�.";
					}
				}
				if(s.equals("��")) {
					if(n==2) {
						win="�����ϴ�.";
					}
					if(n==0) {
						win="��ǻ�Ͱ� �̰���ϴ�.";
					}
					if(n==1) {
						win="��ǻ�Ͱ� �����ϴ�.";
					}
				}
				System.out.println("����� = "+s+" , ��ǻ�� = "+str[n]+", "+win);
			}
			
		
		}
		
		
	}

}
