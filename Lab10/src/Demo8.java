
public class Demo8 {

	public static void main(String[] args) {
		String a = "Often in Java programs you need to compare two objects to determine "
				   +"if they are equal or not. ";
		String b = "It turns out there are two different kinds of equality one can determine"
				   +" about objects in Java, reference equality or logical equality.";
		
		//a�� b�� �����Ͽ� c�� ������ �ܾ�� ���
		String c=a.concat(b);
		String s[]= c.split(" ");
		System.out.println("�ܾ� ����= "+s.length);
		for(int i=0; i<s.length;i++)
			System.out.println(s[i]);
		
		//c�� ��� ������ ,�� �ٲٰ� ���
		System.out.println();
		c=c.replace(" ", ",");
		System.out.println(c);
		
		//��Ʈ�� a�� �̾���δ�.
		c=c.concat(a);
		System.out.println(c);
		
		System.out.println("------------------------");
		s=c.split(",|");
		System.out.println("�ܾ� ����= "+s.length);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

	}

}
