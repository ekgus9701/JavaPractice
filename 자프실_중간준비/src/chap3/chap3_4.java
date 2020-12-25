package chap3;

public class chap3_4 {

	public static void main(String[] args) {
		double score[][]= {{3.3,3.4},
						{3.5,3.6},{3.7,3.3},{3.1,4.2}
				};
		double sum=0;
		for(int year=0;year<score.length;year++) {
			for(int j=0;j<score[year].length;j++) {
				sum+=score[year][j];
			}
			
		}
		int n=score[0].length;
		System.out.println(sum/(score.length*n));

	}

}
