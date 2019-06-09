package mei.designpattern.creational.bridge.imageviewer;

public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        impl.doPaint(m);
        System.out.println("Process " + fileName + ".gif");
    }
}
