package 과제3장_자프실;

import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= new int[10];
		System.out.print("정수 10개 입력>>");
		Scanner sc =new Scanner(System.in);
		for(int k=0;k<10;k++) {
			num[k]=sc.nextInt();
		}
		for(int i = 0; i < 9; i++){
            for(int j = i+1; j < 10; j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        
        for(int l = 0; l < 10; l++)
            System.out.print(num[l] + " ");
    }
}
 
