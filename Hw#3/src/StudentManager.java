
public class StudentManager {
	//��ǻ�Ͱ������� 1971055 �Ѵ���
	
	public static void main(String[] args) {
		
		//interface �迭 ����
		Student st[]= new Student[5];
		
		//�к� 2�б� ����ȭ
		st[0]=new UnderGradStudent("����ȭ");
		st[0].addSemester(1, new double[] {70,60,40,50,80,60});
		st[0].addSemester(2, new double[] {60,80,90,50,80,90});
		
		//���п� 3�б� ä��ȭ
		st[1]=new GradStudent("ä��ȭ");
		st[1].addSemester(1, new double[] {100,70,70});
		st[1].addSemester(2, new double[] {80,88,90});
		st[1].addSemester(3, new double[] {100,90,80});
		
		//�к� 3�б� ����ȭ
		st[2]=new UnderGradStudent("����ȭ");
		st[2].addSemester(1, new double[] {70,80,90,50,80,60});
		st[2].addSemester(2, new double[] {50,60,40,70,100,60});
		st[2].addSemester(3, new double[] {80,90,70,60,90,70});
		
		//���п� 1�б� ����ȭ
		st[3]=new GradStudent("����ȭ");
		st[3].addSemester(1, new double[] {80,70,90});
		
		//�к� 3�б� ����ȭ
		st[4]= new UnderGradStudent("����ȭ");
		st[4].addSemester(1, new double[] {60,90,100,90,70,80});
		st[4].addSemester(2, new double[] {80,80,90,100,90,80});
		st[4].addSemester(3, new double[] {100,90,70,80,70,90});
		
		//�л� ���� ��ü ���
		System.out.println();
		System.out.println("** ��ü �л� ��� **");
		for(int i=0; i<5; i++) {
			st[i].showStudentInfo(); 
			st[i].showScore();
			st[i].showTotAvg();
		}
		
		int sem[]= new int [5];
		for(int i=0;i<sem.length;i++)
		sem[i]=st[i].getSemester(); //�л����� ���б������ �迭�� �̿��� ����
	
		//�к� 3�б� �л��� ���� ���
		System.out.println();
		System.out.println("** �к� 3�б� �л� ��� **");
		for(int i=0; i<5; i++) {
			if(sem[i]==3 && st[i] instanceof UnderGradStudent) {//�к� 3�б�� �Ʒ� ���� 
			st[i].showStudentInfo();
			st[i].showScore();
			st[i].showTotAvg();
		}
		}
	}
}
		
		
		
		
		
		
		

	


