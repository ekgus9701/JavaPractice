
public class SamsungPhone extends PDA implements PhoneInterface {
	//PhoneInterface�� ��� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("������");
	}
	public void receiveCall() {
		System.out.println("��ȭ�Խ��ϴ�!");
	}
	
	//�޼ҵ� �߰� �ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �����׿�!!");
	}
	
	public void schedule() {
		System.out.println("��������!!!");
	}
}
