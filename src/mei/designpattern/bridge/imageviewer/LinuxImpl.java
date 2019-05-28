package mei.designpattern.bridge.imageviewer;

public class LinuxImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Show image under Linux");
    }
}
