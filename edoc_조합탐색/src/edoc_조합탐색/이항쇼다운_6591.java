package edoc_����Ž��;

import java.util.Scanner;

public class ���׼�ٿ�_6591 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n,k;
       
        while(true) {//0�̾ƴϸ� ��� �ޱ�
        	
        	 n=sc.nextInt();
             k=sc.nextInt();
        
        	if(n==0 && k==0) {
        		break;
        	}
        	else {
        		long num1= 1;
        		long num2= 1;
        		for (int i=n;i>n-k;i--) {
        			num1*=i;
        			
        			}
        		
        		
        		for (int j=1;j<k+1;j++) {
        			num2*=j;
        			
        		}
        		
        		long num3= 1;
        		num3=num1/num2;
        		System.out.println(num3);
        	}
        }
	}

}
