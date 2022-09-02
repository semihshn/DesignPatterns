package customKafkaExample;

public abstract class AbstractSubscriber implements Subscriber{

    public String topic;

    @Override
    public String getTopic() {
        return this.topic;
    }

    @Override
    public void update(Object object) {
        System.out.println("This data has been saved to elasticsearch: " + object);
    }
}
