
public class AccountModEx {
	//컴퓨터공학전공 1971055 한다현
	public static void main(String[] args) {
		Account [] accountsArray;//배열에 대한 레퍼런스선언
		accountsArray=new Account[3]; //레퍼런스 배열 선언
		
		accountsArray[0]= new Account("Kim",1000,0.03); //배열의 원소 객체 생성
		accountsArray[1]= new Account("Lee",0.04); //배열의 원소 객체 생성 
		accountsArray[2]= new Account("Park",2000);//배열의 원소 객체 생성 
		
		//0번 객체 배열에 저장된 데이터 사용
		accountsArray[0].showAll();//사용자 계정, 잔액, 연이율 모두 출력
		accountsArray[0].deposit(300); //입금액 처리
		accountsArray[0].withdraw(100);//출금액 처리
		accountsArray[0].computeTotal(5);//이자계산액 처리
		accountsArray[0].showOwner();//사용자 계정 출력
		accountsArray[0].showBalance();//잔액 출력
		
		//1번 객체 배열에 저장된 데이터 사용
		accountsArray[1].showAll();//사용자 계정, 잔액, 연이율 모두 출력
		accountsArray[1].deposit(300);//입금액 처리
		accountsArray[1].withdraw(100);//출금액 처리
		accountsArray[1].computeTotal(5);//이자계산액 처리
		accountsArray[1].showOwner();//사용자 계정 출력
		accountsArray[1].showBalance();//잔액 출력
		
		//2번 객체 배열에 저장된 데이터 사용
		accountsArray[2].rate(0.05);//이자율처리
		accountsArray[2].showAll();//사용자 계정, 잔액, 연이율 모두 출력
		accountsArray[2].deposit(300);//입금액 처리
		accountsArray[2].withdraw(100);//출금액 처리
		accountsArray[2].computeTotal(5);//이자계산액 처리
		accountsArray[2].showOwner();//사용자 계정 출력
		accountsArray[2].showBalance();//잔액 출력
		
	}

}
