package mei.designpattern.composite.antivirus;

public class Client {
    public static void main(String[] args) {
        Folder downloads = new Folder("downloads");
        Folder documents = new Folder("documents");

        ImageFile image = new ImageFile("random.jpg");
        TextFile text = new TextFile("random.txt");
        VideoFile video = new VideoFile("random.avi");

        downloads.add(image);
        downloads.add(documents);

        documents.add(image);
        documents.add(text);
        documents.add(video);

        downloads.killVirus();
    }
}
/* execution result
Kill virus for folder downloads
Kill virus for image file random.jpg
Kill virus for folder documents
Kill virus for image file random.jpg
Kill virus for text file random.txt
Kill virus for video file random.avi
 */
