
public class UnderGradStudent implements Student{
	//��ǻ�Ͱ������� 1971055 �Ѵ���
	//Student�� ��� �߻�޼ҵ� ����
	
	int k=0,t=0;
	String name;
	int sem=0;
	double stud[][] =new double [8][6];
	double sem_sum[]= new double [8];
	double sem_avg[] = new double [8];
	double tot_avg=0;
	double tot_sum=0;
	

	public UnderGradStudent(String string) {
		name=string; //name������ �̸��� ����
	}

	

	@Override
	public void showStudentInfo() {
		System.out.println("=========================================================");
		System.out.println("�к� "+sem+"�б� "+name); //�л��� �ҼӰ� �б�, �̸� ���
		
		
	}

	@Override
	public void addSemester(int i, double[] s) {
		double sum=0;
		sem=i;
		i=i-1;
		

		for(k=0;k<s.length;k++) {
			stud[i][k]=s[k]; //�б� ���� ����Ϸ�
			sem_sum[i]+=s[k]; //�б� ������ �� 
		}
		
		sem_avg[i]= sem_sum[i]/s.length; //�б� ��� ���
		
		for(k=0;k<sem_avg.length;k++)
			sum +=sem_avg[k];  //����� ���

		tot_avg=sum/sem; //�����
		

		
		
	}

	@Override
	public void showScore() {
		
		
		for(int q=0;q<sem;q++) {
			System.out.print(q+1+"�б�: ");
			for(k=0;k<stud[q].length;k++) {
				System.out.print(stud[q][k]+" ");
			} // ��������� �б⺰ ���� �������
		
			System.out.printf("�б� ��� = %.2f",sem_avg[q]); //�б⺰ ��� ���
			System.out.println();
		
		}
	}
		
		
	

	@Override
	public void showTotAvg() {
		System.out.printf("����� = %.2f",tot_avg); //����� ���
		System.out.println("");
		
		
	}

	@Override
	public int getSemester() {
		
		return sem; //���б� ������ ������ ��ȯ
	}
	
	
	
	
	

	
	
}
