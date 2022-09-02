public class Test {

    public static void main(String[] args) {
        AbstractClass bccIletisim = new BccIletisim();
        bccIletisim.setVerifyCode(1);
        bccIletisim.templateMethod();

        System.out.println("------------------------------------------------");

        AbstractClass bluecomTelekominikasyon = new BluecomTelekominikasyon();
        bluecomTelekominikasyon.setVerifyCode(2);
        bluecomTelekominikasyon.templateMethod();

        System.out.println("------------------------------------------------");

        AbstractClass comdataIstanbul = new ComdataIstanbul();
        comdataIstanbul.setVerifyCode(3);
        comdataIstanbul.templateMethod();
    }
}
