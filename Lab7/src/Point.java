
public class Point {
	int x,y; //�� ���� �����ϴ� x,y ��ǥ
	public Point() { //�⺻������
		this.x=this.y=0;
	}
	
	public Point(int x, int y) { //�Ű� ������ ���� ������
		this.x=x;
		this.y=y;
	}
	
	/*void set(int x, int y) {
		this.x=x;
		this.y=y;
	}*/
	void showPoint() {//���� ��ǥ ���
		System.out.println("("+x+","+y+")");
	}
}
