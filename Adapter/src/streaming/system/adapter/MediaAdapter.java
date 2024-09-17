package streaming.system.adapter;

import streaming.system.MediaPlayer;
import streaming.system.adaptee.AdvancedAudioPlayer;
import streaming.system.adaptee.VideoPlayer;

public class MediaAdapter implements MediaPlayer {
	
	private MediaPlayer mediaAdapter;

	@Override
	public void play(String fileName, String mediaType) {
		if ("VLC".equalsIgnoreCase(mediaType) || "MP3".equalsIgnoreCase(mediaType)) {
			mediaAdapter = new AdapterAudio(new AdvancedAudioPlayer());
		} else if ("MP4".equalsIgnoreCase(mediaType) || "AVI".equalsIgnoreCase(mediaType)) {
			mediaAdapter = new AdapterVideo(new VideoPlayer());
		}
		mediaAdapter.play(fileName, mediaType);
	}

}
