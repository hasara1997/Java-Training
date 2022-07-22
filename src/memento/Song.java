package memento;

public class Song {
	
	private String songName;
	
	public Song(String songName) {
		this.songName = songName;
	}
	
	public String toString() {
		return"Song [songName =" +songName+ "]";
	}

}
