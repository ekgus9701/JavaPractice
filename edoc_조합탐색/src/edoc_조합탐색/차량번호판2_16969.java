package edoc_조합탐색;
import java.util.Scanner;

public class 차량번호판2_16969 {
	
	static int c=26,d=10;
	final static int k=1000000009;
	static long ret = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		
		int l=s.length();
		
		char[] a= new char[l+1];
		for(int i=0;i<l;i++) {
			a[i]=s.charAt(i); //배열에 넣기
		}
		
		for(int i=0;i<l-1;i++) {
			
				if(a[i]=='c') {//문자라면
					ret *=c; 
					ret%=k;
					
					c= a[i]!=a[i+1] ? 26:25;//문자가 연속되지않으면 c=26 연속되면 25
				}
				else {//숫자라면
					ret*=d;
					ret%=k;
					
					d= a[i]!=a[i+1] ? 10:9;//숫자가 연속되지않으면 d=10 연속되면 9

			}
				
		}
		System.out.println(ret%k);
	}

}
