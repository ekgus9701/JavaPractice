import java.util.Scanner;
public class InfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸� ���� ���� ü�� ��ȥ ���θ� ��ĭ�� �̿��Ͽ� �Է��� �ּ���!");
		
		Scanner a= new Scanner (System.in);
		
		String name=a.next();
		System.out.println("Name:"+name);
		
		String city=a.next();
		System.out.println("City:"+city);
		
		int age=a.nextInt();
		System.out.println("Age:"+age);
		
		double weight=a.nextDouble();
		System.out.println("Weight:"+weight);

		Boolean single=a.hasNextBoolean();
		System.out.println("Single:"+single);
		
		a.close();
	}
}
	


