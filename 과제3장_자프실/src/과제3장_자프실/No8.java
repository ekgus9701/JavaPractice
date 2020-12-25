package 과제3장_자프실;
import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위 바위 보!>>");
			String s = sc.next();
			if(s.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else {
				String str[]= {"가위","바위","보"};
				int n=(int)(Math.random()*3);
				String win=null; 
				if(s.equals("가위")) {
					if(n==0) {
						win="비겼습니다.";
					}
					if(n==1) {
						win="컴퓨터가 이겼습니다.";
					}
					if(n==2) {
						win="컴퓨터가 졌습니다.";
					}
				}
				if(s.equals("바위")) {
					if(n==1) {
						win="비겼습니다.";
					}
					if(n==2) {
						win="컴퓨터가 이겼습니다.";
					}
					if(n==0) {
						win="컴퓨터가 졌습니다.";
					}
				}
				if(s.equals("보")) {
					if(n==2) {
						win="비겼습니다.";
					}
					if(n==0) {
						win="컴퓨터가 이겼습니다.";
					}
					if(n==1) {
						win="컴퓨터가 졌습니다.";
					}
				}
				System.out.println("사용자 = "+s+" , 컴퓨터 = "+str[n]+", "+win);
			}
			
		
		}
		
		
	}

}
