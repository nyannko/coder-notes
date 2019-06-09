package mei.designpattern.creational.composite.antivirus;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    // folder name
    private String name;
    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("Kill virus for folder " + name);
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
