package edoc_200708;
import java.util.Scanner;


public class E_ÃÖ¼Ú°ª±¸ÇÏ±â {

	public static void main(String[] args) {
		int x,y,w,h;
		
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		int x1=w-x;
		int y1=h-y;
		int min1,min2,min;
		
		if(x1>x)
			min1=x;
		else
			min1=x1;
		if(y1>y)
			min2=y;
		else
			min2=y1;
		if(min1>min2)
			min=min2;
		else
			min=min1;
		System.out.println(min);		

	}

}
