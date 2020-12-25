package chap4;

public class MethodSample {
	public static int getSum(int i,int j) {
		return i+j;
	}
	public static int getSum(int i, int j, int k) {
		return i+j+k;
	}
	public static void main(String[] args) {
		MethodSample a=new MethodSample();
		System.out.println(a.getSum(1, 2)+" "+a.getSum(1, 2,5));

	}

}
