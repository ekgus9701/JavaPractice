package chap5;
abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
public class GoodCalc extends Calculator {

	public static void main(String[] args) {
		GoodCalc c=new GoodCalc();
		System.out.println(c.add(1, 2));
		System.out.println(c.subtract(3, 2));
		System.out.println(c.average(new int [] {2,3,4}));

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		int avr=sum/a.length;
		return avr ;
	}

}
