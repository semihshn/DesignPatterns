package Commands;

public class Close implements Command {

    public final Remote machine;

    public Close(Remote machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.close();
    }
}
