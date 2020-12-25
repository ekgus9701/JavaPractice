
public class BookModEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookMod littlePrince = new BookMod("어린왕자","생텍쥐페리","1234");
		littlePrince.show();
		
		BookMod JavaBook = new BookMod("JAVA","KJH");
		JavaBook.show();
		
		BookMod loveStory = new BookMod("춘향전");
		loveStory.show();
		
		BookMod emptyBook = new BookMod();
		emptyBook.show();

	}

}
