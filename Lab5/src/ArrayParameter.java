
public class ArrayParameter {
	//�޼ҵ�
	static void replaceSpace(char a[]) {
		for(int i=0;i<a.length;i++)
			if(a[i]==' ')
				a[i]=','; //���鹮�ڸ� ','�� ����
	}
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]); //�迭���� ���� ���
		System.out.println(); //�迭 ���� ��� ��� �� �ٹٲ�
	}
}
