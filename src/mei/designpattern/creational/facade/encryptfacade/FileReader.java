package mei.designpattern.creational.facade.encryptfacade;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("Read String from file");
        String s = null;
        try {
            // get URL dynamically
            URL url = getClass().getResource(fileNameSrc);
            FileInputStream fs = new FileInputStream(url.getPath());
            s = new String(fs.readAllBytes());
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
