package mei.designpattern.facade.abstractencryptfacade;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String cipherText, String fileNameDes) {
        String url =
                System.getProperty("user.dir") + "/src/mei/designpattern/facade/abstractencryptfacade/" + fileNameDes;
        try {
            FileOutputStream fs = new FileOutputStream(url, true);
            fs.write(cipherText.getBytes());
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
