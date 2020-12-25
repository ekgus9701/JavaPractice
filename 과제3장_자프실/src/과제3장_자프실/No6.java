package 과제3장_자프실;
import java.util.Scanner;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eng[]= {"student", "love","java","happy","future"};
		String kor[]= {"학생","사랑","자바","행복한","미래"};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String s=sc.next();
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			else {
				int k=0;
				while(true) {
			
					
						if(s.equals(eng[k])) {
							System.out.println(kor[k]);
							break;
						}
						else if(!s.equals(eng[k])&&k==4) {
							System.out.println("그런 영어 단어가 없습니다.");
							break;
						}
						k++;
				}
			}
		}
	}
}

	
