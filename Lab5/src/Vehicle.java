
public class Vehicle {
	//�ʵ�
	public int passengers; //�°���
	public int fuelcap; //����ķ
	public int mpg; //����
	
	//Vehicle Ŭ������ ������
	public Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg= m;
	}
	
	//�޼ҵ�
	public int range() { //�־��� ���Ḧ ������ �� �ִ� �Ÿ�
		return mpg*fuelcap; //����*����ĸ�� ���� ���� ��ȯ
	}
	
	public double fuelneeded(int miles) { //�־��� �Ÿ��� �����ϱ����� ���ᷮ
		return (double) miles/mpg; //���� ����(�Ÿ�)�� ������ ���� ��ȯ
	}
}
