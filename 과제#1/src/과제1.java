import java.util.Scanner;
import java.util.InputMismatchException;
public class ����1 {
	//1971055 ��ǻ�Ͱ������� �Ѵ��� 
	//Ŭ������ 2�� ��������ϴ�.
	public static void main(String[] args) {
		Students[] studentsArray =null; //�迭����
		
		
		Scanner scanner = new Scanner(System.in); //Scanner ��ü ����
		
		
		for(int i=0;i<6;i++) {
		System.out.println("=====================================================");
		System.out.println(">>1. �л��� �Է� >>2.���� �Է�  >>3.���� ����Ʈ >>4.���� �м� >>5.�л��� Ȯ�� >>6.����"); //�޴� ����
		System.out.println("=====================================================");
		System.out.println("����>");
		int k = scanner.nextInt(); //�Էµ� �޴�
		if(k==1) { //�޴� 1�� �Է����� ��
			System.out.println("�л����� �Է����ּ���!>");
			int num= scanner.nextInt();
			studentsArray = new Students[num]; //Students ��ü ���۷��� �迭 ����
			continue; //��������
		}
		if(k==2) {//�޴� 2�� �Է����� ��
		for(int j=0; j<studentsArray.length;j++) {//�л�����ŭ �ݺ�
			
			System.out.println("������ �Է����ּ���!>");
			System.out.println(j+1+"���л�>");
			while(true) {
				int score=0;
				try {
					 score = scanner.nextInt(); //�����Է�
					}
					catch(InputMismatchException e) {//������ �ƴ� ���� �Է����� �� �߻��ϴ� ���� ó��
						System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
						scanner.next();//�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ����
						continue;//��������
					}
					
				
			if(score>100) {//score�� 100���� Ŭ��
				System.out.println("100���� ���� ���� �ٽ� �Է��ϼ���!\n");
				continue;//��������
			}
			else if(score<0) {//score�� 0���� ������
				System.out.println("0���� ū ���� �ٽ� �Է��ϼ���!\n");
				continue;//��������
			}
			else {//score�� 0 �̻��̰� 100�����ϋ�
				studentsArray[j]= new Students(score); //Students ��ü ����
				break;//���� ����
				}
			
			}
			}
		continue;//��������
		}
		if(k==3) {//�޴� 3�� �Է����� ��
			for(int j=0; j<studentsArray.length;j++) {//�л�����ŭ �ݺ�
				System.out.print(j+1+"�� �л� :");
				System.out.println(studentsArray[j].getScore()+"��");//���� ���
				for(int l=0; l<studentsArray[j].getScore();l++) { //������ŭ �ݺ�
				System.out.print("*");//���� �׷��� ���
				}
				System.out.println("");
			}
			continue;//���� ����
		}
		if(k==4) {//�޴� 4�� �Է����� ��
			for(int j=0; j<studentsArray.length;j++) {//�л�����ŭ �ݺ�
				System.out.print(j+1+"�� �л� :");
				System.out.print(studentsArray[j].getScore()+"��"); //���� ���
				System.out.print("    ");
				int number=studentsArray[j].getScore()/10;
				switch(number) { //�����˷��ִ� ���α׷�
				case 10:
				case 9:
					System.out.println("A����");//90�� �̻��̸� A
					continue;
				case 8:
					System.out.println("B����");//80���̻� 90���̸��̸� B
					continue;
				case 7:
					System.out.println("C����");//70���̻� 80���̸��̸� C
					continue;
				case 6:
					System.out.println("D����");//60���̻� 70���̸��̸� B
					continue;
				default:
					System.out.println("F����");//60�� �̸��� F
					continue;
				
				}
			}
				int max=0;
				double sum=0;
				for(int t=0; t<studentsArray.length;t++) {//�л�����ŭ �ݺ�
				 if(max<studentsArray[t].getScore())
					 max=studentsArray[t].getScore(); //�ְ� ���� ����
				 sum+=studentsArray[t].getScore(); //�� ���� �հ� ����
				}
				double avr=sum/studentsArray.length; //������� ����
				
				System.out.println("�ְ�����: "+max+"��");
				System.out.print("�������:");
				System.out.printf("%.2f\n",avr);
				
				continue;//��������
			}
		if(k==5) {//�޴� 5�� �Է����� ��
			int snum=studentsArray.length; //�л���
			int tr=0;
			tr=(snum>3)?1:0; //���ǿ�����,snum>3�� ���̸� tr=1, �����̸� tr=0 
			if(tr==1) 
				System.out.println("�й� �ּ��л����� 3���� �ѳ׿�.");
				
			if(tr==0)
				System.out.println("�й� �ּ��л����� 3���� �����ʳ׿�.");
			continue;//��������
		}
			
		
		if(k==6) {//�޴� 6�� �Է����� ��
			System.out.println("���α׷��� �����մϴ�! SEE YOU AGAIN.");
			break;//���� ����
		}
		}
	}
}


		
		
			
			
			
	
		
			
		
		




