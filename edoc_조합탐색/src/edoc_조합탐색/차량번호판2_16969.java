package edoc_����Ž��;
import java.util.Scanner;

public class ������ȣ��2_16969 {
	
	static int c=26,d=10;
	final static int k=1000000009;
	static long ret = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		
		int l=s.length();
		
		char[] a= new char[l+1];
		for(int i=0;i<l;i++) {
			a[i]=s.charAt(i); //�迭�� �ֱ�
		}
		
		for(int i=0;i<l-1;i++) {
			
				if(a[i]=='c') {//���ڶ��
					ret *=c; 
					ret%=k;
					
					c= a[i]!=a[i+1] ? 26:25;//���ڰ� ���ӵ��������� c=26 ���ӵǸ� 25
				}
				else {//���ڶ��
					ret*=d;
					ret%=k;
					
					d= a[i]!=a[i+1] ? 10:9;//���ڰ� ���ӵ��������� d=10 ���ӵǸ� 9

			}
				
		}
		System.out.println(ret%k);
	}

}
