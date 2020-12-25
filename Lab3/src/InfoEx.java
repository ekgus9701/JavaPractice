import java.util.Scanner;
public class InfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름 도시 나이 체중 미혼 여부를 빈칸을 이용하여 입력해 주세요!");
		
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
	


