package chap2;
import java.util.*;
public class chap2_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		int n=sc.nextInt();
		int n1=n/100;
		n=n%100;
		int n2=n/10;
		n=n%10;
		int sum=n1+n2+n;
		System.out.print("�� �ڸ����� �� "+sum);

	}

}
