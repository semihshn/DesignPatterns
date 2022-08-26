package NotifyExample;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.sendMessage();
    }

    public void sendMessage() {

        //first decorator must SmsDecorator because we must select an default decorator at Decarator Design Pattern
        Notifier notifier = new CallDecorator();
        notifier = new EmailDecorator(notifier);
        notifier = new SmsDecorator(notifier);
        notifier = new EmailDecorator(notifier);
        notifier.send("THIS IS NOTIFY");
    }
}
