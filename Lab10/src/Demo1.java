
public class Demo1 {
	public static void main(String[] args) {
		int i=13;
		Integer ii= Integer.valueOf(i);
		System.out.println(i);
		System.out.println(ii.floatValue()); //실수값 구하기
		System.out.println((float)i); //윗줄과 같은 역할
	}

}
