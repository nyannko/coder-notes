package mei.designpattern.bridge.imageviewer;

public class WindowsImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Show image under Windows");
    }
}