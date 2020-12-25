import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Array[]=new int[4]; //배열의 선언과 생성
		int sum=0;
		System.out.print(Array.length+"개의 정수를 입력하세요>>");
		for(int i=0;i<Array.length;i++) {
			Array[i]=in.nextInt(); //키보드에서 입력받은 정수 저장
		}
		for(int i=0; i<Array.length;i++) {
			sum+=Array[i]; //배열에 저장된 정수 값을 더하기
		}
		System.out.println("평균: "+sum/Array.length);
		in.close();

	}

}
