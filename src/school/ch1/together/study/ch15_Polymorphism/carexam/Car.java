package school.ch1.together.study.ch15_Polymorphism.carexam;

public class Car {

    public Tire tire;

    public void run() {
        // tire 필드에 대입된 객체의 roll() 메소드 호출
        tire.roll();
    }
}
