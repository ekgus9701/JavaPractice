
public class UnderGradStudent implements Student{
	//컴퓨터공학전공 1971055 한다현
	//Student의 모든 추상메소드 구현
	
	int k=0,t=0;
	String name;
	int sem=0;
	double stud[][] =new double [8][6];
	double sem_sum[]= new double [8];
	double sem_avg[] = new double [8];
	double tot_avg=0;
	double tot_sum=0;
	

	public UnderGradStudent(String string) {
		name=string; //name변수에 이름을 저장
	}

	

	@Override
	public void showStudentInfo() {
		System.out.println("=========================================================");
		System.out.println("학부 "+sem+"학기 "+name); //학생의 소속과 학기, 이름 출력
		
		
	}

	@Override
	public void addSemester(int i, double[] s) {
		double sum=0;
		sem=i;
		i=i-1;
		

		for(k=0;k<s.length;k++) {
			stud[i][k]=s[k]; //학기 성적 저장완료
			sem_sum[i]+=s[k]; //학기 성적의 합 
		}
		
		sem_avg[i]= sem_sum[i]/s.length; //학기 평균 계산
		
		for(k=0;k<sem_avg.length;k++)
			sum +=sem_avg[k];  //총평균 계산

		tot_avg=sum/sem; //총평균
		

		
		
	}

	@Override
	public void showScore() {
		
		
		for(int q=0;q<sem;q++) {
			System.out.print(q+1+"학기: ");
			for(k=0;k<stud[q].length;k++) {
				System.out.print(stud[q][k]+" ");
			} // 현재까지의 학기별 과목별 성적출력
		
			System.out.printf("학기 평균 = %.2f",sem_avg[q]); //학기별 평균 출력
			System.out.println();
		
		}
	}
		
		
	

	@Override
	public void showTotAvg() {
		System.out.printf("총평균 = %.2f",tot_avg); //총평균 출력
		System.out.println("");
		
		
	}

	@Override
	public int getSemester() {
		
		return sem; //몇학기 생인지 정수로 반환
	}
	
	
	
	
	

	
	
}
