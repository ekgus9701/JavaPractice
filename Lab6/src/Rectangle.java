public class Rectangle{	
	private double width, height, area; //밑변, 높이, 면적
	
	public Rectangle(double w,double h) { //생성자
		width = w;
		height =h;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width=width;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height=height;
	}

	public double getArea() {
		return width*height;
	}

	public void setArea(double width, double height) {
		this.area=width*height;
	}
}


	
