package ����3��_������;
import java.util.Scanner;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eng[]= {"student", "love","java","happy","future"};
		String kor[]= {"�л�","���","�ڹ�","�ູ��","�̷�"};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String s=sc.next();
			if(s.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			else {
				int k=0;
				while(true) {
			
					
						if(s.equals(eng[k])) {
							System.out.println(kor[k]);
							break;
						}
						else if(!s.equals(eng[k])&&k==4) {
							System.out.println("�׷� ���� �ܾ �����ϴ�.");
							break;
						}
						k++;
				}
			}
		}
	}
}

	
