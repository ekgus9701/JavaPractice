import java.io.*;
public class Demo4 {

	public static void main(String[] args) {
		try {
			//파일로부터 문자입력스트림 생성
			FileReader in = new FileReader("c:\\Temp\\test.txt");
			int c;
			while((c=in.read())!=-1) { //한문자씩 읽는다.
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
