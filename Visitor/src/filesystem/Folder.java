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
}
