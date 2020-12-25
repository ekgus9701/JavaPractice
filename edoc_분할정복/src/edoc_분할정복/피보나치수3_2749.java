package edoc_��������;
import java.util.Scanner;

public class �Ǻ���ġ��3_2749 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		int pisano = 1500000;
		
		n=n%pisano;
		
		long[] fib=new long[pisano+1];
		fib[1]=1;
		
		for(int i=2; i <= pisano; i++) {
            fib[i] = (fib[i-1] + fib[i-2])%1000000;
        }
        
        System.out.println(fib[(int)n]);
    }
}
