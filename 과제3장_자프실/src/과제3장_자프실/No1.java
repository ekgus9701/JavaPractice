package ����3��_������;
import java.util.Scanner;
public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
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
