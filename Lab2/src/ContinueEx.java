import java.util.Scanner;
public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 5�� �Է�: ");
		int sum=0;
		
		for(int i=0;i<5;i++) {
			int n=scanner.nextInt();//Ű���� ���� �Է�
			
			if(n<=0)
				continue;//����� �ƴ� ��� ���� �ݺ����� ����
			else
				sum+=n;//����� ��� ����
		}
		System.out.println("����� sum="+sum);
		scanner.close();
		
	}

}
