package chap6;
class Rect{
	int width,height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Object obj1) {
		Rect p = (Rect)obj1;
		if(width*height==p.width*p.height)
			return true;
		else return false;
	}
	
}
public class RectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(6,1);
		
	if(a.equals(b)) {
		System.out.println("a==b");
	}
	if(a.equals(c)) {
		System.out.println("a==c");
	}
	if(c.equals(b)) {
		System.out.println("c==b");
	}
		

	}

}
