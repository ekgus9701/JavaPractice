package ����4��_������;
import java.util.*;
public class Phone {
	private String name,tel;
	
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name=sc.next();
		String pn=sc.next();
		Phone p1= new Phone(name,pn);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name1=sc.next();
		String pn1=sc.next();
		Phone p2= new Phone(name1,pn1);
		
		System.out.println(p1.getName()+"�� ��ȣ "+p1.getTel());
		System.out.println(p2.getName()+"�� ��ȣ "+p2.getTel());
		
		
		

	}

}
