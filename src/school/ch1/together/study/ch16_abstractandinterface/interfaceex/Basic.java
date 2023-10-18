package school.ch1.together.study.ch16_abstractandinterface.interfaceex;

public interface Basic {

    int num = 5; // 인터페이스에서 필드는 명시하지 않아도 무조건 상수필드로 사용된다.

    public void eat(); // 인터페이스에서 몸통부를 구현해도 에러가 안난다.
                       // abstract 자동으로 선언되어 있다.

}
