import java.io.*;
public class Demo6 {

	public static void main(String[] args) {
		String s;
		try {
			BufferedReader rd = new BufferedReader(new FileReader("c:\\Temp\\outfile2.txt"));
			while((s=rd.readLine())!=null)
				System.out.println(s);
			rd.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
