package chap4;


class Car{
	
	String color;
	static int num=0;
	static int rednum=0;
	
	
	public Car(String color) {
		this.color=color;
		num+=1;
		if(color.equals("red")||color.equals("RED")){
			rednum+=1;
		}
		
	}
	public static int getNumOfCar() {
		return num;
	}

	public static int getNumOfRedCar(){
		return rednum;
		
	}
}
public class CarTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("red");
		Car c2=new Car("blue");
		Car c3=new Car("RED");
		System.out.printf("자동차: %d, 빨간 자동차수: %d",Car.getNumOfCar(),Car.getNumOfRedCar());
		
		

	}

}

