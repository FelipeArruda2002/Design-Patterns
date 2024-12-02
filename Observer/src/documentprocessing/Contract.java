package documentprocessing;

//Contract.java
public class Contract extends Document {
	public Contract(String title, String status) {
		super(title, status);
	}

	@Override
	public void process() {
		System.out.println("Processing contract: " + getTitle());
		// Simulação de processamento
		setStatus("Signed");
	}
}
