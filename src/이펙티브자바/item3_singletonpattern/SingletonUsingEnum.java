package 이펙티브자바.item3_singletonpattern;

public enum SingletonUsingEnum {
    INSTANCE; // 열거 상수로 유일한 인스턴스 정의

    // 유일한 인스턴스의 메서드
    public void doSomething() {
        System.out.println("singletonUsingEnum");

        /* 열거타입
        * 열거 타입은 JVM에 의해 보장되는 싱글턴 패턴을 구현하는 가장 간단한 방법 중 하나다.
        * 열거 타입은 더 간결하고 직관적이다. 따라서 열거 타입을 사용하는 것을 권장한다.
        * */
    }
}
