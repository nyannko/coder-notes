package mei.designpattern.creational.facade.abstractencryptfacade;

public class CipherMachineA {
    public String encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            c -= 1;
            cipherText.append(c);
        }
        System.out.println( cipherText.toString());
        return cipherText.toString();
    }
}
