package school.ch1.together.study.ch15_Polymorphism.dirverexam;

public class DriverExample {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
