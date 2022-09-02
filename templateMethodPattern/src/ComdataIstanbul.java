public class ComdataIstanbul extends AbstractClass {

    @Override
    public Integer getMetaData() {
        System.out.println("Bluecom Telekominikasyon: Meta Verisi alındı");
        return verifyCode;
    }

    @Override
    public Integer getAudioData() {
        System.out.println("Bluecom Telekominikasyon: Ses verisi getirildi");
        return verifyCode;
    }
}
