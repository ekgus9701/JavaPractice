import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int Array[]=new int[5]; //�迭����
		int max=0, sum=0; //ū ���� �ջ� ���� ����� �ʱ�ȭ
		
		System.out.println("5���� ���ڸ� �Է��ϼ���!");
		
		for(int i=0; i<5; i++) {
			Array[i]=in.nextInt(); //�Է¹��� ������ �迭�� ����
			
		}
		for(int i=0; i<5; i++) {
			sum+=Array[i];
			if(max<Array[i]) //Array[i]�� ���� ���� ū ������ ũ��
				max=Array[i]; //Array[i]�� max�� ����
	}
		System.out.println("���� ū ��:"+max);
		System.out.println("�հ�:"+sum);
		in.close(); //��ĳ�� ����
	}
		

}
