package ����2��_������;
import java.util.Scanner;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int m = sc.nextInt();
		
		int a = m / 50000;
		int b = m %50000;
		int c = b /10000;
		int d = b %10000;
		int e = d / 1000;
		int f = d % 1000;
		int g = f / 500;
		int h = f % 500;
		int i = h / 100;
		int j = h % 100;
		int k = j / 10;
		int l = j % 10;

		System.out.printf("������ %d��, ���� %d��, õ�� %d��, 500�� %d��, 100�� %d��, 10�� %d��, 1�� %d��",a,c,e,g,i,k,l);
	}

}
