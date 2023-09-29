package school.alone.ch_1.interfaceex;

public interface Calc {
    // 인터페이스는 추상 메서드와 상수로만 이루어져 있다.
    double PI = 3.14; // 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환된다.
    int ERROR = -999999999;

    // 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환된다.
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
