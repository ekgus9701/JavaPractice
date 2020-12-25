package chap4;

public class Song {
	String title;

	public Song (String title){
		this.title=title;
		
		
	}
	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		Song mySong = new Song("a");
		Song yourSong = new Song("b");
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("너 노래는 "+yourSong.getTitle());
		

	}

}
