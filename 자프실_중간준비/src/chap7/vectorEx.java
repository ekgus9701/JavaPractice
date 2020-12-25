package chap7;

import java.util.Vector;

public class vectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(7);
		v.add(5);
		v.add(7);
		v.add(3);
		int n=v.size();
		int c=v.capacity();
		System.out.println(n+","+c);
		v.add(2,100);
		int i = v.get(1);
		System.out.println(i);
		
		v.remove(1);
		int last=v.lastElement();
		v.removeAllElements();

	}

}
