
public class ForEach {
	enum Week{��,ȭ,��,��,��,��,��}
	public static void main(String[] args) {
		int n[]= {1,2,3,4,5};
		int sum=0;
		
		String names[]= {"����","ü��","�ٳ���","����"};
		
		//for-each�� k�� n[0],n[1],...,n[4]�� �ݺ�
		for(int k:n) {
			System.out.print(k+""); //�ݺ��Ǵ� k�� ���
			sum+=k;
		}
		System.out.println("����"+sum);
		
		//for=each�� s�� names[0],names[1],...,names[5]�ݺ�
		for(String s:names) {
			System.out.print(s+" ");
		
		}
		System.out.println();
		 //for-each�� day�� ��,ȭ,��,��,��,��,�� �� �ݺ�
		for (Week day: Week.values())
			System.out.print(day+"����");
			System.out.println();
	}

}
