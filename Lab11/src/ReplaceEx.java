
public class ReplaceEx {

	public static void main(String[] args) {
		String s="�����Ϻ��� �ݿ��ϱ����� �����̶�� �ϰ�, ����ϰ� �Ͽ����� �ָ��̶�� �Ѵ�.";
		s=s.replace("������", "Monday");
		s=s.replace("ȭ����", "Tuesday");
		s=s.replace("������", "Wednesday");
		s=s.replace("�����", "Thursday");
		s=s.replace("�ݿ���", "Friday");
		s=s.replace("�����", "Saturday");
		s=s.replace("�Ͽ���", "Sunday");
		System.out.println(s);
		
	}

}
