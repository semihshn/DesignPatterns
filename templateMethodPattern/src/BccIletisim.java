public class BccIletisim extends AbstractClass {

    @Override
    public Integer getMetaData() {
        System.out.println("Bcc İletişim: Meta Verisi alındı");
        return verifyCode;
    }

    @Override
    public Integer getAudioData() {
        System.out.println("Bcc İletişim: Ses verisi getirildi");
        return verifyCode;
    }
}
