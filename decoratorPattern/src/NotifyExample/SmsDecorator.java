package NotifyExample;

public class SmsDecorator extends BaseDecorator {
    public SmsDecorator() {
    }

    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sms:" + message);
        if (wrapee != null) {
            super.send(message);
        }
    }
}
