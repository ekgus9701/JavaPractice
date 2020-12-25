
public class Point {
	int x,y; //한 점을 구성하는 x,y 좌표
	public Point() { //기본생성자
		this.x=this.y=0;
	}
	
	public Point(int x, int y) { //매개 변수를 가진 생성자
		this.x=x;
		this.y=y;
	}
	
	/*void set(int x, int y) {
		this.x=x;
		this.y=y;
	}*/
	void showPoint() {//점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}
