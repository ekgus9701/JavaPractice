package chap5;

public class Point1 {
	private int x,y;
	public void setX(int x) {
		this.x=x;
		
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX(){
		return x;
		
	}
	public int getY() {
		return y;
	}

	public static void main(String[] args) {
		Point1 p=new Point1();
		p.setX(2);
		p.setY(3);
		System.out.println("p�� x: "+p.getX());
		System.out.println("p�� y: "+p.getY());

	}

}
