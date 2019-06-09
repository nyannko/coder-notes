package mei.designpattern.creational.facade.abstractencryptfacade;

public class EncryptFacadeB extends AbstractEncryptFacade {
    private FileReader reader;
    private CipherMachineB cipher;
    private FileWriter writer;

    public EncryptFacadeB(){
        reader = new FileReader();
        cipher = new CipherMachineB();
        writer = new FileWriter();
    }

    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainText = reader.read(fileNameSrc);
        String cipherText = cipher.encrypt(plainText);
        String res = cipher.decrypt(cipherText);
        writer.write(res, fileNameDes);
    }
}
