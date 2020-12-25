import java.util.*;
public class No3 {

	public static void main(String[] args) {
		int d[]= new int[3];
		while(true) {
			for(int i=0;i<3;i++) {
				d[i]=(int)(Math.random()*3+1);
				System.out.print(d[i]+"   ");
			}
			System.out.println();
			if(d[0]==d[1]&&d[0]==d[2]) {
				System.out.println("¼º°ø");
				break;
			}
		}

	}

}
