package chap5;
abstract class Animal{
	boolean sleep;
	String k;
	
	public Animal(Boolean sleep){
		
		if(sleep==true) 
			 k="��ϴ�.";	
		
		else
			k="�� ��ϴ�.";
	}
	void show() {
		System.out.println(getName()+"(��)�� �ܿ����� "+k);
	}
	abstract String getName();
}

class Bear extends Animal{
	@Override
	String getName() {
		return "��";
	}
	public Bear(boolean b) {
		super(b);
	}
	
}

class Dog extends Animal{
	
	public Dog(boolean b) {
		super(b);
	}

	@Override
	String getName() {
		return "������";
	}	
}

public class Exam1 {

	public static void main(String[] args) {
		Animal[] a = {new Bear(true),new Dog(false)};
		
		for(int i=0; i<a.length;i++)
			a[i].show();

	}

}
