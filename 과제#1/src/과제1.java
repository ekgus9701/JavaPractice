import java.util.Scanner;
import java.util.InputMismatchException;
public class 과제1 {
	//1971055 컴퓨터공학전공 한다현 
	//클래스를 2개 만들었습니다.
	public static void main(String[] args) {
		Students[] studentsArray =null; //배열선언
		
		
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		
		for(int i=0;i<6;i++) {
		System.out.println("=====================================================");
		System.out.println(">>1. 학생수 입력 >>2.점수 입력  >>3.점수 리스트 >>4.점수 분석 >>5.학생수 확인 >>6.종료"); //메뉴 생성
		System.out.println("=====================================================");
		System.out.println("선택>");
		int k = scanner.nextInt(); //입력된 메뉴
		if(k==1) { //메뉴 1을 입력했을 때
			System.out.println("학생수를 입력해주세요!>");
			int num= scanner.nextInt();
			studentsArray = new Students[num]; //Students 객체 레퍼런스 배열 생성
			continue; //다음루프
		}
		if(k==2) {//메뉴 2을 입력했을 때
		for(int j=0; j<studentsArray.length;j++) {//학생수만큼 반복
			
			System.out.println("점수를 입력해주세요!>");
			System.out.println(j+1+"번학생>");
			while(true) {
				int score=0;
				try {
					 score = scanner.nextInt(); //정수입력
					}
					catch(InputMismatchException e) {//정수가 아닌 문자 입력했을 때 발생하는 예외 처리
						System.out.println("정수가 아닙니다. 다시 입력하세요!");
						scanner.next();//입력 스트링에 있는 정수가 아닌 토큰을 버림
						continue;//다음루프
					}
					
				
			if(score>100) {//score가 100보다 클때
				System.out.println("100보다 작은 수를 다시 입력하세요!\n");
				continue;//다음루프
			}
			else if(score<0) {//score가 0보다 작을때
				System.out.println("0보다 큰 수를 다시 입력하세요!\n");
				continue;//다음루프
			}
			else {//score가 0 이상이고 100이하일떄
				studentsArray[j]= new Students(score); //Students 객체 생성
				break;//루프 종료
				}
			
			}
			}
		continue;//다음루프
		}
		if(k==3) {//메뉴 3을 입력했을 때
			for(int j=0; j<studentsArray.length;j++) {//학생수만큼 반복
				System.out.print(j+1+"번 학생 :");
				System.out.println(studentsArray[j].getScore()+"점");//점수 출력
				for(int l=0; l<studentsArray[j].getScore();l++) { //점수만큼 반복
				System.out.print("*");//막대 그래프 출력
				}
				System.out.println("");
			}
			continue;//다음 루프
		}
		if(k==4) {//메뉴 4을 입력했을 때
			for(int j=0; j<studentsArray.length;j++) {//학생수만큼 반복
				System.out.print(j+1+"번 학생 :");
				System.out.print(studentsArray[j].getScore()+"점"); //점수 출력
				System.out.print("    ");
				int number=studentsArray[j].getScore()/10;
				switch(number) { //학점알려주는 프로그램
				case 10:
				case 9:
					System.out.println("A학점");//90점 이상이면 A
					continue;
				case 8:
					System.out.println("B학점");//80점이상 90점미만이면 B
					continue;
				case 7:
					System.out.println("C학점");//70점이상 80점미만이면 C
					continue;
				case 6:
					System.out.println("D학점");//60점이상 70점미만이면 B
					continue;
				default:
					System.out.println("F학점");//60점 미만은 F
					continue;
				
				}
			}
				int max=0;
				double sum=0;
				for(int t=0; t<studentsArray.length;t++) {//학생수만큼 반복
				 if(max<studentsArray[t].getScore())
					 max=studentsArray[t].getScore(); //최고 점수 구함
				 sum+=studentsArray[t].getScore(); //총 점수 합계 구함
				}
				double avr=sum/studentsArray.length; //평균점수 구함
				
				System.out.println("최고점수: "+max+"점");
				System.out.print("평균점수:");
				System.out.printf("%.2f\n",avr);
				
				continue;//다음루프
			}
		if(k==5) {//메뉴 5을 입력했을 때
			int snum=studentsArray.length; //학생수
			int tr=0;
			tr=(snum>3)?1:0; //조건연산자,snum>3이 참이면 tr=1, 거짓이면 tr=0 
			if(tr==1) 
				System.out.println("분반 최소학생수인 3명을 넘네요.");
				
			if(tr==0)
				System.out.println("분반 최소학생수인 3명을 넘지않네요.");
			continue;//다음루프
		}
			
		
		if(k==6) {//메뉴 6을 입력했을 때
			System.out.println("프로그램을 종료합니다! SEE YOU AGAIN.");
			break;//루프 종료
		}
		}
	}
}


		
		
			
			
			
	
		
			
		
		




