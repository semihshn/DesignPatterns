import Commands.Remote;

public class Tv implements Remote {

    @Override
    public void open() {
        System.out.println("Televizyon açıldı");
    }

    @Override
    public void close() {
        System.out.println("Televizyon kapatıldı");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Televizyonun sesi arttırıldı");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Televizyonun sesi kısıldı");
    }

    @Override
    public void selectChannel() {
        System.out.println("Kanal seçildi");
    }
}
