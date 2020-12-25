package edoc_DFS와BFS;

import java.util.*;

public class DFS와BFS_1260 {
    static ArrayList<Integer>[] a;
    static boolean[] c;
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        a = (ArrayList<Integer>[]) new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();  //입력한 정수의 개수만큼 배열만듦
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v); //정점입력
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
        if (c[x]) { //c배열이 true (방문했다면) return
            return;
        }
        c[x] = true;
        System.out.print(x + " ");
        for (int y : a[x]) { //arraylist에 있는 x들 true인지 확인
            if (c[y] == false) {
                dfs(y); //
            }
        }
    }
 
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        c[start] = true;
        while (!q.isEmpty()) { //q가 비지않았으면
            int x = q.remove(); //x에 탐색했던 것 대입
            System.out.print(x + " ");
            for (int y : a[x]) { //arraylist에 있는 x들 true인지 확인
                if (c[y] == false) {
                    c[y] = true;
                    q.add(y);
                }
            }
        }
    }
 
}

