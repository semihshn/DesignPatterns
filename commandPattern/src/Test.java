import Commands.*;

public class Test {

    public static void main(String[] args) {
        Command openTvCommand = new Open(new Tv());
        openTvCommand.execute();

        Command increaseVolumeOfTvCommand = new IncreaseVolume(new Tv());
        increaseVolumeOfTvCommand.execute();

        Command decreaseVolumeOfTvCommand = new DecreaseVolume(new Tv());
        decreaseVolumeOfTvCommand.execute();

        Command selectChannelOfTvCommand = new SelectChannel(new Tv());
        selectChannelOfTvCommand.execute();

        Command closeTvCommand = new Close(new Tv());
        closeTvCommand.execute();
    }
}
