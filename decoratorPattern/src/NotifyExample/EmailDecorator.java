package NotifyExample;

public class EmailDecorator extends BaseDecorator {
    public EmailDecorator() {
    }

    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("E-mail:" + message);
        if (wrapee != null) {
            super.send(message);
        }
    }
}
