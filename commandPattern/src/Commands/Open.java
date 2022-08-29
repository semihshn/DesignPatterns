package Commands;

public class Open implements Command{

    public Remote machine;

    public Open(Remote machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.open();
    }
}
