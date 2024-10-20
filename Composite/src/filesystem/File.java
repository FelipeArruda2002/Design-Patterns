package filesystem;

//Classe para representar um arquivo
public class File implements FileSystemItem {
	private String name;
	private int size; // em bytes

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void listContents() {
		 System.out.println("File: " + getName() + " (" + getSize() + " bytes)");
	}
}
