package ����5��_������;

interface shape1{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- �ٽ� �׸��ϴ�. ---");
		draw();
	}
}

class circle1 implements shape1{
	private int radius;
	
	public circle1(int radius) {
		this.radius=radius;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("������ "+radius+" ");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}
	
}

public class ShareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape1 coin = new circle1(10);
		coin.redraw();
		System.out.println("������ ������ "+coin.getArea());

	}

}
