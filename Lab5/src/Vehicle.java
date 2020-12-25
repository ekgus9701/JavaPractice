
public class Vehicle {
	//필드
	public int passengers; //승객수
	public int fuelcap; //연료캠
	public int mpg; //연비
	
	//Vehicle 클래스의 생성자
	public Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg= m;
	}
	
	//메소드
	public int range() { //주어진 연료를 주행할 수 있는 거리
		return mpg*fuelcap; //연비*연료캡을 곱한 값을 반환
	}
	
	public double fuelneeded(int miles) { //주어진 거리를 주행하기위한 연료량
		return (double) miles/mpg; //연비를 마일(거리)로 나눠준 값을 반환
	}
}
