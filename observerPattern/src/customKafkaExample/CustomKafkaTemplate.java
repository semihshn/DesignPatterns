package customKafkaExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomKafkaTemplate<D> {

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void subscribe(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public void send(String topic, D object){
        Iterator<Subscriber> iterator = subscribers.iterator();
        while(iterator.hasNext()){
            Subscriber subscriber = iterator.next();
            if (subscriber.getTopic().equals(topic)){
                subscriber.update(object);
            }
        }
    }
}
