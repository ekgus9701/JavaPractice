package ����3��_������;
import java.util.InputMismatchException;
import java.util.Scanner;
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i[]= {"��","��","ȭ","��","��","��","��"};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է��ϼ���>>");
			
			
			try{
				
				int n=sc.nextInt();
				if(n<0) {
					System.out.println("���α׷� �����մϴ�...");
					break;
				}
				else {
					n=n%7;
					System.out.println(i[n]);
				}
				
			}
			catch(InputMismatchException e){
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				sc.next();
				
			
			}
			

			
			
		}
	}
}
