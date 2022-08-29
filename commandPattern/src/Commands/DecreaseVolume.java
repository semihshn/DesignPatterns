package Commands;

public class DecreaseVolume implements Command{

    public Remote machine;

    public DecreaseVolume(Remote machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.decreaseVolume();
    }
}
