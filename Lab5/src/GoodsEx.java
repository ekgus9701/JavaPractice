
public class GoodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods(); //��ü ����
		camera.name = "Sony";
		camera.price = 500000;
		camera.numberOfStock = 30;
		camera.sold =150;
		
		System.out.println("��ǰ �̸�:"+ camera.name);
		System.out.println("��ǰ ����:"+ camera.price);
		System.out.println("��� ����:"+ camera.numberOfStock);
		System.out.println("�ȸ� ����:"+ camera.sold);

	}

}
