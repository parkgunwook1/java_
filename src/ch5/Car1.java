package ch5;

public abstract class Car1 {
    public Car1(String name) {
        System.out.println("Car1() 생성자가 호출");
    }

    // 추상메소드
    public abstract void run();
}
