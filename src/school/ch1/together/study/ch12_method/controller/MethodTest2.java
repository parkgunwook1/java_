package school.ch1.together.study.ch12_method.controller;

public class MethodTest2 {
    static int count = 100;
    int count2 = 0;

    /*
    * static 메소드
    * [표현법]
    * 접근제한 static 예약어 반환형 메소드명 (매개변수) {
    *    수행할 코드
    *    return 반환값;
    * }
    *
    * - 호출 시 객체 생성할 필요가 없음
    * - 프로그램 시작시에 정적메모리 영역에 메소드가 저장되어 있기 때문
    * - 클래스명.메소드명(전달값); 으로 호출이 가능
    * - 예약어, 매개변수, return은 생략 가능
    *
    * */

    public static void method() {
        System.out.println("매개변수 x, 반환값 x");
    }
    public static String method2() {
        return "매개변수 없고, 반환값은 있다.";
    }
    public static void method3(String name, int age) {
        System.out.println(name+"님은"+age+"살 입니다.");
    }
    public static int method4(int num1) {
        return num1 * count; // 스태택 메소드 내부에는 일반 필드는 접근이 안되며, 스태틱 필드만 접근 가능하다.
                             // 메모리 생성 영역 시점이 다르기 때문이다. 스태틱 메서드, 스태틱 필드는 정적 메모리 영역에 들어감
                             // 일반 필드는 생성시점 다름.
    }
}
