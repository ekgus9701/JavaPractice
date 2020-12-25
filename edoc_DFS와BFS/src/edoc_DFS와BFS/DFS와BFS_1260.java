package edoc_DFS��BFS;

import java.util.*;

public class DFS��BFS_1260 {
    static ArrayList<Integer>[] a;
    static boolean[] c;
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        a = (ArrayList<Integer>[]) new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();  //�Է��� ������ ������ŭ �迭����
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v); //�����Է�
            a[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(a[i]);
        }
        c = new boolean[n + 1];
        dfs(start);
        System.out.println();
        c = new boolean[n + 1];
        bfs(start);
        System.out.println();
    }
 
    public static void dfs(int x) {
        if (c[x]) { //c�迭�� true (�湮�ߴٸ�) return
            return;
        }
        c[x] = true;
        System.out.print(x + " ");
        for (int y : a[x]) { //arraylist�� �ִ� x�� true���� Ȯ��
            if (c[y] == false) {
                dfs(y); //
            }
        }
    }
 
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        c[start] = true;
        while (!q.isEmpty()) { //q�� �����ʾ�����
            int x = q.remove(); //x�� Ž���ߴ� �� ����
            System.out.print(x + " ");
            for (int y : a[x]) { //arraylist�� �ִ� x�� true���� Ȯ��
                if (c[y] == false) {
                    c[y] = true;
                    q.add(y);
                }
            }
        }
    }
 
}

