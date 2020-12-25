import java.io.*;
public class num5 {
	public static void main(String[] args) {
		File f=new File("c:\\Temp\\제비");
		File[] subFiles=f.listFiles();
		String fileName=null;
		
		for(int i=0;i<subFiles.length;i++) {
			File a=subFiles[i];
			
			if(a.isFile()) {
				fileName=a.getName();
				String path=a.getPath();
				int idx=fileName.lastIndexOf(".txt");
				
				if(idx!=-1) {
					subFiles[i].delete();
					System.out.println(path+" 삭제");
				}
			}
		}
	}
}