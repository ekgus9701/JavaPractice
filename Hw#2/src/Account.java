
public class Account {
	//��ǻ�Ͱ������� 1971055 �Ѵ��� 
	private String owner;
	private int balance;
	private double rate;
	
	public Account(String owner,int balance,double rate) {//�����,�����ܰ�,������ ������
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
	}
	public Account(String owner,int balance) {//�����,�����ܰ��� ������
		this(owner,balance,0.05);
		this.owner=owner;
		this.balance=balance;
		
	}
	public Account(String owner,double rate) {//�ÿ���,������ ������
		this(owner,0,rate);
		this.owner=owner;
		this.rate=rate;
	}
	
	public int deposit(int inmoney) {//�Աݾ� �ܾ׿� ���ϴ� �޼ҵ�
		this.balance+=inmoney;
		return this.balance;
	}
	
	public int withdraw(int outmoney) {//��ݾ� �ܾ׿��� ���� �޼ҵ�
		this.balance-=outmoney;
		return this.balance;

	}
	
	public double rate(double rate) { //������ ó���ϴ� �޼ҵ�
		this.rate=rate;
		return this.rate;
	}
	
	public int computeTotal(int month) {//���ڸ� ����ؼ� �ܾ׿� ���ϴ� �޼ҵ�
		this.balance= (int) (this.balance+(double)month/12*this.rate*this.balance);
		return this.balance;
	}
	
	public void showBalance() {//�ܾ� ��� �޼ҵ�
		System.out.println("Balance = "+this.balance);
		System.out.println();
	}
	
	public void showOwner() {//����� ��� �޼ҵ�
		System.out.println("Owner = "+this.owner);
	}
	
	public void showRate() {//������ ��� �޼ҵ�
		System.out.println("Rate = "+this.rate);
	}
	
	public void showAll() {//����� ����, �ܾ�, ������ ��� �޼ҵ�
		
		System.out.println("Owner = "+this.owner);
		System.out.println("Balance = "+this.balance);
		System.out.println("Rate = "+this.rate);
		System.out.println();
	}
	
	
	
}
