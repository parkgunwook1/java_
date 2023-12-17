package school.alone.ch_1.interfaceex.test;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();

        X xClass = mClass;
        xClass.x();

        Y yClass = mClass;  // y형 대입하면 y에 선언한 메서드만 호출 가능-
        yClass.y();

        MyInterface iClass = mClass;  // 구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메서드 호출 가능
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
