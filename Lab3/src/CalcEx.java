
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0;
		
		for(int i=0;i<args.length;i++) //���ڰ�����ŭ �ݺ�
			sum+=Double.parseDouble(args[i]); //���ڿ��� �Ǽ�(double Ÿ��)��ȯ
			System.out.println("�հ� : "+sum);
	}

}
