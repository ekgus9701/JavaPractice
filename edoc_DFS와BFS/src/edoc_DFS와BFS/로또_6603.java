package edoc_DFS��BFS;
import java.util.*;

public class �ζ�_6603 {
	public static List<Integer>list= new ArrayList<>();
	
	public static void find(int a[],int index,int cnt) {
		if(cnt==6) {
			for(int v:list)
				System.out.print(v+" ");
			System.out.println();
			return;
		}
		 if(index >= a.length) return;
	        
	        list.add(a[index]);
	        find(a, index+1, cnt+1); //����ϴ� ���
	        list.remove(list.size()-1);
	        find(a, index+1, cnt); //������� �ʴ� ���
	    }
	

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			int k=sc.nextInt();
			if(k==0) break;
			
			int s1[]=new int[k];
			boolean s2[]=new boolean[k];
			
			for(int i=0;i<k;i++) {
				s1[i]=sc.nextInt();
			}
			find(s1,0,0);
			System.out.println();
			list.clear();
		}
		

	}
	
}
