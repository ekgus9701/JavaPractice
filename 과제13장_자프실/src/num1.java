import java.io.*;
public class num1 {
	public static void main(String[] args) {
		FileReader in=null;
		try {
			in =new FileReader("c:\\Temp\\sample.txt");
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.print("입출력 오류");
		}
	}
}
