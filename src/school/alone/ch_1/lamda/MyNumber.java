package school.alone.ch_1.lamda;

public interface MyNumber {
    // 람다식은 오직 하나의 메서드만 선언한 인터페이스를 구현할 수 있다.
    // @FunctionalInterface 어노테이션은 함수형 인터페이스라는 의미이고, 메서드를 하나 이상 선언하면 오류를 잡아주는 어노테이션이다.
    
    int getMax(int num1, int num2);
}
