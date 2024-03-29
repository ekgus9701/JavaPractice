package edoc_최단경로;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 최단경로_1753 {	 
	
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
	        // BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
	        String[] str = br.readLine().split(" ");
	        int vertex = Integer.parseInt(str[0]);
	        int edge = Integer.parseInt(str[1]);
	        int K = Integer.parseInt(br.readLine());
	        int[] distance = new int[vertex + 1];
	        // 방문하지 못한점은 INF로 출력해줘야한다.
	        boolean[] visited = new boolean[vertex + 1];
	        Arrays.fill(distance, Integer.MAX_VALUE);
	        // index by index 배열로 했더니 메모리 초과 나서 ArrayList로 바꿈.
	        ArrayList<Edge>[] list = new ArrayList[vertex + 1];
	        for (int i = 0; i <= vertex; i++) {
	            list[i] = new ArrayList<Edge>();
	        }
	 
	        for (int i = 0; i < edge; i++) {
	            str = br.readLine().split(" ");
	            list[Integer.parseInt(str[0])].add(new Edge(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
	        }
	 
	        // 우선순위 큐를 사용해야 한다. 성능이 더 좋아짐
	        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	        // 시작점 설정해주고 시작점 - 시작점 거리는 0이다.
	        q.add(K);
	        distance[K] = 0;
	        while (!q.isEmpty()) {
	            // 다음에 방문할 vertex 설정
	            int current = q.poll();
	            // 방문했기 떄문에 true, INF는 아니다.
	            visited[current] = true;
	 
	            for (int i = 0; i < list[current].size(); i++) {
	                // 현재 vertex에서 다음 vertex를 차근차근 비교해서 우선순위 큐에 넣어야한다.
	                int next = list[current].get(i).end; // 다음 vertex
	                int value = list[current].get(i).value; // 현재 - 다음 간 edge값
	 
	                // 이전에 있던 값이 더 크다면 굳이 다시 방문할 필요가 없다. 이미 그 전이 더 최단 경로이기 때문에
	                if (distance[next] > distance[current] + value) {
	                    distance[next] = Math.min(distance[next], value + distance[current]);
	                    q.add(next);
	 
	                }
	 
	            }
	        }
	        // 출력
	        for (int i = 1; i <= vertex; i++) {
	            if (visited[i]) {
	                System.out.println(distance[i]);
	            } else {
	                System.out.println("INF");
	            }
	        }
	    }
	 
	}
	 
	class Edge {
	    int end;
	    int value;
	 
	    Edge(int end, int value) {
	        this.end = end;
	        this.value = value;
	    }
	}


