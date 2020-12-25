
public class SamsungPhone extends PDA implements PhoneInterface {
	//PhoneInterface의 모든 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉");
	}
	public void receiveCall() {
		System.out.println("전화왔습니다!");
	}
	
	//메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌네요!!");
	}
	
	public void schedule() {
		System.out.println("일정관리!!!");
	}
}
