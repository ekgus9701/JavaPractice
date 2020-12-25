
public class Products {
	//필드
	private String name; //상품 이름
	private int price; //상품가격
	private int numberOfStock; //상품 재고
	private int sold; //팔린 수량
	
	//생성자
	Products(String name, int price, int numberOfStock, int sold){
		this.name = name;
		this.price=price;
		this.numberOfStock=numberOfStock;
		this.sold= sold;
		
	}
	//메소드
	String getName() { //상품이름리턴
		return name;
	}
	int getPrice() { //상품가격 리턴
		return price;
		
	}
	int getNumberOfStock(){ //상품재고리턴
		return numberOfStock;
		
	}
	int getsold(){//팔린 수량리턴
		return sold;
		
	}
}
