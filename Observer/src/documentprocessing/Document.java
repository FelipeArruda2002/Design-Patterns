package documentprocessing;

public abstract class Document extends Publisher {

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

		notifySubscribers(this);
	}

	public abstract void process();

}
