package customKafkaExample;

public interface Subscriber {

    public String getTopic();
    public void update(Object object);
}
