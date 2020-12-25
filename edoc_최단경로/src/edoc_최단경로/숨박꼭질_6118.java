package edoc_�ִܰ��;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class ���ڲ���_6118 {

		static int N, M;
		static ArrayList<ArrayList<Integer>> adj;
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = null;
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			// �׷��� �������� �Է¹ޱ�
			adj = new ArrayList<>();
			for(int i=0; i<=N; i++)
				adj.add(new ArrayList<>());

			for(int i=0; i<M; i++){
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				adj.get(a).add(b);
				adj.get(b).add(a);
			}

			dijkstra(1);
		}
		
		private static void dijkstra(int v){
			boolean[] visited = new boolean[N+1]; //�湮���θ� ������ visited ����
			int[] dist = new int[N+1];//��������κ��� �Ÿ��� ������ dist�迭 ����

			// distance �ʱ�ȭ
			Arrays.fill(dist, Integer.MAX_VALUE);
			
			// ������ �湮ǥ�� �� �Ÿ� 0 �ʱ�ȭ
			visited[v] = true;
			dist[v] = 0;

			// �������� ����� ����� �Ÿ� ����
			for(int i=0; i<adj.get(v).size(); i++){
				int x = adj.get(v).get(i);
				if(!visited[x]) //�湮�����ʾҴٸ�
					dist[x] = 1;
			}

			// ��� ���� ���ؼ�
			for(int a=0; a<N-1; a++){
				int min = Integer.MAX_VALUE;
				int minPos = -1;

				// �湮���� ���� ��� �� dist �ּ� �� ã��
				for(int i=1; i<=N; i++){
					if(!visited[i] && dist[i] != Integer.MAX_VALUE){
						if(dist[i] < min){
							min = dist[i];
							minPos = i;
						}
					}
				}

				// �ּ� �Ÿ� ������ �� �湮ó��
				visited[minPos] = true;

				// minPos�� ����Ǿ����鼭 �湮���� ���� �� check
				for(int i=0; i<adj.get(minPos).size(); i++){
					int x = adj.get(minPos).get(i);
					if(!visited[x]){
						if(dist[x] > dist[minPos] + 1)//minPos�� �����������
							dist[x] = dist[minPos] + 1;
					}
				}
			}
			int max = -1;
			int maxPos = -1;
			int maxNum = 1;
			// �ִ� ã��
			for(int i=1; i<=N; i++){
				if(max < dist[i]){
					max = dist[i];
					maxPos = i;
					maxNum = 1;
				}
				else if(max == dist[i])
					maxNum++;
			}

			System.out.println(maxPos + " " + max + " " + maxNum);
		}
	}

