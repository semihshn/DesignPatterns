public abstract class AbstractClass {

    protected Integer verifyCode=null;

    public void setVerifyCode(Integer verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getMetaData() {
        System.out.println("Meta Verisi alındı");
        Integer verifyCode = 1;
        return verifyCode;
    }

    public void doSaveMetaData() {
        System.out.println("Meta data kaydedildi");
    }

    public Integer getAudioData() {
        System.out.println("Ses verisi getirildi");
        Integer verifyCode = 1;
        return verifyCode;
    }

    public void doSaveAudioData() {
        System.out.println("Ses verisi kaydedildi");
    }

    public void templateMethod() {
        if (getAudioData() == getMetaData()){
            doSaveAudioData();
        }

        doSaveMetaData();
    }
}
