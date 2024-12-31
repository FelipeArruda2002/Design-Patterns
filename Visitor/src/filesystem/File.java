package filesystem;

public class File extends FileSystemElement {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

	@Override
	void accept(CalculatorVisitor visitorFileSystem) {
		visitorFileSystem.visit(this);
	}

	@Override
	void accept(PrinterVisitor printerVisitor) {
		printerVisitor.visit(this);
	}
}