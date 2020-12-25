package chap4;
import java.util.*;
public class Numbers {
	static int num []=new int[5];
	static public int getTotal() {
		int total=0;
		for(int i=0;i<num.length;i++) {
			total+=num[i];
		}
		return total;
	}
	static public float getAverage() {
		float avr=0;
		int t=getTotal();
		avr=(float)t/num.length;
		return avr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		for(int j=0;j<5;j++) {
			num[j]=sc.nextInt();
			
		}
		int tt=getTotal();
		float av=getAverage();
		System.out.println("합계: "+tt+" 평균: "+av);
		}
		catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다.");
		}
		
		

	}

}
