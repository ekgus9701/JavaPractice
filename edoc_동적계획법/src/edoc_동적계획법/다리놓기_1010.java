package edoc_동적계획법;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class 다리놓기_1010 {
	
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        
	        for(int i=0;i<T;i++) {
	            initMemo(memo);
	            int N=sc.nextInt();
	            int M=sc.nextInt();
	            System.out.println(factorial(M).divide(factorial(M-N)).divide(factorial(N)));
	        }
	    }

	    static BigInteger[] memo=new BigInteger[31];
	    static void initMemo(BigInteger[] memo) {
	        for(int i=0;i<memo.length;i++) {
	            memo[i]=new BigInteger("-1");
	        }
	        memo[0]=new BigInteger("1");
	        memo[1]=new BigInteger("1");
	    }
	    static BigInteger factorial(int n) {
	        if(!memo[n].equals(new BigInteger("-1"))) {
	            return memo[n];
	        }
	        memo[n]=new BigInteger(factorial(n-1).multiply(new BigInteger(n+""))+"");
	        
	        return memo[n];
	    }

	
	
}
