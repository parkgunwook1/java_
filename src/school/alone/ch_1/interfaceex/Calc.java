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
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }
    static int total(int[] arr) { // 정적 메서드는 static 예약어를 사용하여 선언하며 클래스 생성과 무관하게 사용할 수 있다. 정적 메서드 사용할 때는 인터페이스 이름으로 직접 참조하여 사용한다.
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }
    private void myMethod() {
        System.out.println("private 메서드입니다.");
    }
    private static void myStaticMethod() {    // private 메서드는 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없다. 따라서 기존에 구현된 코드를 번경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우에 private 메서드로 구현하면 코드 재사용성을 높일 수 있다.
        System.out.println("private static 메서드입니다.");
    }
}
