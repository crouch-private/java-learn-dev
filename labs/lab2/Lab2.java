public class Lab2 {
	
	public static void main(String args[]) {
		
		Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
		Song one = new Song("Daft Punk", "One More Time", 322);
		
		sed.collectionName = "Randy's Collection";
		System.out.println("Collection: " + one.collectionName);
		printSong(sed);
		printSong(one);
		
	}
	
	public static void printSong(Song song) {
		int min = song.getDuration() / 60;
		int sec = song.getDuration() % 60;
		System.out.printf("%s (%s) - %d:%d\n",
						song.getTitle(), song.getArtist(), min, sec);
	}
	
}
