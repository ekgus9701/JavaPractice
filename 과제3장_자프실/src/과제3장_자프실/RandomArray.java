package 과제3장_자프실;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray = new int[3][4];
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				intArray[i][j]=(int)(Math.random()*10);	
			}
		}
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[0].length;j++) {
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println();
		}
		
		int i=0,sum=0;
		while(i<3) {
			for(int j=0;j<4;j++) {
				sum+=intArray[i][j];
			}
			i++;
		}
		System.out.println("합은 "+sum);
		

	}

}
