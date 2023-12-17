package school.ch1.together.study.ch16_abstractandinterface.interfacetest;

public class Car {

    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }
}
