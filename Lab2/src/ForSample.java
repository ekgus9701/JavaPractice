
public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//1~10���� �ݺ�
		for(int i=1;i<=10;i++) {
			sum+=i;
			//���ϴ� �� ���
			System.out.print(i);
			if(i<=9)//1~9������ '+'���
				System.out.print("+");
			else {//i��10�ΰ��
				System.out.print("=");//'='����ϰ�
				System.out.print(sum);//������� ���
			}
		}
		
	}

}
