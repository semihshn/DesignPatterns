package NotifyExample;

public class CallDecorator extends BaseDecorator {
    public CallDecorator() {
    }

    public CallDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Call:" + message);
        if (wrapee != null) {
            super.send(message);
        }
    }
}
