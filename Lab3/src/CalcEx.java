
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0;
		
		for(int i=0;i<args.length;i++) //인자개수만큼 반복
			sum+=Double.parseDouble(args[i]); //문자열을 실수(double 타입)변환
			System.out.println("합계 : "+sum);
	}

}
