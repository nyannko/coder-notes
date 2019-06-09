package mei.designpattern.creational.facade.abstractencryptfacade;

public class CipherMachineB {
    public String encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        int key = 1;
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            c += key ; //shift char
            cipherText.append(c);
        }
        System.out.println(cipherText.toString());
        System.out.println(decrypt(cipherText.toString()));
        return cipherText.toString();
    }

    public String decrypt(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        int key = 1;
        for (int i = 0; i < cipherText.length(); i++) {
            char c = cipherText.charAt(i);
            c -= key;
            plainText.append(c);
        }
        return plainText.toString();
    }
}
