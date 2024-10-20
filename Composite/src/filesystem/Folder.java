package filesystem;

import java.util.ArrayList;
import java.util.List;

//Classe para representar uma pasta
public class Folder implements FileSystemItem {
	private String name;
	private List<FileSystemItem> fileSystemItems;

	public Folder(String name) {
		this.name = name;
		this.fileSystemItems = new ArrayList<>();
	}

	public void addItem(FileSystemItem item) {
		fileSystemItems.add(item);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		
		for (FileSystemItem item: fileSystemItems) {
			totalSize += item.getSize();
		}
		return totalSize;
	}
	
	@Override
	public void listContents() {
		System.out.println("Folder: " + name);

		for (FileSystemItem item: fileSystemItems) {
			item.listContents();
		}
	}
}
