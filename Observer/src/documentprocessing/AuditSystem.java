package documentprocessing;

public class AuditSystem implements Subscriber {

	@Override
	public void update(Document document) {
		if ("Signed".equals(document.getStatus())) {
			System.out.println("Audit: O documento '" + document.getTitle() + "' foi assinado.");
		}
	}

}
