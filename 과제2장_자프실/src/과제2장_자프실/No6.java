package 과제2장_자프실;
import java.util.Scanner;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
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

		System.out.printf("오만원 %d개, 만원 %d개, 천원 %d개, 500원 %d개, 100원 %d개, 10원 %d개, 1원 %d개",a,c,e,g,i,k,l);
	}

}
