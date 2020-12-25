package 과제4장_자프실;
import java.util.Scanner;
class Player{
	private String name;
	public Player(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class GamblingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Player[] p = new Player[2];
		for(int i=0;i<2;i++) {
			System.out.print("선수 이름 입력 >>");
			p[i]=new Player(scanner.next());
		}
		int n=0;
		while(true) {
			System.out.print(p[n].getName()+"씨, <Enter 외 아무거나 치세요>");
			scanner.next();
			int [] val = new int[3];
			for(int i=0;i<val.length;i++) {
				val[i]=(int)(Math.random()*3);
				System.out.print(val[i]+"\t");
			}
			System.out.println();
			if(val[0]==val[1]&&val[1]==val[2]) {
				System.out.println(p[n].getName()+"이 승리하셨습니다.");
				break;
			}
			n++;
			n=n%2;
		}
		scanner.close();

	}

}
