public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle R1= new Rectangle(10,20);
		Rectangle R2= new Rectangle(20,30);
		
		R1.setWidth(5.0);
		R1.setHeight(10.0);
		
		double area1= R1.getArea();
		double width1= R1.getWidth();
		double height1 = R1.getHeight();
		
		
		System.out.println("R1 area:"+ area1+ " R1 width:"+width1+" R1 height:"+height1);
		
		R2.setWidth(5.0);
		R2.setHeight(3.0);
		
		double area2= R2.getArea();
		double width2= R2.getWidth();
		double height2 = R2.getHeight();
		
		System.out.println("R2 area:"+ area2+ " R2 width:"+width2+" R2 height:"+height2);
		
	}

}