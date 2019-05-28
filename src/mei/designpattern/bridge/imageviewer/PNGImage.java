package mei.designpattern.bridge.imageviewer;

public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        impl.doPaint(m);
        System.out.println("Process " + fileName + ".png");
    }
}
