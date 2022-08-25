package NotifyExample;

public class SmsDecorator extends BaseDecorator {

    @Override
    public void send(String message) {
        System.out.println("Sms:" + message);
    }
}
