
public class Products {
	//�ʵ�
	private String name; //��ǰ �̸�
	private int price; //��ǰ����
	private int numberOfStock; //��ǰ ���
	private int sold; //�ȸ� ����
	
	//������
	Products(String name, int price, int numberOfStock, int sold){
		this.name = name;
		this.price=price;
		this.numberOfStock=numberOfStock;
		this.sold= sold;
		
	}
	//�޼ҵ�
	String getName() { //��ǰ�̸�����
		return name;
	}
	int getPrice() { //��ǰ���� ����
		return price;
		
	}
	int getNumberOfStock(){ //��ǰ�����
		return numberOfStock;
		
	}
	int getsold(){//�ȸ� ��������
		return sold;
		
	}
}
