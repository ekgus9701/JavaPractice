import java.io.*;
import java.util.*;

public class num4 /*implements Runnable*/{
	FileReader in=null;
	private Thread th;
	public num4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����Ϸ��� 'q'�� ��������.");
		String s=sc.next();
		System.out.println("s");
		if(s =="q") {
			System.out.println("[Ű�Է����� �����]");
			return;
		}
		else {
			try {
				in=new FileReader("test.txt");
				int c;
				
				while((c=in.read())!=-1) {
					
					System.out.print((char)c);
					//
					//th.start();
					
				}
				in.close();
			}
			catch(Exception e) {
				System.out.println("����� ����");
			}
			
	}
	}
	/*@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(100);			
				}	
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num4();
	
	}
	
}