
import java.util.*;
public class Phone {
	//1971055 �Ѵ���

	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("* ��ȭ��ȣ ���� ���α׷� *");
		System.out.println("----------------------------------");
		
		//��� �̸��� Person��ü�� ������ �����ϴ� HashMap�÷��� ����
		HashMap<String,Person> map = new HashMap<String,Person>();
		
		Scanner sc = new Scanner(System.in); 

		
		while(true) {
			System.out.print("����:0, ����:1, ã��:2, ��ü����:3, ����:4 >>");
			int i=sc.nextInt();//���� �Է¹��� �� i�� ����
			
			if(i==4)
				break;//4�� ������ ����
			
			else if(i==0) {//0�� ������
				
				Scanner sc0 = new Scanner(System.in);
				System.out.print("�̸�>>");
				String name=sc0.next(); //�̸�����
				if(map.containsKey(name)) { //�̸��� �̹� �Էµƴٸ�
					System.out.println("�̹� �����ϴ� ����Դϴ�.");
					continue; //�޴�����ȭ������ ���ư���
					}
				System.out.print("�ּ�>>");
				String addr=sc0.next();//�ּҴ���
				System.out.print("��ȭ��ȣ>>");
				String tel = sc0.next();//��ȭ��ȣ����
				
				if(!map.containsKey(name)) //�̸��� ó�� �Էµȴٸ�
					map.put(name, new Person(addr,tel)); //�̸��� �ּ� ��ȭ��ȣ ����

			}
			else if(i==1) {//1�� ������
				System.out.print("�̸�>>");
				Scanner sc1 = new Scanner(System.in);
				String name=sc1.next(); //�̸� ����
				if(!map.containsKey(name)) //�̸��� ó�� �Էµȴٸ�
					System.out.println("��ϵ��� ���� ����Դϴ�!");
				else {
					map.remove(name); //�̸��� ���ε� ��簪�� ����
					System.out.println(name+"���� �����Ǿ����ϴ�.");
				}
				
			}
			
			else if(i==2) {//2�� ������
				System.out.print("�̸�>>");
				Scanner sc2 = new Scanner(System.in);
				String name=sc2.next(); //�̸�����
				if(!map.containsKey(name)) //�̸��� ó�� �Էµȴٸ�
					System.out.println("��ϵ��� ���� ����Դϴ�!");
				else { //�̸��� �̹� �Էµƴٸ�
					Person person = map.get(name); //name���� ���б�
					System.out.println(name+" "+person.addr+" "+person.tel);
				}
			}
			
			else if(i==3) {//3�� ������
				//��� ��� ���, map �÷��ǿ� ����ִ� ���(key, value) �� ���
				//key ���ڿ��� ���� ���� Set �÷��� ����
				Set<String> names = map.keySet(); 
				
				//key ���ڿ��� ������� ������ �� �ִ� Iterator ����
				Iterator<String> it = names.iterator();
				while(it.hasNext()) {
					String name = it.next();//���� Ű
					Person person = map.get(name);
					System.out.println(name +" "+person.addr+" "+person.tel);
				}
			}
			else
				System.out.println("�޴��� �߸��Է��ϼ̽��ϴ�! �ٽ� �Է����ּ���.");
			
		}	
	}
}
