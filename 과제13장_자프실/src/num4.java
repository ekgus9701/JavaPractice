import java.io.*;
import java.util.Scanner;
public class num4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�ؽ�Ʈ ���� �̸��� �Է��ϼ���>>");
		String path=input.nextLine();
		int line=1;
		try {
			Scanner fileScanner=new Scanner(new FileReader(path));
			while(fileScanner.hasNext()) {
				System.out.println(line+": "+fileScanner.nextLine());
				line++;
			}
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		
	}
}