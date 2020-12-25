package edoc_�ִܰ��;


import java.util.LinkedList;
import java.util.*;
class  N�����۾�����{
    public static int solution(int[] n, int[][] r, int goal) {
        int n_len = n.length; // ������ ����
        int[][] adj = new int[n_len][n_len]; // �������� ���İ��� ǥ��
        int[] time = new int[n_len]; // �ش� ������ �ҿ� �ð�
        int[] total = new int[n_len]; // �ּ� �ҿ� �ð�
        int[] inDegree = new int[n_len]; // ���� ������ ����

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

