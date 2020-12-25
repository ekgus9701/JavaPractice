package chap5;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
	
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paint(new Shape());
		paint(new Line());
		paint(new Rect());

	}

}
