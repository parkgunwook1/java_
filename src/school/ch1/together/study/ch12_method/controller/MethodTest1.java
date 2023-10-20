package school.ch1.together.study.ch12_method.controller;

public class MethodTest1 {
    /*
    * 메소드
    * 접근제한자 예약어[static] 반환자료형 메소드명(매개변수){
    *    수행할코드
    *
    *    return 반환할값; (반환형이 void 경우 생략 가능)
    * }
    * 한번 정의하면 내가 원하는만큼 호출해서 재사용할 수 있다.
    * */
    // 1. 매개변수가 없고 반환값도 없는 메소드.
    public void method1(){
        System.out.println("매개변수와 반환값이 둘다 없는 메소드이다.");
        return;  // 메서드 내부에 return 문 작성 안하면 JVM이 자동생성해줌
    }
    // 2. 매개변수가 없고, 반환값은 있는 메소드
    public int method2() {
        System.out.println("매개변수가 없고 반환값은 있는 메서드이다.");

        return 1; //반환값
    }

    // 3. 매개변수가 있고, 반환값은 없는 메소드
    public void method3(int num1, int num2) {
        System.out.println("매개변수가 있고, 반환값은 없는 메서드이다.");

        // num1과 nunm2의 값을 비교하여, 결과를 출력하는 메서드
        int min = num1;
        int max = num2;

        if (num1 > num2) {
            min = num2;
            max = num1;
        }
        System.out.println("더큰값 :" + max);
        System.out.println("더 작은값 :" + min);
    }
    //4. 매개변수 있고, 반환값도 있는 메소드
    public int method(int a, int b) {
        System.out.println("매개변수 있습니다. 반환ㄱ밧도 있습니다.");

        return a * b;
    }
}
