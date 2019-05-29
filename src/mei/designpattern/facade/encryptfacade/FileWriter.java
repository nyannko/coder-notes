package mei.designpattern.facade.encryptfacade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileWriter {
    public void write(String cipherText, String fileNameDes) {
        try {
            FileOutputStream fs = new FileOutputStream(fileNameDes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
