package edoc_200708;
import java.util.Scanner;
public class C_º°Âï±â {

	/*
	 0 1 2
	 1 2 1
	 
	 */
	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		for(int i=0;i<N;i++) {	
			for(int j=N-i-1;j>0;j--) {
				System.out.print(" ");	
			
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=N-2;i>=0;i--) {	
			for(int j=N-i-1;j>0;j--) {
				System.out.print(" ");	
			
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}

}
