import java.io.*;
public class num3 {
	public static void main(String[] args) {
		File c=new File("c:\\");
		File[] files=c.listFiles();
		long max=0;
		String path=null;
		for(int i=0;i<files.length;i++) {
			File f=files[i];
			if(f.isFile()) {
				if(max<f.length()) {
					max=f.length();
					path=f.getPath();
				}
			}
		}
		System.out.println("가장 큰 파일은 "+path+" "+max+"바이트");
	
	}
}