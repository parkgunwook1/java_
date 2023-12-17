package school.alone.ch_1.abstracts.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    // 템플릿 메소드는 로직 흐름이 이미 정해져 있는 프레임워크에서 많이 사용하는 기본 구현 방법이다.
    final public void run() { // 템플릿 메소드 역할 : 메서드 실행 순서와 시나리오를 정의하는 것.
        startCar();
        drive();
        stop();
        turnOff();
    }
}
