package chap3;
import java.util.Scanner;
public class PrimeTest {
	public static boolean isPrime(int num){
		int k=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				k=1;
				
			}
			else k=0;
		}
		if (k==1) {
			return true;
		}
		else
			return false;
		
		
		
	}

	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPrime(num))
			System.out.println(num+"�� �Ҽ�");
		else
			System.out.println(num+"�� �Ҽ� �ƴ�");
		

	}

}
