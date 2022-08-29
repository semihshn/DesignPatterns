package Commands;

public class IncreaseVolume implements Command{

    public Remote machine;

    public IncreaseVolume(Remote machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.increaseVolume();
    }
}
