package ����3��_������;
import java.util.Scanner;
public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= new int[10];
		System.out.print("���� 10�� �Է�>>");
		Scanner sc =new Scanner(System.in);
		for(int j=0;j<10;j++) {
			i[j]=sc.nextInt();
			if(i[j]%3==0) {
				System.out.print(i[j]+" ");
			}
		}
		
		

	}

}
