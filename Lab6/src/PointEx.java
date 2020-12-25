import java.lang.Math;

public class PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1= new Point(4,12);
		Point p2= new Point(10,20);
		
		double p1x=p1.getX();
		double p1y=p1.getY();
		double p2x=p2.getX();
		double p2y=p2.getY();
		double dist;
		
		dist=Math.sqrt((p1x-p2x)*(p1x-p2x) +(p1y-p2y)*(p1y-p2y));
		System.out.println("p1과 p2의 거리= "+dist);
	}

}
