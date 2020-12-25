package 과제4장_자프실;
import java.util.*;
public class Phone {
	private String name,tel;
	
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름과 전화번호 입력 >>");
		String name=sc.next();
		String pn=sc.next();
		Phone p1= new Phone(name,pn);
		
		System.out.print("이름과 전화번호 입력 >>");
		String name1=sc.next();
		String pn1=sc.next();
		Phone p2= new Phone(name1,pn1);
		
		System.out.println(p1.getName()+"의 번호 "+p1.getTel());
		System.out.println(p2.getName()+"의 번호 "+p2.getTel());
		
		
		

	}

}
