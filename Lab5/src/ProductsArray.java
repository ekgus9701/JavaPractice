import java.util.Scanner;

public class ProductsArray{
	
	public static void main(String[] args) {
		Products [] productsArray; //�迭 ����
		productsArray = new Products[3]; //Products ��ü ���۷��� �迭 ����
		
		Scanner s= new Scanner(System.in);
		for(int i=0; i<productsArray.length;i++) {
			String name = s.next();
			int price= s.nextInt();
			int num= s.nextInt();
			int sold= s.nextInt();
			productsArray[i] = new Products(name, price, num, sold); //Products ��ü ����
		}
		
		for(int i=0; i<productsArray.length;i++) {
			System.out.print(productsArray[i].getName()+" "); //��ǰ�̸� ���
			System.out.print(productsArray[i].getPrice()+" "); //��ǰ���� ���
			System.out.print(productsArray[i].getNumberOfStock()+" "); //��ǰ��� ���
			System.out.println(productsArray[i].getsold()); //�ȸ� ���� ���

		}
	}
}