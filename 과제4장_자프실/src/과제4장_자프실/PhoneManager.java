package ����4��_������;
import java.util.*;

class Phones{
	String name,tel;
	
	public Phones(String na,String te) {
		this.name=na;
		this.tel=te;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	

}
public class PhoneManager {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�ο���>>");
		int n=sc.nextInt();
		Phones[] p;
		p=new Phones[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			String name=sc.next();
			String tele=sc.next();
			p[i]=new Phones(name,tele);
		
		}
		System.out.println("����Ǿ����ϴ�.");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String str=sc.next();
			if(str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			}
			
			for(int i=0;i<n;i++) {
				if(str.equals(p[i].getName())) {
					System.out.println(str+"�� ��ȣ�� "+p[i].getTel()+" �Դϴ�.");
				}
			}
			
			
		}
		
		

	}

}
