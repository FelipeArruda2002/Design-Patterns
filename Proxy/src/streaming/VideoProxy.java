package streaming;

public class VideoProxy extends Video {

	private boolean isLoaded = false;
	
	public VideoProxy(String title, String url) {
		super(title, url);
	}

	@Override
	public void play() {
		if (!isLoaded ) {
			loadVideo();
			isLoaded = true;
		}
		super.play();
	}
	
}
