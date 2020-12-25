
public class Rectangle2 extends DObject {
	
	public Rectangle2(int w) {
		super(w,w);
	}
	
	public void computeArea() {
		area=width*width;
	}
	@Override
	public void show() {
		System.out.print("Rectangle2 : ");
		System.out.println(width+" "+height+" "+area);

	}

}
