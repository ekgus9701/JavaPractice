import java.util.Scanner;
public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		Rect[] r = new Rect[4];
		for(int i=0;i<r.length;i++) {
			System.out.print(i+1);
			System.out.print(" 너비와 높이 >>");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			r[i]=new Rect(width,height);
		}
		System.out.println("저장하였습니다...");
		int sum=0;
		for(int i=0;i<r.length;i++)
			sum+=r[i].getArea();
		
		System.out.println("사각형의 전체 합은"+sum);
		scanner.close();
	}

}
