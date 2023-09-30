package school.alone.ch_1.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        calc.showInfo();
        calc.description(); // calc 인스턴스를 사용하여 description() 메서드를 호출한다.  main 에서는 calc 인터페이스와 상속을 받지 않아 디폴트 메서드 재정의가 안된다.

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr)); // 정적(static) 메서드 사용하기. 인터페이스 이름으로 직접 참조하여 정적 메소드 호출


    }
}
