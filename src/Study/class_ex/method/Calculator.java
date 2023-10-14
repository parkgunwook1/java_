package Study.class_ex.method;

/*
* 메소드는 객체의 동작이므로 객체가 없으면 실행을 못한다.
* 객체 내부에서는 단순한 메서드명으로 호출 되지만
* 객체 외부에서는 참조변수와 도트 연산자로 호출
*
* 메소드가 리턴값이 있을 시 변수를 만들어 대입연산자를 이용해 데이터를
* 넣을 수 있다. 단, 전달받는 매개변수랑 자료형이 같아야 한다.
*
*
* */
public class Calculator {
    // 리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    // 호출 시 두 정수 값을 전달받고
    // 호출한 곳으로 결과값 int 리턴하는 메소드 선언
    int plus(int x,int y) {
        int result = x + y;
        return result;
    }
    // 호출 시 두 정수 값을 전달받고,
    // 호출한 곳으로 결과값 double 리턴하는 메소드 선언
    double divide(int x,int y) {
        double result = (double)x  / (double)y;
        return result;
    }
}
