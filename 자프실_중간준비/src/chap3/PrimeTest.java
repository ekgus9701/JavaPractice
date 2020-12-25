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
		System.out.print("양의 정수를 입력하세요 : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPrime(num))
			System.out.println(num+"는 소수");
		else
			System.out.println(num+"는 소수 아님");
		

	}

}
