import java.util.*;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) >>");
			int d=sc.nextInt();
			if(d==4) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			int c=(int)(Math.random()*3+1);
			switch(d) {
			case 1:
				if(c==1) {
					System.out.println("사용자 가위 : 컴퓨터 가위");
					System.out.println("비겼습니다.");
				}
				else if(c==2) {
					System.out.println("사용자 가위 : 컴퓨터 바위");
					System.out.println("사용자가 졌습니다.");
				}
				else if(c==3) {
					System.out.println("사용자 가위 : 컴퓨터 보");
					System.out.println("사용자가 이겼습니다.");
				}
				break;
			case 2:
				if(c==1) {
					System.out.println("사용자 바위 : 컴퓨터 가위");
					System.out.println("사용자가 이겼습니다.");
				}
				else if(c==2) {
					System.out.println("사용자 바위 : 컴퓨터 바위");
					System.out.println("비겼습니다.");
				}
				else if(c==3) {
					System.out.println("사용자 바위 : 컴퓨터 보");
					System.out.println("사용자가 졌습니다.");
				}
				break;
			case 3:
				if(c==1) {
					System.out.println("사용자 보 : 컴퓨터 가위");
					System.out.println("사용자가 졌습니다.");
				}
				else if(c==2) {
					System.out.println("사용자 보 : 컴퓨터 바위");
					System.out.println("사용자가 이겼습니다.");
				}
				else if(c==3) {
					System.out.println("사용자 보 : 컴퓨터 보");
					System.out.println("비겼습니다.");
				}
				break;
				
			}
		}
	}

}
