import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int Array[]=new int[5]; //배열생성
		int max=0, sum=0; //큰 수와 합산 변수 선언및 초기화
		
		System.out.println("5개의 숫자를 입력하세요!");
		
		for(int i=0; i<5; i++) {
			Array[i]=in.nextInt(); //입력받은 정수를 배열에 저장
			
		}
		for(int i=0; i<5; i++) {
			sum+=Array[i];
			if(max<Array[i]) //Array[i]가 현재 가장 큰 수보다 크면
				max=Array[i]; //Array[i]를 max로 변경
	}
		System.out.println("제일 큰 수:"+max);
		System.out.println("합계:"+sum);
		in.close(); //스캐너 종료
	}
		

}
