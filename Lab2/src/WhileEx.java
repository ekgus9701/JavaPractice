import java.util.Scanner;
public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;//count�� �Էµ� ������ ����
		int sum=0; //sum�� ��
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n=scanner.nextInt();//�����Է�
		//-1�� �ԷµǸ� while�� ���
		while(n!=-1) {
			sum+=n;
			count++;
			n=scanner.nextInt();//�����Է�
		
		}
		if(count==0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������"+count+"���̸�");
			System.out.println("�����"+(double)sum/count+"�Դϴ�.");
		}
		scanner.close();
	}

}
	


