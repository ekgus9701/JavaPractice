
public class MyStack {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		//String Ÿ���� GStack ����
		stringStack.push("seoul");
		stringStack.push("NewYork");
		stringStack.push("busan");
		for(int n=0;n<3;n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		//Integer Ÿ���� GStack ����
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		for(int n=0;n<3;n++)
			System.out.println(intStack.pop());
		
		GStack<Double> doubleStack = new GStack<Double>();
		//Double Ÿ���� GStack ����
		doubleStack.push(1.5);
		doubleStack.push(4.3);
		doubleStack.push(7.5);
		for(int n=0;n<3;n++)
			System.out.println(doubleStack.pop());
				
	}

}
