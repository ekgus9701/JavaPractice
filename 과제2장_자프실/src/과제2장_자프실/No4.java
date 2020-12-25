package 과제2장_자프실;
import java.util.Scanner;
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		if(x>50 && x<100) {
			if(y>50 && y<100) {
				System.out.printf("점(%d,%d)은 점(50,50)과 점(100,100)의 사각형 내에 있습니다.",x,y);
			}
			else {
				System.out.printf("점(%d,%d)은 점(50,50)과 점(100,100)의 사각형 내에 있지않습니다.",x,y);
			}
			
	}
		else {
			System.out.printf("점(%d,%d)은 점(50,50)과 점(100,100)의 사각형 내에 있지않습니다.",x,y);
		}

}
}
