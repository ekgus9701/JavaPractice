import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(1001, "����ȭ");
		h.put(1003, "����ȭ");
		h.put(1010, "����ȭ");
		h.put(1004, "����ȭ");
		
		System.out.println(h.get(1003));
		
		Set<Integer> key = h.keySet();
		Iterator <Integer> it = key.iterator();
		
		System.out.println("=====");
		while(it.hasNext()) {
			System.out.println(h.get(it.next()));
		}
		

	}

}
