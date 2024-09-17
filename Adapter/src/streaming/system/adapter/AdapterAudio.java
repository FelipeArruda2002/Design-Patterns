package streaming.system.adapter;

import streaming.system.MediaPlayer;
import streaming.system.adaptee.AdvancedAudioPlayer;

public class AdapterAudio implements MediaPlayer {

	private AdvancedAudioPlayer advancedAudioPlayer;

	public AdapterAudio(AdvancedAudioPlayer advancedAudioPlayer) {
		this.advancedAudioPlayer = advancedAudioPlayer;
	}

	@Override
	public void play(String fileName, String mediaType) {
		if ("VLC".equalsIgnoreCase(mediaType)) {
			this.advancedAudioPlayer.playVlc(fileName);
		} else if ("MP3".equalsIgnoreCase(mediaType)) {
			this.advancedAudioPlayer.playMp3(fileName);
		}
	}

}
