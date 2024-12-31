package filesystem;

public abstract class FileSystemElement {
    private String name;

    public FileSystemElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    abstract void accept(CalculatorVisitor visitorFileSystem);
    abstract void accept(PrinterVisitor printerVisitor);
}





