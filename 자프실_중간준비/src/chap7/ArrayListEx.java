package chap7;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String name=sc.next();
			a.add(name);
		}
		for(int i=0;i<a.size();i++) {
			String name=a.get(i);
			System.out.print(name+" ");
		}
		int longI=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(longI).length()<a.get(i).length())
				longI=i;
		}
		System.out.println("\n ���� �� �̸���: "+a.get(longI));

	}

}
