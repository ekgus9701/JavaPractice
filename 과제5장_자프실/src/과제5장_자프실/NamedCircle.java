package ����5��_������;

class Circle {
	private int radius;
	public Circle(int radius) { 
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
}

public class NamedCircle extends Circle{

	String name;
	public NamedCircle(int radius,String name) {
		super(radius);
		this.name=name;
	}
	
	public void show() {
		System.out.println(name+", "+"������ = "+getRadius());
	}	

	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5,"waffle");
		w.show();

	}

}
