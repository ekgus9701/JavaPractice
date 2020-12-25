
public class ColorTriangle extends DObject {
	
	String color;
	
	public ColorTriangle(int w, int h, String c) {
		super(w,h);
		color=c;
	}
	
	@Override
	public void show() {
		System.out.print("ColorTriangle : ");
		System.out.println(width+" "+height+" "+area+" "+color);

	}

}
