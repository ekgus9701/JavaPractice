
public class GMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){
		//T가 타입매개변수인 제네릭 메소드
		GStack<T> s = new GStack<T>(); //스택 a를 반대로 저장할 GStack 생성
		while(true) {
			T tmp;
			tmp=a.pop();
			if(tmp==null) //스택이 비어있는 경우
				break;
			else
				s.push(tmp); //새 스택에 요소를 삽입
		}
		return s; //새 스택을 리턴
	}
	public static void main(String[] args) {
		GStack<Integer> gs = new GStack<Integer>();
		for(int i=0;i<5;i++) {
			gs.push(i);
		}
		gs=reverse(gs);
		for(int i=0;i<5;i++) {
			System.out.println(gs.pop());
		}
	GStack<String> gs1 = new GStack<String>();
		gs1.push("Apple");
		gs1.push("Banana");
		gs1.push("Orange");
		gs1 = reverse(gs1);
		for(int i=0; i<3; i++) {
			System.out.println(gs1.pop());
		}
		
	}

}
