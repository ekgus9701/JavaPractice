package edoc_우선순위큐;
import java.util.*;
public class 최소힙_1927 {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<N;i++) {
			int x=sc.nextInt();
			if(x>0) {
				q.add(x);
				
			}
			if(x==0) {
				if(q.isEmpty()) {
					System.out.println(0);
				}
				else
					System.out.println(q.poll());
			}
			
		}
	}

}
