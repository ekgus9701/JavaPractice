package chap6;
import java.util.*;
public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaa,bbb,ccc,ddd";
		StringTokenizer st=new StringTokenizer(s,",");
		int n=st.countTokens();
		System.out.println("��ū ���� = "+n);
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}

	}

}
