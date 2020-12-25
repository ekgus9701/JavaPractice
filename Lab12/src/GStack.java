
public class GStack<T> {//제네릭 스택 선언, 제네릭 타입 T
	int tos;
	Object [] stck; //스택에 요소를 저장할 공간 배열
	public GStack() {
		tos=0;
		stck= new Object [10];
	}
	public void push(T item) {
		if(tos==10)
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0) //스택이 비어있는 경우
			return null;
		tos--;
		return (T)stck[tos]; //타입 매개변수 타입으로 캐스팅
	}

}
