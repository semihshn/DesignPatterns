package NotifyExample;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.sendMessage();
    }

    public void sendMessage() {

        Notifier notifier = new CallDecorator();
        notifier = new EmailDecorator(notifier);
        notifier = new SmsDecorator(notifier);
        notifier = new EmailDecorator(notifier);
        notifier.send("THIS IS NOTIFY");

    }
}
