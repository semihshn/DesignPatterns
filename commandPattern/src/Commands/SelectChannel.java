package Commands;

public class SelectChannel implements Command{

    public Remote machine;

    public SelectChannel(Remote machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.selectChannel();
    }
}
