package edoc_동적계획법;
import java.util.Scanner;

public class 퇴사_14501 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int N=sc.nextInt();
		int time[] = new int[N+1];
		int pay[] = new int[N+1];
		int dp[] = new int[N+2];
		
		for(int i=1;i<=N;i++) {
			time[i]=sc.nextInt();
			pay[i]=sc.nextInt();
		}
		//뒤에서부터 점점 더해지는 방식
		for(int i=N;i>0;i--) {
			int index=i+time[i]; 
			//dp[i]는 i일부터 퇴사날까지얻을수 있는 최대이익
			if(index >N+1)  //상담일이 퇴사일을 초과하면
				dp[i]=dp[i+1];
			else
				dp[i]=Math.max(dp[i+1],pay[i]+dp[index]); //다음날의 최대이익과 당일에 상담했을 시의 최대이익을 비교해서 큰거 선택
			
			
		}
		
			System.out.println(dp[1]);
		
		
	}

}
