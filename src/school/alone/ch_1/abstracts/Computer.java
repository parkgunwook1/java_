package school.alone.ch_1.abstracts;

public abstract class Computer {
    // 추상 메서드는 {} 대신 ;를 사용한다.
    // int add(int x, int y) { } = 추상 메서드가 아니다.
    // 자바에서 추상메서드는 abstract 예약어를 사용하여 선언만 하는 메서드이다.

    public abstract void display();
    public abstract void typing();
    public void turOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

}
