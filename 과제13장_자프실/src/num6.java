import java.io.*;
import java.util.Vector;
import java.util.Scanner;
public class num6 {
	public static void main(String[] args) {
		
		Vector<String> words=new Vector<String>();
		Scanner input=new Scanner(System.in);
		
		File f=new File("C:\\Temp\\words.txt");
		
		while(true) {
			System.out.print("�ܾ�>>");
			String str=null;
			str=input.next();
			int cnt=0;
			if(str.equals("exit")) {
				System.out.println("�����մϴ�...");
				System.exit(0);
			}
			try {
				Scanner fileScanner=new Scanner(new FileReader(f));
				while(fileScanner.hasNext()) {
					String line=fileScanner.nextLine();
					if(line.startsWith(str)){
						cnt++;
						System.out.println(line);
					}
				}
				if(cnt==0) {
					System.out.println("�߰��� �� ����");
				}
			}catch(IOException e) {
				System.out.println("����� ����");
			}
		}
	}
}