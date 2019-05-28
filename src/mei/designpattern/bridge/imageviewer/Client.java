package mei.designpattern.bridge.imageviewer;

public class Client {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImpl imageImpl = new LinuxImpl();
        image.setImageImpl(imageImpl);
        image.parseFile("randomImage");
    }
}
/* execution result
Show image under Linux
Process randomImage.jpg
 */
