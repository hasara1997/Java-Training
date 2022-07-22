package memento;

public class SongApplication {

	public static void main(String[] args) {
		
		PlayListCareTaker playListCareTaker = new PlayListCareTaker();
		
		PlayList playList = new PlayList();
		
		playList.playSong(new Song("song1"));
		playList.playSong(new Song("song2"));
		
		System.out.println(playList);
		System.out.println(playListCareTaker);
		playListCareTaker.save(playList);
		System.out.println(playListCareTaker);
		
		playList.playSong(new Song("song3"));
		playListCareTaker.save(playList);
		System.out.println(playList);
		System.out.println(playListCareTaker);
		
		playList.playSong(new Song("song4"));
		playListCareTaker.save(playList);
		System.out.println(playList);
		System.out.println(playListCareTaker);

	}

}
