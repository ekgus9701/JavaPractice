package chap4;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1; name="���̳�";
	}
	public Circle(int radius,String name) {
		this.radius=radius;
		this.name=name;
	}
	public double getArea() {
		return 3*radius*radius;
	}

	public static void main(String[] args) {
		Circle pizza=new Circle();
		
		double area=pizza.getArea();
		
		
		Circle pizza1=new Circle(3,"������");
		
		System.out.println(pizza.name+"�� ������ "+pizza.getArea());
		System.out.println(pizza1.name+"�� ������ "+pizza1.getArea());
		
	}

}
