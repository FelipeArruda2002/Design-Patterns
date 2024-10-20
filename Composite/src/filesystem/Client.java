package filesystem;

public class Client {
	
	public static void main(String[] args) {
		// Criando arquivos
		File file1 = new File("file1.txt", 500);
		File file2 = new File("file2.txt", 300);
		File img1 = new File("img1.png", 150);
		File img2 = new File("img2.jpeg", 150);

		// Criando subpasta
		Folder subFolder = new Folder("Documents");
		subFolder.addFile(file1);

		Folder images = new Folder("Images");
		images.addFile(img1);
		images.addFile(img2);
		
		// Criando pasta principal
		Folder mainFolder = new Folder("Main");
		mainFolder.addFolder(subFolder);
		mainFolder.addFile(file2);
		mainFolder.addFolder(images);

		// Calculando o tamanho total da pasta principal
		System.out.println("Total size of the main folder: " + mainFolder.calculateTotalSize() + " bytes");

		// Listando o conteúdo da pasta principal
		mainFolder.listContents();
	}
}
