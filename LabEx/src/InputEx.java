import java.util.Scanner;
import java.util.InputMismatchException;

public class InputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner (System.in);
		System.out.println("3개의 정수입력: ");
		int sum=0,n=0;
		
		for(int i=0;i<3;i++) {
			System.out.println(i+" >>");
			try {
				n=a.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다!");
				a.next();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("합은"+sum);
		a.close();

	}

}
