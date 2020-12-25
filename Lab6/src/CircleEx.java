
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza = new Circle(10, "게맛살피자");
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.name = "양파링피자";
		area=Circle.PI*donut.radius*donut.radius;
		System.out.println(donut.name+"의 면적은 "+area);

	}
}
