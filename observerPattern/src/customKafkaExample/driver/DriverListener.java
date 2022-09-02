package customKafkaExample.driver;

import customKafkaExample.AbstractSubscriber;
import customKafkaExample.Subscriber;

public class DriverListener extends AbstractSubscriber {
    public DriverListener(String topic) {
        super.topic = topic;
    }
}
