package 과제4장_자프실;
import java.util.*;

class Phones{
	String name,tel;
	
	public Phones(String na,String te) {
		this.name=na;
		this.tel=te;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	

}
public class PhoneManager {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수>>");
		int n=sc.nextInt();
		Phones[] p;
		p=new Phones[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			String name=sc.next();
			String tele=sc.next();
			p[i]=new Phones(name,tele);
		
		}
		System.out.println("저장되었습니다.");
		while(true) {
			System.out.print("검색할 이름>>");
			String str=sc.next();
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			
			for(int i=0;i<n;i++) {
				if(str.equals(p[i].getName())) {
					System.out.println(str+"의 번호는 "+p[i].getTel()+" 입니다.");
				}
			}
			
			
		}
		
		

	}

}
