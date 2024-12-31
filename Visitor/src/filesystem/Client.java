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
        int totalSize = calculateSize(root);
        System.out.println("Tamanho total do sistema de arquivos: " + totalSize + " KB");

        // Exibindo a estrutura hierárquica
        System.out.println("\nEstrutura do sistema de arquivos:");
        printStructure(root, 0);
    }

    // Método para calcular o tamanho total da pasta
    private static int calculateSize(Folder folder) {
        int size = 0;
        for (FileSystemElement element : folder.getChildren()) {
            if (element instanceof File) {
                size += ((File) element).getSize();
            } else if (element instanceof Folder) {
                size += calculateSize((Folder) element);
            }
        }
        return size;
    }

    // Método para imprimir a estrutura hierárquica
    private static void printStructure(Folder folder, int level) {
        printIndent(level);
        System.out.println(folder.getName() + "/");
        for (FileSystemElement element : folder.getChildren()) {
            if (element instanceof File) {
                printIndent(level + 1);
                System.out.println(element.getName());
            } else if (element instanceof Folder) {
                printStructure((Folder) element, level + 1);
            }
        }
    }

    // Método auxiliar para indentação
    private static void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
    }
}
