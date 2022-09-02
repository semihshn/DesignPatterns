package customKafkaExample;

import customKafkaExample.driver.Driver;
import customKafkaExample.driver.DriverListener;
import customKafkaExample.passenger.Passenger;
import customKafkaExample.passenger.PassengerListener;

public class Test {

    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.setName("Semih");
        driver.setSurname("Sahan");

        Passenger passenger = new Passenger();
        passenger.setName("test_name");
        passenger.setSurname("test_surname");

        Subscriber driverListener = new DriverListener("driver-topic");
        Subscriber passengerListener = new PassengerListener("passenger-topic");

        CustomKafkaTemplate<Object> customKafkaTemplate = new CustomKafkaTemplate();

        customKafkaTemplate.subscribe(driverListener);
        customKafkaTemplate.send("driver-topic", driver);

        customKafkaTemplate.subscribe(passengerListener);
        customKafkaTemplate.send("passenger-topic",passenger);
    }
}
