package document;

public class Client {

	public static void main(String[] args) {
		Documento pdf = new PDFDocumento();
		Documento word = new WordDocumento();
		
		AdaptadorDocumentoEmail pdfEnviarPorEmail = new AdaptadorDocumentoEmail(pdf);
		AdaptadorDocumentoEmail wordEnviarPorEmail = new AdaptadorDocumentoEmail(word);
		
		pdfEnviarPorEmail.enviarEmail();
		wordEnviarPorEmail.enviarEmail();
	}
}

//Interface Documento
interface Documento {
	void abrir();
}

//Classe que representa um documento PDF
class PDFDocumento implements Documento {
	@Override
	public void abrir() {
		System.out.println("Abrindo documento PDF...");
	}
}

//Classe que representa um documento Word
class WordDocumento implements Documento {
	@Override
	public void abrir() {
		System.out.println("Abrindo documento Word...");
	}
}