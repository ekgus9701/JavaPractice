
public class Demo7 {

	public static void main(String[] args) {
		String a = new String("    Hello, ");
		String b = new String("World!    ");
		
		//�ι��ڿ� ����
		a=a.concat(b);
		System.out.println("���ڿ� ����");
		System.out.println(a);
		System.out.println();
		
		//���ڿ����� �� ���� ���� ����
		a=a.trim();
		System.out.println("���ڿ� �� ���� ���� ����");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� ��ġ
		a=a.replace("o", "###");
		System.out.println("���ڿ����� o�� ###�� �ٲ�");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� �и�
		String s[]=a.split(",");
		System.out.println("���ڿ��� �޸��� �и�");
		for(int i=0; i<s.length; i++) {
			System.out.println("�и��� "+i+"�� ���ڿ�: "+s[i]);
		}
		System.out.println();
		
		//���꽺Ʈ�� a[3]~
		a=a.substring(3);
		System.out.println("���ڿ��� �Ϻ� a[3]~��");
		System.out.println(a);
		System.out.println();
		
		//���ڿ� ���� ����
		char c = a.charAt(2);
		System.out.println("�L�ڿ� ���� ���� a[2]");
		System.out.println(c);
		System.out.println();
		
		//��� �ҹ��ڷ� ��ȯ
		a=a.toLowerCase();
		System.out.println("�ҹ��ڷ� ��ȯ");
		System.out.println(a);
		System.out.println();
		
		//��� �빮�ڷ� ��ȯ
		a=a.toUpperCase();
		System.out.println("�빮�ڷ� ��ȯ");
		System.out.println(a);
		System.out.println();

	}

}
