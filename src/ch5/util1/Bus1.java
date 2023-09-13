package ch5.util1;

public class Bus1 extends Car1 {
    public Bus1() {
        super("Bus!" + "");  // 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
        System.out.println("Bus1 기본생성자");
    }

    // 부모가 가지고 있는 추상메소드는 자식에서 반드시 구현을 해줘야 한다.
    @Override
    public void run() {
        System.out.println("후륜 구동을 동작한다.");

    }
}
