package streaming;

//Classe principal para testar o sistema
public class Client {
	
	public static void main(String[] args) {
		VideoManager manager = new VideoManager();

		manager.addVideo(new Video("Tutorial Java", "http://video-url.com/java"));
		manager.addVideo(new Video("Design Patterns", "http://video-url.com/design-patterns"));

		// A lista de vídeos é carregada, e todos os vídeos são reproduzidos
		manager.playAll();
	}
}
