
public class AccountModEx {
	//��ǻ�Ͱ������� 1971055 �Ѵ���
	public static void main(String[] args) {
		Account [] accountsArray;//�迭�� ���� ���۷�������
		accountsArray=new Account[3]; //���۷��� �迭 ����
		
		accountsArray[0]= new Account("Kim",1000,0.03); //�迭�� ���� ��ü ����
		accountsArray[1]= new Account("Lee",0.04); //�迭�� ���� ��ü ���� 
		accountsArray[2]= new Account("Park",2000);//�迭�� ���� ��ü ���� 
		
		//0�� ��ü �迭�� ����� ������ ���
		accountsArray[0].showAll();//����� ����, �ܾ�, ������ ��� ���
		accountsArray[0].deposit(300); //�Աݾ� ó��
		accountsArray[0].withdraw(100);//��ݾ� ó��
		accountsArray[0].computeTotal(5);//���ڰ��� ó��
		accountsArray[0].showOwner();//����� ���� ���
		accountsArray[0].showBalance();//�ܾ� ���
		
		//1�� ��ü �迭�� ����� ������ ���
		accountsArray[1].showAll();//����� ����, �ܾ�, ������ ��� ���
		accountsArray[1].deposit(300);//�Աݾ� ó��
		accountsArray[1].withdraw(100);//��ݾ� ó��
		accountsArray[1].computeTotal(5);//���ڰ��� ó��
		accountsArray[1].showOwner();//����� ���� ���
		accountsArray[1].showBalance();//�ܾ� ���
		
		//2�� ��ü �迭�� ����� ������ ���
		accountsArray[2].rate(0.05);//������ó��
		accountsArray[2].showAll();//����� ����, �ܾ�, ������ ��� ���
		accountsArray[2].deposit(300);//�Աݾ� ó��
		accountsArray[2].withdraw(100);//��ݾ� ó��
		accountsArray[2].computeTotal(5);//���ڰ��� ó��
		accountsArray[2].showOwner();//����� ���� ���
		accountsArray[2].showBalance();//�ܾ� ���
		
	}

}
