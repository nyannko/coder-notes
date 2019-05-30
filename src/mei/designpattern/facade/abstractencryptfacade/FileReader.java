package mei.designpattern.facade.abstractencryptfacade;

import java.io.FileInputStream;

public class FileReader {
    public String read(String fileNameSrc) {
        String s = null;
        try {
            String url = getClass().getResource(fileNameSrc).getPath();
            FileInputStream fs = new FileInputStream(url);
            s = new String(fs.readAllBytes());
            fs.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
