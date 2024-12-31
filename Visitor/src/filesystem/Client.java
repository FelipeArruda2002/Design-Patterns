package filesystem;

public class Client {
    public static void main(String[] args) {
        // Criando a estrutura do sistema de arquivos
        Folder root = new Folder("Root");
        Folder documents = new Folder("Documents");
        Folder pictures = new Folder("Pictures");
        File resume = new File("Resume.pdf", 120);
        File photo1 = new File("Photo1.jpg", 500);
        File photo2 = new File("Photo2.jpg", 700);
        File notes = new File("Notes.txt", 50);

        // Construindo a hierarquia
        documents.addElement(resume);
        documents.addElement(notes);
        pictures.addElement(photo1);
        pictures.addElement(photo2);
        root.addElement(documents);
        root.addElement(pictures);

        // Calculando o tamanho total do sistema de arquivos
        SizeCalculatorVisitor calculatorVisitor = new SizeCalculatorVisitor();
        root.accept(calculatorVisitor);
        System.out.println("Tamanho total do sistema de arquivos: " + calculatorVisitor.getSize() + " KB");

        // Exibindo a estrutura hierárquica
        System.out.println("\nEstrutura do sistema de arquivos:");
        StructurePrinterVisitor structurePrinterVisitor = new StructurePrinterVisitor();
        root.accept(structurePrinterVisitor);
    }

}
