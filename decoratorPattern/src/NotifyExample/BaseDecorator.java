package NotifyExample;

public class BaseDecorator implements Notifier {

    Notifier wrapee;

    BaseDecorator(){

    }

    BaseDecorator(Notifier notifier){
        this.wrapee=notifier;
    }

    @Override
    public void send(String message) {
        wrapee.send(message);
    }
}
