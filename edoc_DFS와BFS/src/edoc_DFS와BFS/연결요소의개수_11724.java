package edoc_DFS��BFS;
import java.util.*;

public class �������ǰ���_11724 {

	public static void main(String[] args) {
		int u[] = new int[1000],v[]= new int[1000];
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count=0;
		
		Scanner sc1= new Scanner(System.in);
		for(int i=0;i<M;i++) {
			u[i]=sc1.nextInt();
			v[i]=sc1.nextInt();
		}
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<M;j++) {
				if(u[i]==v[j]) {
					v[j]=u[j];
					u[j]=0;
					v[i]=0;
					/*
					  12
					  23�̶��
					  00
					  13���� �ٲ۴ٴ� ��
					 */
					
				}	
			}
		}
		for(int i=0;i<N;i++) {
			if(u[i]!=0) {
				count++; //0�� �ƴϸ� +1
			}
		}
		
		System.out.println(count);
	}

}
