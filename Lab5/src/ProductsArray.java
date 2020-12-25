import java.util.Scanner;

public class ProductsArray{
	
	public static void main(String[] args) {
		Products [] productsArray; //배열 선언
		productsArray = new Products[3]; //Products 객체 레퍼런스 배열 생성
		
		Scanner s= new Scanner(System.in);
		for(int i=0; i<productsArray.length;i++) {
			String name = s.next();
			int price= s.nextInt();
			int num= s.nextInt();
			int sold= s.nextInt();
			productsArray[i] = new Products(name, price, num, sold); //Products 객체 생성
		}
		
		for(int i=0; i<productsArray.length;i++) {
			System.out.print(productsArray[i].getName()+" "); //상품이름 출력
			System.out.print(productsArray[i].getPrice()+" "); //상품가격 출력
			System.out.print(productsArray[i].getNumberOfStock()+" "); //상품재고 출력
			System.out.println(productsArray[i].getsold()); //팔린 수량 출력

		}
	}
}