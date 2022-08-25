package NotifyExample;

public class CallDecorator extends BaseDecorator {

    public CallDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Call:" + message);
        super.send(message);
    }
}
