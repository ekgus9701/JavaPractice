package chap5;
abstract class Animal{
	boolean sleep;
	String k;
	
	public Animal(Boolean sleep){
		
		if(sleep==true) 
			 k="잡니다.";	
		
		else
			k="안 잡니다.";
	}
	void show() {
		System.out.println(getName()+"(이)가 겨울잠을 "+k);
	}
	abstract String getName();
}

class Bear extends Animal{
	@Override
	String getName() {
		return "곰";
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
		return "강아지";
	}	
}

public class Exam1 {

	public static void main(String[] args) {
		Animal[] a = {new Bear(true),new Dog(false)};
		
		for(int i=0; i<a.length;i++)
			a[i].show();

	}

}
