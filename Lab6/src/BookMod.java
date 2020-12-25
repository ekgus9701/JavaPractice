
public class BookMod {
	String title; //책 제목
	String author; //책 저자
	String ISBN; //ISBN
	
	void show() {
		System.out.println("title:" +title);
		System.out.println("author:" +author);
		System.out.println("ISBN:" +ISBN);
	}
	
	public BookMod() { //생성자
		this("","","");
		System.out.println("생성자 호출됨1");
	
	}
	
	public BookMod (String title) { //생성자
		this(title,"작자미상","2222");
		System.out.println("생성자 호출됨2");
	
	}
	
	public BookMod(String title, String author) { //생성자
		this(title,author,"1111");
		System.out.println("생성자 호출됨1");
	
	}
	
	public BookMod(String title, String author, String ISBN) { //생성자
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	
	}
	
	
}
