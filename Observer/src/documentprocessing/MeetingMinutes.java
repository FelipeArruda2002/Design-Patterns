package documentprocessing;

public class MeetingMinutes extends Document {

	public MeetingMinutes(String title, String status) {
		super(title, status);
	}

	@Override
	public void process() {
		System.out.println("Processing meeting minutes: " + getTitle());
		// Simulação de processamento
		setStatus("Approved");
	}
}
