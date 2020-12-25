import java.io.*;

public class Demo1 {

	public static void main(String[] args) {
		try{
			FileInputStream fin = new FileInputStream("infile.txt");
			int c;
			while((c=fin.read())!=-1) {
				System.out.println((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입력오류");
		}
	}

}
