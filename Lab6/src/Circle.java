
public class Circle {
	
	int radius;
	String name;
	
	public static final double PI=3.14;
	
	public Circle() {
		this(2,"");
		//radius = 2;
		//name = "";
	}
	
	public Circle(int radius,String name) {
		this.radius =radius;
		this.name=name;
	}
	
	public double getArea() {
		return PI *radius*radius;
	}

}
