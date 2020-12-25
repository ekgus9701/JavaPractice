
public class ForEach {
	enum Week{월,화,수,목,금,토,일}
	public static void main(String[] args) {
		int n[]= {1,2,3,4,5};
		int sum=0;
		
		String names[]= {"딸기","체리","바나나","포도"};
		
		//for-each의 k는 n[0],n[1],...,n[4]로 반복
		for(int k:n) {
			System.out.print(k+""); //반복되는 k값 출력
			sum+=k;
		}
		System.out.println("합은"+sum);
		
		//for=each의 s는 names[0],names[1],...,names[5]반복
		for(String s:names) {
			System.out.print(s+" ");
		
		}
		System.out.println();
		 //for-each의 day는 월,화,수,목,금,토,일 값 반복
		for (Week day: Week.values())
			System.out.print(day+"요일");
			System.out.println();
	}

}
