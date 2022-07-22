package memento;

import java.util.ArrayList;

//originator class
public class PlayList {

	ArrayList<Song> songList = new ArrayList<>();
	
	public void playSong(Song song) {
		songList.add(song);
	}
	
	//return a clone from list
	public ArrayList<Song> getSongList(){
		return (ArrayList) songList.clone();
	}
	
	public PlayListMemento save() {
		return new PlayListMemento(getSongList());
	}
	
	public void revert(PlayListMemento playListMemento) {
		songList = playListMemento.getSongList();
	}
	
	public String toString() {
		return "PlayList [songList=" + songList +"]";
	}
}
