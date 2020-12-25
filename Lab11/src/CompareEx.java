import java.util.*;
public class CompareEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		String s1 = sc.next();
		String s2 = sc.next();
		
		StringTokenizer st1 = new StringTokenizer(s1);
		StringTokenizer st2 = new StringTokenizer(s2);
		
		while(st1.hasMoreTokens() && st2.hasMoreTokens()) {
			if((st1.nextToken()).compareTo(st2.nextToken())==0)
				System.out.println("����");
			else System.out.println("�ٸ���");
		}
		
		if(st1.hasMoreTokens())
			System.out.println("s1�� ���");
		else if(st2.hasMoreTokens())
			System.out.println("s2�� ���");
		sc.close();

	}

}
