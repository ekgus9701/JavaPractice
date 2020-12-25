
public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//1~10까지 반복
		for(int i=1;i<=10;i++) {
			sum+=i;
			//더하는 수 출력
			System.out.print(i);
			if(i<=9)//1~9까지는 '+'출력
				System.out.print("+");
			else {//i가10인경우
				System.out.print("=");//'='출력하고
				System.out.print(sum);//덧셈결과 출력
			}
		}
		
	}

}
