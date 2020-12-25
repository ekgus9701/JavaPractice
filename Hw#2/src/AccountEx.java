
public class AccountEx {
	//컴퓨터공학전공 1971055 한다현
	public static void main(String[] args) {
		
		Account a=new Account("Kim", 1000, 0.03);  //객체 생성
		Account b=new Account("Lee", 0.04); //객체 생성
		Account c=new Account("Park", 2000);//객체 생성
		
		//a에 저장된 데이터 사용
		a.showAll();//사용자 계정, 잔액, 연이율 모두 출력
		a.deposit(300);//입금액 처리
		a.withdraw(100);//출금액 처리
		a.computeTotal(5);//이자계산액 처리
		a.showOwner();//사용자 계정 출력
		a.showBalance();//잔액 출력
		
		//b에 저장된 데이터 사용
		b.showAll();//사용자 계정, 잔액, 연이율 모두 출력
		b.deposit(300);//입금액 처리
		b.withdraw(100);//출금액 처리
		b.computeTotal(5);//이자계산액 처리
		b.showOwner();//사용자 계정 출력
		b.showBalance();//잔액 출력
		
		//c에 저장된 데이터 사용
		c.rate(0.05);//이자율처리
		c.showAll();//사용자 계정,잔액,연이율 모두 출력
		c.deposit(300);//입금액 처리
		c.withdraw(100);//출금액 처리
		c.computeTotal(5);//이자계산액 처리
		c.showOwner();//사용자 계정 출력
		c.showBalance();//잔액 출력
		
		

	}

}
	


