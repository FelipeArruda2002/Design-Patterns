package filesystem;

import java.util.ArrayList;
import java.util.List;

//Classe para representar uma pasta
public class Folder {
	private String name;
	private List<File> files;
	private List<Folder> subfolders;

	public Folder(String name) {
		this.name = name;
		this.files = new ArrayList<>();
		this.subfolders = new ArrayList<>();
	}

	public void addFile(File file) {
		files.add(file);
	}

	public void addFolder(Folder folder) {
		subfolders.add(folder);
	}

	// Método para calcular o tamanho total da pasta
	public int calculateTotalSize() {
		int totalSize = 0;

		// Adiciona o tamanho dos arquivos na pasta
		for (File file : files) {
			totalSize += file.getSize();
		}

		// Adiciona o tamanho de cada subpasta manualmente
		for (Folder subfolder : subfolders) {
			totalSize += subfolder.calculateTotalSize();
		}

		return totalSize;
	}

	public void listContents() {
		System.out.println("Contents of folder: " + name);
		for (File file : files) {
			System.out.println("File: " + file.getName() + " (" + file.getSize() + " bytes)");
		}
		for (Folder subfolder : subfolders) {
			System.out.println("Subfolder: " + subfolder.name);
		}
	}

}
