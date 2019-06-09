package mei.designpattern.creational.facade.encryptfacade;

public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("Encrypt string");
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            c -= 2;
            cipherText.append(c);
        }
        return cipherText.toString();
    }
}
