package memento;

import java.util.ArrayList;

public class PlayListMemento {
	
	ArrayList<Song> songList;
	
	public PlayListMemento(ArrayList<Song> songList) {
		this.songList = new songList;
	}

	public ArrayList<Song> getSongList() {
		
		return songList;
	}
	
	public String toString() {
		return"PlayListMemento [songList=" +songList+ "]";
	}

}
