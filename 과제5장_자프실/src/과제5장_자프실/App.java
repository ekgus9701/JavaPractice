package 과제5장_자프실;
import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc();
	protected void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		a=scanner.nextInt();
		b=scanner.nextInt();
	}
	public void run() {
		input();
		int res=calc();
		System.out.println("계산된 값은 "+res);
		
	}
}

class Adder extends Calculator{

	@Override
	protected int calc() {
		
		return a+b;
	}
	
}

class Subtracter extends Calculator{

	@Override
	protected int calc() {
		
		return a-b;
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();

	}

}
