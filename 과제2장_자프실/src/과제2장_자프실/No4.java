package ����2��_������;
import java.util.Scanner;
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		if(x>50 && x<100) {
			if(y>50 && y<100) {
				System.out.printf("��(%d,%d)�� ��(50,50)�� ��(100,100)�� �簢�� ���� �ֽ��ϴ�.",x,y);
			}
			else {
				System.out.printf("��(%d,%d)�� ��(50,50)�� ��(100,100)�� �簢�� ���� �����ʽ��ϴ�.",x,y);
			}
			
	}
		else {
			System.out.printf("��(%d,%d)�� ��(50,50)�� ��(100,100)�� �簢�� ���� �����ʽ��ϴ�.",x,y);
		}

}
}
