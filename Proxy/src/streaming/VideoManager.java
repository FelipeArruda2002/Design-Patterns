package streaming;

import java.util.ArrayList;
import java.util.List;

//Classe que gerencia a lista de vídeos
public class VideoManager {
 private List<Video> videos;

 public VideoManager() {
     this.videos = new ArrayList<>();
 }

 public void addVideo(Video video) {
     videos.add(video);
 }

 public void playAll() {
     for (Video video : videos) {
         video.play();
     }
 }
}
