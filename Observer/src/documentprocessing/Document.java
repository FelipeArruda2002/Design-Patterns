package documentprocessing;

public abstract class Document {
	
 private String title;
 private String status;

 public Document(String title, String status) {
     this.title = title;
     this.status = status;
 }

 public String getTitle() {
     return title;
 }

 public String getStatus() {
     return status;
 }

 public void setStatus(String status) {
     this.status = status;
     // Lógica de notificação será implementada posteriormente
 }

 public abstract void process();
}

