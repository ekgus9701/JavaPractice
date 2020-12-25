
public class Account {
	//컴퓨터공학전공 1971055 한다현 
	private String owner;
	private int balance;
	private double rate;
	
	public Account(String owner,int balance,double rate) {//사용자,은행잔고,이율의 생성자
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
	}
	public Account(String owner,int balance) {//사용자,은행잔고의 생성자
		this(owner,balance,0.05);
		this.owner=owner;
		this.balance=balance;
		
	}
	public Account(String owner,double rate) {//시용자,이율의 생성자
		this(owner,0,rate);
		this.owner=owner;
		this.rate=rate;
	}
	
	public int deposit(int inmoney) {//입금액 잔액에 더하는 메소드
		this.balance+=inmoney;
		return this.balance;
	}
	
	public int withdraw(int outmoney) {//출금액 잔액에서 빼는 메소드
		this.balance-=outmoney;
		return this.balance;

	}
	
	public double rate(double rate) { //이자율 처리하는 메소드
		this.rate=rate;
		return this.rate;
	}
	
	public int computeTotal(int month) {//이자를 계산해서 잔액에 더하는 메소드
		this.balance= (int) (this.balance+(double)month/12*this.rate*this.balance);
		return this.balance;
	}
	
	public void showBalance() {//잔액 출력 메소드
		System.out.println("Balance = "+this.balance);
		System.out.println();
	}
	
	public void showOwner() {//사용자 출력 메소드
		System.out.println("Owner = "+this.owner);
	}
	
	public void showRate() {//연이율 출력 메소드
		System.out.println("Rate = "+this.rate);
	}
	
	public void showAll() {//사용자 계정, 잔액, 연이율 출력 메소드
		
		System.out.println("Owner = "+this.owner);
		System.out.println("Balance = "+this.balance);
		System.out.println("Rate = "+this.rate);
		System.out.println();
	}
	
	
	
}
