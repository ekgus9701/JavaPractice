package ����3��_������;
import java.util.Scanner;
import java.util.InputMismatchException;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		try {
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("¦��");
			}
			else {
				System.out.println("Ȧ��");
			}
			}
		catch(InputMismatchException e){
			System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
			
		}
		

	}

}
