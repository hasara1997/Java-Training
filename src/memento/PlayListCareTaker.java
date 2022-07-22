package memento;

import java.util.Stack;

public class PlayListCareTaker {
	
	Stack<PlayListMemento> playListHistory = new Stack<>();
	
	public void save(PlayList playList) {
		playListHistory.push(playList.save());
	}
	
	public void revert(PlayList playList) {
		
		if(!playListHistory.isEmpty())
			playList.revert(playListHistory.pop());
		else
			System.out.println("Cannot Undo. No any play list in history");
	}
	
	public String toString() {
		return "PlayListCareTaker [playListHistory =" + playListHistory + "]";
	}

}
