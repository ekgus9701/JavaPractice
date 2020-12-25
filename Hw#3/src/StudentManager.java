
public class StudentManager {
	//컴퓨터공학전공 1971055 한다현
	
	public static void main(String[] args) {
		
		//interface 배열 생성
		Student st[]= new Student[5];
		
		//학부 2학기 송이화
		st[0]=new UnderGradStudent("송이화");
		st[0].addSemester(1, new double[] {70,60,40,50,80,60});
		st[0].addSemester(2, new double[] {60,80,90,50,80,90});
		
		//대학원 3학기 채이화
		st[1]=new GradStudent("채이화");
		st[1].addSemester(1, new double[] {100,70,70});
		st[1].addSemester(2, new double[] {80,88,90});
		st[1].addSemester(3, new double[] {100,90,80});
		
		//학부 3학기 김이화
		st[2]=new UnderGradStudent("김이화");
		st[2].addSemester(1, new double[] {70,80,90,50,80,60});
		st[2].addSemester(2, new double[] {50,60,40,70,100,60});
		st[2].addSemester(3, new double[] {80,90,70,60,90,70});
		
		//대학원 1학기 박이화
		st[3]=new GradStudent("박이화");
		st[3].addSemester(1, new double[] {80,70,90});
		
		//학부 3학기 정이화
		st[4]= new UnderGradStudent("정이화");
		st[4].addSemester(1, new double[] {60,90,100,90,70,80});
		st[4].addSemester(2, new double[] {80,80,90,100,90,80});
		st[4].addSemester(3, new double[] {100,90,70,80,70,90});
		
		//학생 정보 전체 출력
		System.out.println();
		System.out.println("** 전체 학생 기록 **");
		for(int i=0; i<5; i++) {
			st[i].showStudentInfo(); 
			st[i].showScore();
			st[i].showTotAvg();
		}
		
		int sem[]= new int [5];
		for(int i=0;i<sem.length;i++)
		sem[i]=st[i].getSemester(); //학생들이 몇학기생인지 배열을 이용해 정리
	
		//학부 3학기 학생들 정보 출력
		System.out.println();
		System.out.println("** 학부 3학기 학생 기록 **");
		for(int i=0; i<5; i++) {
			if(sem[i]==3 && st[i] instanceof UnderGradStudent) {//학부 3학기면 아래 실행 
			st[i].showStudentInfo();
			st[i].showScore();
			st[i].showTotAvg();
		}
		}
	}
}
		
		
		
		
		
		
		

	


