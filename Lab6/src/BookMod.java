
public class BookMod {
	String title; //å ����
	String author; //å ����
	String ISBN; //ISBN
	
	void show() {
		System.out.println("title:" +title);
		System.out.println("author:" +author);
		System.out.println("ISBN:" +ISBN);
	}
	
	public BookMod() { //������
		this("","","");
		System.out.println("������ ȣ���1");
	
	}
	
	public BookMod (String title) { //������
		this(title,"���ڹ̻�","2222");
		System.out.println("������ ȣ���2");
	
	}
	
	public BookMod(String title, String author) { //������
		this(title,author,"1111");
		System.out.println("������ ȣ���1");
	
	}
	
	public BookMod(String title, String author, String ISBN) { //������
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	
	}
	
	
}
