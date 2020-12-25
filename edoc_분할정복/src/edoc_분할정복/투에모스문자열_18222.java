package edoc_분할정복;

import java.util.Scanner;

public class 투에모스문자열_18222 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		char a=tuemos(5).charAt(k-1);
		//System.out.println(a);
		//System.out.println(tuemos(10));

	}

	public static StringBuffer tuemos(int k){
		StringBuffer tuemos=new StringBuffer("0");
		
		if(k==1)
			return tuemos;
		
		else {
			for(int i=0;i<k;i++) {
				StringBuffer tuemos1=swap(tuemos);
				
				tuemos=tuemos.append(tuemos1);
			}
				return tuemos;
		}
		
	}
	
	
	public static StringBuffer swap(StringBuffer tuemos){
		
		for(int i=0;i<tuemos.length();i++) {
			char c= tuemos.charAt(i);
			
				if(c=='0') {
					tuemos.replace(i, i, "1");
					//System.out.println(tuemos);
					continue;
					
					}
				if(c=='1') {
					tuemos.replace(i, i, "0");
					//System.out.println(tuemos);
					continue;
				}
		}
		System.out.println(tuemos);
		return tuemos;
		

	}
}



