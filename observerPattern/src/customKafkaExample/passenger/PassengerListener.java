package customKafkaExample.passenger;

import customKafkaExample.AbstractSubscriber;
import customKafkaExample.Subscriber;

public class PassengerListener extends AbstractSubscriber {
    public PassengerListener(String topic) {
        super.topic = topic;
    }
}
