
public class NumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] StringNumber = {"23","12","998","3.141592"};
		
		try {
			for(int i=0;i<StringNumber.length;i++) {
				int j= Integer.parseInt(StringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ����"+j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("������ ��ȯ�� �� �����ϴ�!");
		}
	}

}
