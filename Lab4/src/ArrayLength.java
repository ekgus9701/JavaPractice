import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Array[]=new int[4]; //�迭�� ����� ����
		int sum=0;
		System.out.print(Array.length+"���� ������ �Է��ϼ���>>");
		for(int i=0;i<Array.length;i++) {
			Array[i]=in.nextInt(); //Ű���忡�� �Է¹��� ���� ����
		}
		for(int i=0; i<Array.length;i++) {
			sum+=Array[i]; //�迭�� ����� ���� ���� ���ϱ�
		}
		System.out.println("���: "+sum/Array.length);
		in.close();

	}

}
