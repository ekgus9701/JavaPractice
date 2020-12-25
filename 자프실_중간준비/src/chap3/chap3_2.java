package chap3;
import java.util.Scanner;

public class chap3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		System.out.println("양수 5개를 입력하세요");
		int max=0;
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=sc.nextInt();
			if(intArray[i]>max)
				max = intArray[i];
			
			
			}
		System.out.println("가장 큰수는 "+max);
		System.out.println("배녈 크기는"+intArray.length);
			
			
		}

	}


