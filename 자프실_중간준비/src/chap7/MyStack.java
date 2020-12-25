package chap7;
class GStack<T>{
	int tos;
	Object [] stck;
	public GStack() {
		tos=0;
		stck=new Object[10];
	}
	public void push(T item) {
		if(tos==10)
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}
public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack=new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("jeju");
		for(int i=0;i<3;i++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int i=0;i<3;i++) {
			System.out.println(intStack.pop());
		}
	}

}
