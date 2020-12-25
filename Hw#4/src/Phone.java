
import java.util.*;
public class Phone {
	//1971055 한다현

	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("* 전화번호 관리 프로그램 *");
		System.out.println("----------------------------------");
		
		//사람 이름과 Person객체를 쌍으로 저장하는 HashMap컬렉션 생성
		HashMap<String,Person> map = new HashMap<String,Person>();
		
		Scanner sc = new Scanner(System.in); 

		
		while(true) {
			System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4 >>");
			int i=sc.nextInt();//숫자 입력받은 것 i에 대입
			
			if(i==4)
				break;//4를 누르면 종료
			
			else if(i==0) {//0을 누르면
				
				Scanner sc0 = new Scanner(System.in);
				System.out.print("이름>>");
				String name=sc0.next(); //이름대입
				if(map.containsKey(name)) { //이름이 이미 입력됐다면
					System.out.println("이미 존재하는 사람입니다.");
					continue; //메뉴선택화면으로 돌아가기
					}
				System.out.print("주소>>");
				String addr=sc0.next();//주소대입
				System.out.print("전화번호>>");
				String tel = sc0.next();//전화번호대입
				
				if(!map.containsKey(name)) //이름이 처음 입력된다면
					map.put(name, new Person(addr,tel)); //이름과 주소 전화번호 저장

			}
			else if(i==1) {//1을 누르면
				System.out.print("이름>>");
				Scanner sc1 = new Scanner(System.in);
				String name=sc1.next(); //이름 대입
				if(!map.containsKey(name)) //이름이 처음 입력된다면
					System.out.println("등록되지 않은 사랍입니다!");
				else {
					map.remove(name); //이름과 매핑된 모든값들 삭제
					System.out.println(name+"님은 삭제되었습니다.");
				}
				
			}
			
			else if(i==2) {//2를 누르면
				System.out.print("이름>>");
				Scanner sc2 = new Scanner(System.in);
				String name=sc2.next(); //이름대입
				if(!map.containsKey(name)) //이름이 처음 입력된다면
					System.out.println("등록되지 않은 사랍입니다!");
				else { //이름이 이미 입력됐다면
					Person person = map.get(name); //name으로 값읽기
					System.out.println(name+" "+person.addr+" "+person.tel);
				}
			}
			
			else if(i==3) {//3을 누르면
				//모든 사람 출력, map 컬렉션에 들어있는 모든(key, value) 쌍 출력
				//key 문자열을 가진 집합 Set 컬렉션 리턴
				Set<String> names = map.keySet(); 
				
				//key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
				Iterator<String> it = names.iterator();
				while(it.hasNext()) {
					String name = it.next();//다음 키
					Person person = map.get(name);
					System.out.println(name +" "+person.addr+" "+person.tel);
				}
			}
			else
				System.out.println("메뉴를 잘못입력하셨습니다! 다시 입력해주세요.");
			
		}	
	}
}
