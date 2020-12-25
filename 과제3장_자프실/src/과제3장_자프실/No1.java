package 과제3장_자프실;
import java.util.Scanner;
public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String s= sc.next();
		char c = s.charAt(0);
		int n=(int)c;
		for(int i=97;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				char k= (char)j;
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
