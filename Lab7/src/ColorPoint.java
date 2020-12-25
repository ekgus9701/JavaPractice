
public class ColorPoint extends Point { //Point를 상속받은 ColorPoint 선언
	String color; //점의 색
	
	/*void setColor(String color) {
		this.color=color;
	}*/
	
	public ColorPoint(int x,int y , String color) {//매개변수를 가진 생성자
		super(x,y);
		this.color =color;
		
	}
	void showColorPoint() { //컬러 점의 좌표 출력
	  System.out.print(color);
	  showPoint(); //Point 클래스의 showPoint() 호출		
	}

}
