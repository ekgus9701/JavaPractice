import java.util.*;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4) >>");
			int d=sc.nextInt();
			if(d==4) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			int c=(int)(Math.random()*3+1);
			switch(d) {
			case 1:
				if(c==1) {
					System.out.println("����� ���� : ��ǻ�� ����");
					System.out.println("�����ϴ�.");
				}
				else if(c==2) {
					System.out.println("����� ���� : ��ǻ�� ����");
					System.out.println("����ڰ� �����ϴ�.");
				}
				else if(c==3) {
					System.out.println("����� ���� : ��ǻ�� ��");
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				break;
			case 2:
				if(c==1) {
					System.out.println("����� ���� : ��ǻ�� ����");
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				else if(c==2) {
					System.out.println("����� ���� : ��ǻ�� ����");
					System.out.println("�����ϴ�.");
				}
				else if(c==3) {
					System.out.println("����� ���� : ��ǻ�� ��");
					System.out.println("����ڰ� �����ϴ�.");
				}
				break;
			case 3:
				if(c==1) {
					System.out.println("����� �� : ��ǻ�� ����");
					System.out.println("����ڰ� �����ϴ�.");
				}
				else if(c==2) {
					System.out.println("����� �� : ��ǻ�� ����");
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				else if(c==3) {
					System.out.println("����� �� : ��ǻ�� ��");
					System.out.println("�����ϴ�.");
				}
				break;
				
			}
		}
	}

}
