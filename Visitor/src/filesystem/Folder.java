package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemElement {
    private List<FileSystemElement> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addElement(FileSystemElement element) {
        children.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return children;
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
