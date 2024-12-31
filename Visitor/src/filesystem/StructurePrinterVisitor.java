package filesystem;

public class StructurePrinterVisitor implements PrinterVisitor {

	@Override
	public void visit(Folder folder) {
		System.out.println(String.format("  %s/", folder.getName()));
		for (FileSystemElement child: folder.getChildren()) {
			child.accept(this);
		}
	}

	@Override
	public void visit(File file) {
		 System.out.println(String.format("   %s", file.getName()));
		
	}

}
