import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		
		int dividend, divisor; //�������� ������ ����
		
		System.out.println("�������� �Է�: ");
		
		dividend = a.nextInt();
		
		System.out.println("�������� �Է�: ");
		
		divisor = a.nextInt();
		
		try {
		System.out.println(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor + "�Դϴ�.");
		}
		
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
		}
		a.close();
		
	}

}
