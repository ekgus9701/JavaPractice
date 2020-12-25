import java.util.*;
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s,"+");
		
		String ss;
		
		int sum=0;
		while(st.hasMoreTokens()) {
			ss=st.nextToken();
			ss=ss.trim();
			 
			sum+=Integer.parseInt(ss);
			
		}
		
		System.out.println("гую╨ "+sum);
		
		
	}

}
