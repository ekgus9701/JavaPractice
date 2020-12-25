package edoc_팀대항전;
import java.util.*;
public class 정수수열_14440 {

	   public static void main(String[] args) {
	      int x,y,a0,a1,n;
	      Scanner sc = new Scanner(System.in);
	      x=sc.nextInt();
	      y=sc.nextInt();
	      a0=sc.nextInt();
	      a1=sc.nextInt();
	      n=sc.nextInt();
	      
	      int[] result=new int[n+1];
	      result[0]=a0;
	      result[1]=a1;
	      for (int i=2;i<=n;i++) {
	         result[i]=x*result[i-1]+y*result[i-2];
	         result[i]=result[i]%100;
	      }
	      
	      System.out.println(result[n]);
	   }
	
}
