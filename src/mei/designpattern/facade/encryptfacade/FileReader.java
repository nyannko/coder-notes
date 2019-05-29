package mei.designpattern.facade.encryptfacade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("Read String from file");
        String s = "";
        try {
            File file = new File("string.txt");
            System.out.println(file.exists());
            FileInputStream fs = new FileInputStream(file.getPath());
            s = fs.readAllBytes().toString();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
