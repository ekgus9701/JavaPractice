package ����5��_������;
import java.util.*;
abstract class Shape{
	abstract void draw();
}

class MethodOverriding extends Shape{
	Scanner sc = new Scanner(System.in);
	
	int i=0;
	private String [] Shape = new String[10];
	
	public void insert() {
		System.out.print("���� ���� Line(1), Rect(2), Circle(3) >>");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Shape[i]= "Line";
			i++;
			break;
		
		case 2:
			Shape[i]= "Rect";
			i++;
			break;
			
		case 3:
			Shape[i]= "Circle";
			i++;
			break;
		}
	}
	
	public void delete() {
		System.out.print("������ ������ ��ġ>>");
		int num=sc.nextInt();
		
		if(i<num) {
			System.out.println("������ �� �����ϴ�.");
		}
		else {
			Shape[num-1]=null;
		}
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		for(int j=0;j<i;j++) {
			System.out.println(Shape[j]);
		}
		
	}
	
}

public class MethodOverridingEx{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		MethodOverriding m = new MethodOverriding();
		
		boolean b=true;
		while(b==true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				m.insert();
				break;
			case 2 :
				m.delete();
				break;
			case 3 :
				m.draw();
				break;
			case 4 :
				System.out.println("���α׷��� �����մϴ�...");
				b=false;
				break;
				
			}
		}
	}
	
}

