public class Rectangle{	
	private double width, height, area; //�غ�, ����, ����
	
	public Rectangle(double w,double h) { //������
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


	
