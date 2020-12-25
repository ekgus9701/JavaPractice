package edoc_±×¸®µð;
import java.util.Arrays;
import java.util.Scanner;

public class ATM_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int Pnum = sc.nextInt();
	      
	      int[] time = new int[Pnum];
	      
	      for(int i =0; i<Pnum; i++) {
	          time[i] = sc.nextInt();
	      }
	
	      int min = 0;
	      
	      Arrays.sort(time);
	      int sum = 0;
	      for(int i =0; i<time.length; i++){
	         min+=time[i];
	         sum+=min;
	      }
	      System.out.println(sum);
	   
	
	}

}
