package edoc_동적계획법;
import java.util.Scanner;

public class RGB거리_1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int [][] list = new int[n][3];
		int [][] rgb= new int [n][3];
		int sum=0;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				list[i][j]=sc.nextInt();
			}
		}
		
		rgb[0][0]=list[0][0];
		rgb[0][1]=list[0][1];
		rgb[0][2]=list[0][2];
		
		for(int i=1;i<n;i++) {
			rgb[i][0]=Math.min(rgb[i-1][1], rgb[i-1][2])+list[i][0];//같은 색이 아닌 것중에 작은 걸 골라서 더하기
			rgb[i][1]=Math.min(rgb[i-1][0], rgb[i-1][2])+list[i][0];//같은 색이 아닌 것중에 작은 걸 골라서 더하기
			rgb[i][2]=Math.min(rgb[i-1][1], rgb[i-1][1])+list[i][0];//같은 색이 아닌 것중에 작은 걸 골라서 더하기
		}
		
		System.out.println(Math.min(Math.min(rgb[n - 1][0], rgb[n - 1][1]), rgb[n - 1][2]));//가장 작은 값 찾기

	}

}
