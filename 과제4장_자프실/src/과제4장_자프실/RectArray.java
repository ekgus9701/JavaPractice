package 과제4장_자프실;
import java.util.*;

class Rect{
	private int width,height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
	
}
public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,width=0,height=0;
		Rect[] r;
		r= new Rect[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.print(i+1+" 너비와 높이 >>");
			
			width=sc.nextInt();
			height=sc.nextInt();
			r[i]=new Rect(width,height);
			
			
		}
		System.out.println("저장하였습니다...");
		for(int i=0;i<4;i++) {
			
			sum+=r[i].getArea();			
		}
		System.out.println("사각형의 전체 합은 "+sum);
		

	}

}
