package chap5;
interface Human{
	public void eat();
	static void echo() {
		System.out.println("야호!!!");
	}
}
class Student11 implements Human{
	int age;
	public Student11(int age) {
		this.age=age;
		System.out.println(age+"살 입니다");
	}
	public void print() {
		System.out.println("학생입니다.");
	}
	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
		
	}
	
}

class Worker implements Human{
	public void print() {
		System.out.println("인간입니다.");
	}
	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
		
	}
	
}
public class HumanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human.echo();
		
		Student11 s=new Student11(20);
		s.print();
		s.eat();
		
		Worker w =new Worker();
		w.print();
		w.eat();
		
		
		
	}

}
