package ����4��_������;
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
			System.out.print(i+1+" �ʺ�� ���� >>");
			
			width=sc.nextInt();
			height=sc.nextInt();
			r[i]=new Rect(width,height);
			
			
		}
		System.out.println("�����Ͽ����ϴ�...");
		for(int i=0;i<4;i++) {
			
			sum+=r[i].getArea();			
		}
		System.out.println("�簢���� ��ü ���� "+sum);
		

	}

}
