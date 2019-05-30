package mei.designpattern.facade.abstractencryptfacade;

public class EncryptFacadeA extends AbstractEncryptFacade {
    private FileReader reader;
    private CipherMachineA cipher;
    private FileWriter writer;

    public EncryptFacadeA() {
        reader = new FileReader();
        cipher = new CipherMachineA();
        writer = new FileWriter();
    }

    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainText = reader.read(fileNameSrc);
        String cipherText = cipher.encrypt(plainText);
        writer.write(cipherText, fileNameDes);
    }
}
