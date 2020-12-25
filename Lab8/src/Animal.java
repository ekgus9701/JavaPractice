
public abstract class Animal {//추상클래스
	public String kind;
	
	public void live() {
		System.out.println("호흡!");
	}
	
	public abstract void sound(); //추상 메소드

}
