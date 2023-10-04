package school.alone.ch_1.abstracts;

public class DeskTop extends Computer{
    // 추상 클래스를 상속받은 하위 클래스는 구현되지 않은 추상 메서드를 모두 구현해야 구체적인 클래스가 된다.
    // 추상 메서드가 두 개이면 그 중 하나만 구현하면 이 역시 구현이 안 된 추상 메서드를 포함하는 추상 클래스이다.

    @Override
    public void display() {  // 추상 메서드 몸체 코드 작성.
        System.out.println("DeskTop display() ");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing() ");

    }
}
