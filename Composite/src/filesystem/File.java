package filesystem;

//Classe para representar um arquivo
public class File {
	private String name;
	private int size; // em bytes

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
}
