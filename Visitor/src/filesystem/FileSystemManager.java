package filesystem;

public class FileSystemManager {
    private Folder root;

    public FileSystemManager(String rootName) {
        this.root = new Folder(rootName);
    }

    public Folder getRoot() {
        return root;
    }

    public int calculateTotalSize() {
        return calculateSize(root);
    }

    private int calculateSize(Folder folder) {
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
}