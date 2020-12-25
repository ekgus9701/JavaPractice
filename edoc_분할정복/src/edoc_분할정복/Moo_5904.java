package edoc_분할정복;
import java.util.*;

public class Moo_5904{

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		char a=moo(10).charAt(N-1);
		System.out.println(a);

	}
	
	public static StringBuffer moo(int k){
		StringBuffer moo=new StringBuffer("moo");
		
		if(k==0)
			return moo;
		
		else {
			for(int i=0;i<k;i++) {
				moo=moo.append("o");
				
			}
			moo=moo(k-1).append(moo);
			moo=moo.append(moo(k-1));
			return moo;
		
	}
	}
}
