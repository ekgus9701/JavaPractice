package chap4;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1; name="도미노";
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
		
		
		Circle pizza1=new Circle(3,"피자헛");
		
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea());
		System.out.println(pizza1.name+"의 면적은 "+pizza1.getArea());
		
	}

}
