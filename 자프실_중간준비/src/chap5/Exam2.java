package chap5;
interface Animal11{
	void bear();
	
}
interface Fish{
	void swim();
}
class Whale implements Animal11,Fish{
	
	@Override
	public void bear() {
		System.out.println("���� ������ �����ϴ�.");
		
	}

	@Override
	public void swim() {
		System.out.println("���� ������ �մϴ�.");
		
	} 
	
}
public class Exam2 {

	public static void main(String[] args) {
		Whale w = new Whale();
		w.bear();
		w.swim();

	}

}
