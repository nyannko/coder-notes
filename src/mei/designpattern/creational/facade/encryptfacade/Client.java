package mei.designpattern.creational.facade.encryptfacade;

public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("string.txt", "result.txt");
    }
}
