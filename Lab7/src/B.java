
public class B extends A{	
	int b1,b2;
	
	public B(int a1, int a2, int b1, int b2) {
		super(a1,a2);
		this.b1=b1;
		this.b2=b2;
		System.out.println("B1");
	}
	
	/*public void setB(int a1, int a2, int b1, int b2) {
		this.a1=a1;
		this.a2=a2;
		
		setA(a1,a2);
		
		this.b1=b1;
		this.b2=b2;
	}*/
	public void showB() {
		showA();
		System.out.println(b1+", "+b2);
	}

}
