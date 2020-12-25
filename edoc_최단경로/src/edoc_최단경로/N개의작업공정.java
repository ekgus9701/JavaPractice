package edoc_최단경로;


import java.util.LinkedList;
import java.util.*;
class  N개의작업공정{
    public static int solution(int[] n, int[][] r, int goal) {
        int n_len = n.length; // 공정의 개수
        int[][] adj = new int[n_len][n_len]; // 공정간의 선후관계 표시
        int[] time = new int[n_len]; // 해당 공정의 소요 시간
        int[] total = new int[n_len]; // 최소 소요 시간
        int[] inDegree = new int[n_len]; // 선수 공정의 개수

        System.arraycopy(n, 0, time, 0, n_len);
        /*
        for (int i = 0; i < n_len; i++)
            time[i] = n[i];
         */

        for (int[] ints : r) {
            int X = ints[0] - 1;
            int Y = ints[1] - 1;
            adj[X][Y] = 1;
            inDegree[Y]++;
        }
        /*
        for (int i = 0; i < r_len; i++) {
            int X = r[i][0] - 1;
            int Y = r[i][1] - 1;
            adj[X][Y] = 1;
            inDegree[Y]++;
        }
         */

        LinkedList<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < n_len; i++) {
            if (inDegree[i] == 0) {
                total[i] = time[i];
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int q = queue.poll();
            for (int i = 0; i < n_len; i++) {
                if (adj[q][i] == 1) {
                    total[i] = Math.max(total[i], total[q] + time[i]);
                    if (--inDegree[i] == 0) queue.add(i);
                }
            }
        }

        return total[goal - 1];
    }
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int R=sc.nextInt();
		int[] n = new int[N];
		int [][] r=  new int[R][R];
		
		for(int i=0;i<N;i++) {
			n[i]=sc.nextInt();
		}
		for(int k=0;k<R;k++) {
			for(int j=0;j<2;j++) {
				r[k][j]=sc.nextInt();
			}
		}
		
		int goal=sc.nextInt();
		int k=solution(n,r,goal);
		System.out.println(k);
		
	}
}

