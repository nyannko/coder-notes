package mei.designpattern.facade.encryptfacade;

public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainText = reader.read(fileNameSrc);
//        String cipherText = cipher.encrypt(plainText);
//        writer.write(cipherText, fileNameDes);
    }
}
