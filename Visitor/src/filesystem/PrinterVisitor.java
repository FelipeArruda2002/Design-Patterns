package filesystem;

public interface PrinterVisitor {

	void visit(Folder folder);
	
	void visit(File file);
	
}
