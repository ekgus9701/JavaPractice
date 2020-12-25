package chap4;
import java.util.*;
class Rect{
	private int width,height;
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
}
public class RectArray {

	public static void main(String[] args) {
		int width=0,height=0,sum=0;
		Rect[] a=new Rect[4];
		for(int i=0;i<4;i++) {
			System.out.print(i+1+" 너비와 높이 >>");
			Scanner sc=new Scanner(System.in);
			width=sc.nextInt();
			height=sc.nextInt();
			a[i]=new Rect(width,height);
			sum+=a[i].getArea();
			
			
			
		}
		System.out.println(sum);
		

	}

}
