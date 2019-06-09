package mei.designpattern.creational.facade.abstractencryptfacade;

public class Client {
    public static void main(String[] args) {
        AbstractEncryptFacade efa = new EncryptFacadeA();
        efa.fileEncrypt("string.txt", "result.txt");
        AbstractEncryptFacade efb = new EncryptFacadeB();
        efb.fileEncrypt("string.txt", "result.txt");
    }
}
