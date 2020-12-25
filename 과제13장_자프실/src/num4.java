import java.io.*;
import java.util.Scanner;
public class num4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("텍스트 파일 이름을 입력하세요>>");
		String path=input.nextLine();
		int line=1;
		try {
			Scanner fileScanner=new Scanner(new FileReader(path));
			while(fileScanner.hasNext()) {
				System.out.println(line+": "+fileScanner.nextLine());
				line++;
			}
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
	}
}