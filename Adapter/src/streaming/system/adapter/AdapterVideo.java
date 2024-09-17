package streaming.system.adapter;

import streaming.system.MediaPlayer;
import streaming.system.adaptee.VideoPlayer;

public class AdapterVideo implements MediaPlayer {
	
	private VideoPlayer videoPlayer;

	public AdapterVideo(VideoPlayer videoPlayer) {
		this.videoPlayer = videoPlayer;
	}

	@Override
	public void play(String fileName, String mediaType) {
		if ("MP4".equalsIgnoreCase(mediaType)) {
			this.videoPlayer.playMp4(fileName);
		} else if ("AVI".equalsIgnoreCase(mediaType)) {
			this.videoPlayer.playAvi(fileName);
		}
	}

}
