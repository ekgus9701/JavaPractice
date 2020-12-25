package chap2;
import java.util.*;
public class chap2_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int n=sc.nextInt();
		int n1=n/100;
		n=n%100;
		int n2=n/10;
		n=n%10;
		int sum=n1+n2+n;
		System.out.print("각 자릿수의 합 "+sum);

	}

}
