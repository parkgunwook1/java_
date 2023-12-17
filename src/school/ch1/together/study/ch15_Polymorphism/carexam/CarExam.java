package school.ch1.together.study.ch15_Polymorphism.carexam;

public class CarExam { // 필드 다형성
    public static void main(String[] args) {

    Car myCar = new Car();

    myCar.tire = new Tire();
    myCar.run();

    myCar.tire = new HankookTire();
    myCar.run();

    myCar.tire = new KumhoTire();
    myCar.run();
    }
}
