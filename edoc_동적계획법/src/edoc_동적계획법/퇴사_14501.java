package edoc_������ȹ��;
import java.util.Scanner;

public class ���_14501 {
	
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
		//�ڿ������� ���� �������� ���
		for(int i=N;i>0;i--) {
			int index=i+time[i]; 
			//dp[i]�� i�Ϻ��� ��糯���������� �ִ� �ִ�����
			if(index >N+1)  //������� ������� �ʰ��ϸ�
				dp[i]=dp[i+1];
			else
				dp[i]=Math.max(dp[i+1],pay[i]+dp[index]); //�������� �ִ����Ͱ� ���Ͽ� ������� ���� �ִ������� ���ؼ� ū�� ����
			
			
		}
		
			System.out.println(dp[1]);
		
		
	}

}
