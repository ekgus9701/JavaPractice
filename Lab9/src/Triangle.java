public class Triangle extends DObject{
	

	public Triangle(int w,int h) {
		super(w,h);
	}
	
	public void computeArea() {
		area=(width*height)/2.0;
		
	}
	
	@Override
	public void show() {
		System.out.print("Triangle : ");
		System.out.println(width+" "+height+" "+area);
	}
}