
public class AccountEx {
	//��ǻ�Ͱ������� 1971055 �Ѵ���
	public static void main(String[] args) {
		
		Account a=new Account("Kim", 1000, 0.03);  //��ü ����
		Account b=new Account("Lee", 0.04); //��ü ����
		Account c=new Account("Park", 2000);//��ü ����
		
		//a�� ����� ������ ���
		a.showAll();//����� ����, �ܾ�, ������ ��� ���
		a.deposit(300);//�Աݾ� ó��
		a.withdraw(100);//��ݾ� ó��
		a.computeTotal(5);//���ڰ��� ó��
		a.showOwner();//����� ���� ���
		a.showBalance();//�ܾ� ���
		
		//b�� ����� ������ ���
		b.showAll();//����� ����, �ܾ�, ������ ��� ���
		b.deposit(300);//�Աݾ� ó��
		b.withdraw(100);//��ݾ� ó��
		b.computeTotal(5);//���ڰ��� ó��
		b.showOwner();//����� ���� ���
		b.showBalance();//�ܾ� ���
		
		//c�� ����� ������ ���
		c.rate(0.05);//������ó��
		c.showAll();//����� ����,�ܾ�,������ ��� ���
		c.deposit(300);//�Աݾ� ó��
		c.withdraw(100);//��ݾ� ó��
		c.computeTotal(5);//���ڰ��� ó��
		c.showOwner();//����� ���� ���
		c.showBalance();//�ܾ� ���
		
		

	}

}
	


