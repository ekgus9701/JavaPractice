package chap5;

class Person1{
	String name;
	int age;
	void show() {
		System.out.println("�̸���: "+name);
		System.out.println("���̴�: "+age);
	}
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
}

class Student1 extends Person1{
	String id;
	void show() {
		super.show();
		System.out.println("�й���: "+id);
	}
	public Student1(String name,int age,String id){
		super(name,age);
		this.id=id;
	}
}



public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1("����",22,"1971055");
		s.show();
		System.out.println();
		Person1 p =s;
		p.show();
	}

}
