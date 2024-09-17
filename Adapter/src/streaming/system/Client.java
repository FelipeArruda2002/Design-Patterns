package streaming.system;

import streaming.system.adapter.MediaAdapter;

public class Client {

	public static void main(String[] args) {
		
		MediaPlayer mediaPlayer = new MediaAdapter();
		mediaPlayer.play("CR7 SKILLS", "MP4");
		mediaPlayer.play("Franguinho na panela", "VLC");
		mediaPlayer.play("Neymar Santos 2011", "AVI");
		mediaPlayer.play("Thiaguinho", "MP3");
				
	}

}
