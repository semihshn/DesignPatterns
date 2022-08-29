package Commands;

public interface Remote {

    public void open();
    public void close();
    public void increaseVolume();
    public void decreaseVolume();
    public void selectChannel();

}
