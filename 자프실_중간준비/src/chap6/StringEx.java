package chap6;

public class StringEx {

	public static void main(String[] args) {
		String a =new String("  C#");
		String b = new String(",C++   ");
		
		System.out.println(a.length());
		System.out.println(a.contains("#"));
		a=a.concat(b);
		a=a.trim();
		a=a.replace("#","^");
		String s[]=a.split(",");
		a=a.substring(4);
		char c=a.charAt(2);

	}

}
