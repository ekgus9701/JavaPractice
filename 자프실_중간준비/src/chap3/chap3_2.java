package chap3;
import java.util.Scanner;

public class chap3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		System.out.println("��� 5���� �Է��ϼ���");
		int max=0;
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=sc.nextInt();
			if(intArray[i]>max)
				max = intArray[i];
			
			
			}
		System.out.println("���� ū���� "+max);
		System.out.println("��� ũ���"+intArray.length);
			
			
		}

	}


