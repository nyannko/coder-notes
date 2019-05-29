package mei.designpattern.composite.antivirus;

public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
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
        System.out.println("Kill virus for text file " + name);
    }
}
