
public class ScoreAverage {

	public static void main(String[] args) {
		
		double score[][]= {{3.5,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		double sum=0.0;
		
		for(int year=0;year<score.length;year++)
			for(int term=0;term<score[year].length;term++)
				sum+=score[year][term]; //전체 평점합
		int n=score.length; //배열의 행 개수:4
		int m=score[0].length; //배열의 열 개수:2
		System.out.printf("4년 전체 평점 평균 :%.2f",sum/(n*m));

	}

}
