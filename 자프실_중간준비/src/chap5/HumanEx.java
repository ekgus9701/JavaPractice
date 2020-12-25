package chap5;
interface Human{
	public void eat();
	static void echo() {
		System.out.println("��ȣ!!!");
	}
}
class Student11 implements Human{
	int age;
	public Student11(int age) {
		this.age=age;
		System.out.println(age+"�� �Դϴ�");
	}
	public void print() {
		System.out.println("�л��Դϴ�.");
	}
	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
		
	}
	
}

class Worker implements Human{
	public void print() {
		System.out.println("�ΰ��Դϴ�.");
	}
	@Override
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
		
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
