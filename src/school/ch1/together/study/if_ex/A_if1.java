package school.ch1.together.study.if_ex;

import java.util.Scanner;

public class A_if1 {

    // 사용자에게 정수값을 입력받은 후 양수다, 양수가 아니다를 출력
    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력해 주세요");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수 입니다.");
        } else
            System.out.println("양수가 아닙니다.");
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요:");
        int num = sc.nextInt();

        if (num > 0) {
            // 조건식이 true인경우 실행될코드
            System.out.println("양수입니다.");
        } else
            // 조건식이 false인 경우 실행될코드
            System.out.println("양수가 아닙니다.");
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        // 같은 비교대상 여러개 조건을 제시해야할 경우 사용 [ if ~ else if문 ]
        if (num > 0) {
            System.out.println("양수이다.");
        } else if (num == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }
    }

    public void method4() {
        // 사용자가 입력한 나이값을 가지고 어린이/ 청소년/성인 출력
        Scanner sc1 = new Scanner(System.in);

        int age = sc1.nextInt();

        String result = "성인";
        if (age <= 13) {
            result = "어린이";
        } else if (age <= 19) {
            result = "청소년";
        }
        System.out.println(result);
    }

    public void method5() {
        Scanner sc2 = new Scanner(System.in);
        // 사용자에게 이름, 성별 입력받아 남자인지 여자인지 출력하는 메서드
        System.out.println("이름 : ");
        String name = sc2.nextLine();

        System.out.println("성별(m/f)");
        char gender = sc2.nextLine().charAt(0);

        if (gender == 'm' || gender == 'M') {
            System.out.println(name + "님은 남자 입니다.");
        } else if (gender == 'f' || gender == 'F') {
            System.out.println(name + "님은 여자 입니다.");
        } else
            System.out.println("잘못 입력했습니다.");
    }
    public void method6() {
        Scanner sc3 = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc3.nextLine();

        if (name.equals("민경민")) {  // equals 는 객체의 내용끼리 비교한다.   || == 연산자는 자료의 위치 값을 비교한다.
            System.out.println("반가워요");
        }else {
            System.out.println("누구?");
        }
        }
    public void method7() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수(양수)를 입력");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수이다.");
        } else {
            System.out.println("홀수이다.");
        }
    }
    }




