package streaming;

//Classe Video que simula o carregamento de um vídeo de um servidor remoto
public class Video {

	private String title;
	private String url;

	public Video(String title, String url) {
		this.title = title;
		this.url = url;
		loadVideo();
	}

	private void loadVideo() {
		System.out.println("Loading video from URL: " + url);
		// Simulação de uma operação custosa de carregamento
		try {
			Thread.sleep(3000); // Simula o tempo de carregamento
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void play() {
		System.out.println("Playing video: " + title);
	}

	public String getTitle() {
		return title;
	}
}