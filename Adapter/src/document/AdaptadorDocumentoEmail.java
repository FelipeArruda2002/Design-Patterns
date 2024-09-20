package document;

public class AdaptadorDocumentoEmail implements EnvioEmail {

	private Documento documento;

	public AdaptadorDocumentoEmail(Documento documento) {
		this.documento = documento;
	}

	@Override
	public void enviarEmail() {
		documento.abrir();
		System.out.println("Enviando documento...");
	}

}
