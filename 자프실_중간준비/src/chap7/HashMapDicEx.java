package chap7;
import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("baby","�Ʊ�");
		dic.put("love","���");
		dic.put("apple","���");
		
		Set<String> keys=dic.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value = dic.get(key);
			System.out.print(key+","+value);
		}
		System.out.println();
		Scanner sc= new Scanner (System.in);
		for(int i=0;i<3;i++) {
			System.out.println("ã����� �ܾ��?");
			String eng=sc.next();
			String kor=dic.get(eng);
			System.out.println(kor);
		}
	}
	

}
