package mei.designpattern.creational.composite.antivirus;

public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractFile getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void killVirus() {
        System.out.println("Kill virus for image file " + name);
    }
}
