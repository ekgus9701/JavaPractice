import java.io.*;
public class Demo4 {

	public static void main(String[] args) {
		try {
			//���Ϸκ��� �����Է½�Ʈ�� ����
			FileReader in = new FileReader("c:\\Temp\\test.txt");
			int c;
			while((c=in.read())!=-1) { //�ѹ��ھ� �д´�.
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
