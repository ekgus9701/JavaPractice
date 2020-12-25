
public interface Student {
	//컴퓨터공학전공 1971055 한다현
	void showStudentInfo(); //학생정보 출력
	void addSemester(int i,double s[]); //i학교 과목 점수 기록
	void showScore();  //지금까지의 각 과목 점수와 학기 평균 출력
	void showTotAvg();  //지금까지의 총 평균을 출력
	int getSemester();  //몇 학기생인가를 반환
}
