package school.ch1.together.study.ch18_exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

    /*
    * RuntimeException
    * - 프로그램 실행시 발생되는 예외들
    *
    * RuntimeException의 자식 클래스들
    * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외.
    * - NegativeArraySizeException     : 배열의 크기를 음수로 지정할 경우 발생하는 예외
    * - ClassCaseException             : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외.
    * ex ) Object ob = new String("d")l  ->  ((Integer)ob) 형변환 불가.
    * - NullPointerException           : 참조변수가 null 값을 저장함에도 불구하고, 특정 필드 및 메서드에 접근하려고 할 때 발생한다.
    * ex ) Child1 ch = null; 주소값.toString
    *
    * - ArithmeticException            : 나누기 연산시 0으로 나눌 때 발생하는 예외
    * - ...
    * => 이러한 RuntimeException과 관련관 예외들은 예외상황이 출분히 예측 가능한 상황이기 때문에
    *    예외자체가 발생이 안되게끔 조건문으로 해결 가능하긴함.
    *    굳이 예외처리를 할 필요가 없다.
    * */

    private Scanner sc = new Scanner(System.in);

    public void method1() {

        // ArithmeticException  : 나누기 연산시 0으로 나누고자할 때 발생하는 예외

        // 사용자에게 두개의 정수값을 입력받아 나눗셈 연산 결과 출력

        System.out.print("첫번째 정수 : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수(0 제외) : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        // 해결방법 1. 조건문으로 처리(애초에 예외 자체가 발생되지 않게끔 if문으로 조건검사 후 계산 진행)

//        if (num2 == 0) {
//            System.out.println("0으로 나눌수 없습니다.");
//        } else {
//            System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
//        }
//        System.out.println("포르그램 종료");


        // 해결방법 2. 예외처리 구문으로 해결(예외가 발생했을 경우를 대비해서 실행할 내용을 정의해두는 것)
        /*
        * try ~ catch문
        * [표현법]
        * try {
        *   // 예외가 발생될수도 있는 소스코드가 존재하는 구문
        * }catch (발생될 예외클래스 변수명) {
        *   // 해당 예외가 발생할 경우 실행할 구문
        * }
        * */
        try {
            System.out.println("나눗셈 연산 결과 : " + (num1/num2));
        }catch (ArithmeticException e) {
            e.printStackTrace();    // 오류를 추적할 수 있음. 현재 예외가 발생한 정보를 볼 수 있다.
//            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void method2() {

        System.out.println("정수 입력(0 제외) : ");

        try {
            int num = sc.nextInt(); // InputMissmatchException -> int에 String 입력

            System.out.println("나눗셈 연산 결과 : " + (10/num)); // AritmeticException 발생가능한 코드
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
        }catch (InputMismatchException e) {
            System.out.println("문자를 사용할수 없습니다. 정수값을 입력해주세요.");
        } // 다중 catch블럭 : 예외가 여러개 발생할 가능성이 있을 경우 사용
        System.out.println("프로그램 종료");
    }
    public void method3() {

        // ArrayIndexOutOfBoundsException :
        // NegativeArraySizeException :

        System.out.print("배열의 크기는");
        try {
            int size = sc.nextInt();

            if (size < 0) {
                System.out.println("음수로 제시할수 없습니다.");
                return;
            }
            int[] arr = new int[size];

            if (arr.length > 100)
                System.out.println("100 번째 인덱스 값 : " + arr[100]);

        }catch (ArrayIndexOutOfBoundsException e) {  // 범위가 작은 자식타입의 예외를 먼저 기술해야한다.
                                                     // 만약 부모 클래스가 먼저 호출되서 예외처리를 다 해버리면
                                                     // 밑에 줄에 있는 catch 문은 실행이 안된다.
            System.out.println("부적절한 인덱스로 접근했다.");
        }
        catch (RuntimeException e) { // 다형성을 적용하여 부모타입의 예외클래스 하나만 작성
            System.out.println("에러가 발생하긴 했는데, 입력값이 잘못 입력되었을수도 있고, " +
                    "배열의 크기를 음수로 입력했을수도 있고," +
                    " 부적절한 인덱스로 접근했을수도 있다");
            // 다중 catch 블럭과 비교했을때 코드 블럭이 줄어들긴 했지만, 정확히 어떤 예외가 발생했는지 알 수 없음.
        }
        /*catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("부적절한 인덱스로 접근했습니다.");
        }catch (NegativeArraySizeException e) {
            System.out.println("배열의 크기를 음수로 제시할수 없습니다.");
        }*/
    }
}
/*
* RuntimeException 관련된 예외는 대부분
* - 조건문으로 해결 가능 => 예외 자체가 발생 안되게끔 개발자가 소스코드로 핸들리 하는것(예외처리x)
* - 예외 처리 구문으로 해결 가능 => 예외가 발생했을 때를 대비해서 그 때 실행할 내용을 정의해두는 것.
*
* 예측이 가능한 상황 -> 조건문으로 해결가능(권장)
* 예측이 불가능한 상황 -> 예외처리 구문으로 해결
*
* RuntimeException 계열은 충분한 예측 가능한 상황이기 때문에 조건문으로 해결하는것을 권장.
* 필수는 아니다 => UncheckedException
*
* */
