package 과제5장_자프실;
import java.util.*;

interface StackInterface{
	int length();
	String pop();
	boolean push(String ob);
}

class StringStack implements StackInterface{
	String [] stack = new String[5];
	private int count = 0;
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return stack[--count];
	}

	@Override
	public boolean push(String ob) {
		// TODO Auto-generated method stub
		if(count ==5) {
			return false;
		}
		else {
			stack[count]=ob;
			count++;
			return true;
		}
		
	}
	
}

public class StackManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringStack s = new StringStack();
		
		System.out.print(">>");
		for(int i=0;i<5;i++) {
			s.push(sc.next());
		}
		
	
		for(int i=0;i<5;i++) {
			System.out.print(s.pop()+" ");
		}
		
		
		

	}

}
