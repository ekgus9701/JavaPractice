

import java.util.*;
public class Demo {

	//��ǻ�Ͱ������� 1971055 �Ѵ���
	public static void main(String[] args) {
		int check=0; 
		
		System.out.println("��ȣ�� ������ ���ڿ��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		
		StringTokenizer st = new StringTokenizer(s,"{} ()", true); //�ܾ������ ����"{","}","(",")", ��ȣ�� ������������ ��ū���� ���
		
		String ss= ""; //��Ʈ�� ss����
		while(st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			
			if(nextToken.equals("{")) {	//������ū�� "{" �� ���ٸ�
				ss = ss.concat("{");	//"{" �߰��Ѵ�
			}
			if(nextToken.equals("(")) {	//������ū�� "(" �� ���ٸ�
				ss = ss.concat("(");	//"(" �߰��Ѵ�
			}
			
			if(nextToken.equals(")")) {	//������ū�� ")" �� ���ٸ�
				ss = ss.concat(")");	//")" �߰��Ѵ�
			}
			
			if(nextToken.equals("}")) {	//������ū�� "}" �� ���ٸ�
				ss = ss.concat("}");	//"}" �߰��Ѵ�
				
			}
			
			
		}
		System.out.println("��ȣ�� ������ ��Ʈ��:");
		System.out.print(ss); 	//��ȣ�� ������ ��Ʈ�� ���
		System.out.println("\n");
		
		
		StringTokenizer st1 = new StringTokenizer(s,"{} ()", true);		//�ܾ������ ����"{","}","(",")", ��ȣ�� ������������ ��ū���� ���
		ss= ""; 	//��Ʈ�� ss �ʱ�ȭ
		
		while(st1.hasMoreTokens()) {
			
			String nextToken = st1.nextToken();
			
			if(nextToken.equals("(")) {		//������ū�� "(" �� ���ٸ�
				ss = ss.concat("("); 		//"(" �߰�
			}
			
			if(nextToken.equals("{")) {		//������ū�� "{" �� ���ٸ�
				ss = ss.concat("{");		//"{" �߰�
			}
		
			
			if(nextToken.equals(")")) {
				
				if(ss.isEmpty()) { 	//ss�� ����ٸ�
					System.out.println("�� ��Ʈ���� ¦�� ���� �ʽ��ϴ�.");
					check=1; //���⼭ check�� �ΰ����� ���� ���δ�. 1. �� ��Ʈ���� ¦�� �����ʴ´�. 2. "�� ��Ʈ���� ¦�� �����ʽ��ϴ�"��� ������ ��µƴ�.
					break;
				}
				else { 	//ss�� �����ʾҴٸ�
					
					if(ss.substring(ss.length()-1).equals("(")) 	//�ǵڰ�ȣ�� �������̶��
						ss=ss.substring(0,ss.length()-1); 	// ������ȣ����
					else {	//�������� �ƴ϶��
						System.out.println("�� ��Ʈ���� ¦�� ���� �ʽ��ϴ�."); 
						check=1;	//¦�� ���������� check�� 1����
						break;
					}
						
				
				}
			}
			if(nextToken.equals("}")) { //������ū�� "}"�� ���ٸ�
				
				if(ss.isEmpty()) {//ss�� ����ٸ�
					System.out.println("�� ��Ʈ���� ¦�� ���� �ʽ��ϴ�.");
					check=1;
					break;
				}
				
				else {//ss�� �����ʾҴٸ�
					
					if(ss.substring(ss.length()-1).equals("{")) //�ǵڰ�ȣ�� �������̶��
						ss=ss.substring(0,ss.length()-1);  // ������ȣ����
					else {//�������� �ƴ϶��
						System.out.println("�� ��Ʈ���� ¦�� ���� �ʽ��ϴ�.");
						check=1;
						break;
					}
				
				}
			}

		}
		if(ss.isEmpty()&&check!=1)  //���������� ss�� �����  �� ��Ʈ���� ¦�� �´´�.(������ ����� check�� 1�� ���� ���ΰ���)
		 							/* "}"�� ���÷� �Է��غôµ� ss�� ������ ¦�� �����ʾҰ�
		 							 ���� ss.isEmpty()������ �ϸ� ����� ���������ʾ�
			                       	�̷��� ��츦 �ذ��ϱ� ���� check�� ����ߴ�.*/
			System.out.println("�� ��Ʈ���� ¦�� �½��ϴ�!");
		
		
		if(!ss.isEmpty()&&check!=1){//���������� ss�� �����ʾҰ� �̹� "�� ��Ʈ���� ¦�� �����ʽ��ϴ�" ������ �������� ���ٸ�(������ ����� check�� 2�� ���� ���ΰ���)
									/*"{(){())))"�� ���÷� �Է��غôµ�  !ss.isEmpty()�� ����ϸ� "�� ��Ʈ���� ¦�̸����ʽ��ϴ�"��� ������ 2�������� �ȴ�.
									  �׷��� �ߺ������� ���ϱ����� check�� ����ߴ�. */
			System.out.println("�� ��Ʈ���� ¦�� ���� �ʽ��ϴ�.");
		}
		
		System.out.println("�պκ� ���� ��ȣ�� [ "+ss+" ] �Դϴ�.");
		
	}
	
}

		
		


