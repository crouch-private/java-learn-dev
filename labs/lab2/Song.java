public class Song {
	
	private String artist, title;
	private int duration;
	public static String collectionName;
	
	public Song(String artistName, String titleName, int durationSec) {
		
		this.setArtist(artistName);
		this.setTitle(titleName);
		this.setDuration(durationSec);
		
	}
	
	public void setArtist(String artistName) {
		artist = artistName;
	}
	
	public void setTitle(String titleName) {
		title = titleName;
	}
	
	public void setDuration(int durationSec) {
		duration = durationSec;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getDuration() {
		return duration;
	}
	
}
