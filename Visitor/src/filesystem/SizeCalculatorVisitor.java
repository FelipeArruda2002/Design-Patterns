package filesystem;

public class SizeCalculatorVisitor implements CalculatorVisitor {

	private int size = 0;
	
	@Override
	public void visit(Folder folder) {
		for (FileSystemElement child : folder.getChildren()) {
			child.accept(this);
		}
	}

	@Override
	public void visit(File file) {
		size += file.getSize();
	}

	public int getSize() {
		return size;
	}
	
}
