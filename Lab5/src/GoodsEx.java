
public class GoodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods(); //객체 생성
		camera.name = "Sony";
		camera.price = 500000;
		camera.numberOfStock = 30;
		camera.sold =150;
		
		System.out.println("상품 이름:"+ camera.name);
		System.out.println("상품 가격:"+ camera.price);
		System.out.println("재고 수량:"+ camera.numberOfStock);
		System.out.println("팔린 수량:"+ camera.sold);

	}

}
