package filesystem;

public interface CalculatorVisitor {
	
	void visit(Folder folder);
	void visit(File file);

}
