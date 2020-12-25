
public class Demo8 {

	public static void main(String[] args) {
		String a = "Often in Java programs you need to compare two objects to determine "
				   +"if they are equal or not. ";
		String b = "It turns out there are two different kinds of equality one can determine"
				   +" about objects in Java, reference equality or logical equality.";
		
		//a와 b를 연결하여 c에 저장후 단어별로 출력
		String c=a.concat(b);
		String s[]= c.split(" ");
		System.out.println("단어 개수= "+s.length);
		for(int i=0; i<s.length;i++)
			System.out.println(s[i]);
		
		//c의 모든 공백을 ,로 바꾸고 출력
		System.out.println();
		c=c.replace(" ", ",");
		System.out.println(c);
		
		//스트링 a를 이어붙인다.
		c=c.concat(a);
		System.out.println(c);
		
		System.out.println("------------------------");
		s=c.split(",|");
		System.out.println("단어 개수= "+s.length);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

	}

}
