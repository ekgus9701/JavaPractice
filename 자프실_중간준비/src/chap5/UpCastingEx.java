package chap5;
class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name=name;
	}

	
}
class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
public class UpCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student s = new Student("¿Ã¿ÁπÆ");
		s.grade="A";
		p=s;
		System.out.println(p.name);
		Student s1 = (Student)p;
		System.out.println(s1.name+s1.grade);

	}

}
