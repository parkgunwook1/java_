package Study.class_ex.method;

public class CalculatorExample {
    public static void main(String[] args) {

    // Calculator 객체 생성
    Calculator cal = new Calculator();

    // 리턴값이 없는 powerOn(); 메소드 호출
    cal.powerOn();

    // plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
    // 덧셈 결과를 리턴 받아 result1 변수에 대입
        int result1 = cal.plus(5,6);
        System.out.println("result1 :" + result1);

    int x = 4;
    int y = 10;
    // divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고
    // 나눗셈 결과를 리턴받아 result2 변수에 대입
        double result2 = cal.divide(x,y);
        System.out.println("result2 : " + result2);

        // 리턴 값 없는 poweroff 메소드 호출
        cal.powerOff();
    }
}
