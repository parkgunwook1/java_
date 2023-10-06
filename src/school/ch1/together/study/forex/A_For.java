package school.ch1.together.study.forex;

import java.util.Scanner;

public class A_For {

    public void method1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세요");
        }
    }
    public void method2() {
        for (int i = 0; i <10; i++) {
            if (i % 2 == 0)  {
                continue;
            }else System.out.println(i);
        }
    }

    public void method3() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num;) {
            sum += i++;
        }
        System.out.println("1부터 " + num + "까지의 총 합계 :" + sum);
    }
    public void method5() {

        for (int i = 2; i <= 9; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
    public void method6() {
        int dan;
        int times;

        for(dan = 2; dan <= 9; dan++) {
            for(times = 1; times <= 9; times++) {
                if(times > dan)
                    break;
                System.out.println(dan + "X" + times + "=" + dan * times);

            }
            System.out.println( );
        }
    }
    public void method7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        System.out.println("입력한 문자열의 길이 : " + str.length());

        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }
    }
    public void method8() {
        for (int i = 1; i < 4; i++) {
            System.out.println("*");
        }
    }
    public void method9() {
        Scanner sc = new Scanner(System.in);

        System.out.println("피연산자 입력 : ");
        int num1 = sc.nextInt();

        System.out.println("피연산지 입력2 : ");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.println("연산자 입력 (+,-,*,/,%)");
        char op = sc.nextLine().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2; break;
            case '-':
                result = num1 - num2; break;
            case '*':
                result = num1 * num2; break;
            case '/':
                System.out.printf("%d %c %d = %f" + num1, op, num2, num1 / (double) num2);
            default:
                System.out.println("잘못입력했습니다.");
        }
        System.out.printf("%d %c %d = %d" + num1, op, num2, result);
    }
    public void method10() {
        Scanner sc =new Scanner(System.in);

        System.out.println("중간 고사 점수 : ");
        int mid = sc.nextInt();

        System.out.println("기말 고사 점수 : ");
        int finalTest = sc.nextInt();

        System.out.println("과제 점수 : ");
        int report = sc.nextInt();

        System.out.println("출석 점수 : ");
        int attend = sc.nextInt();

        double mitTest = mid * 0.2;
        double finalTestResult =  finalTest * 0.3;
        double reportResult = report * 0.3;
        double total = mitTest + finalTestResult + reportResult + attend;

        boolean result = total > 70 && attend > 14? true : false;

        System.out.println("============== 결과 ====================");
        if (result ) {
            System.out.println("중간 고사 점수(20) :" + mitTest);
            System.out.println("기말 고사 점수(30) :" + finalTestResult);
            System.out.println("과제 점수(30) :"+ reportResult);
            System.out.println("출석 점수(20) :" + attend);
            System.out.println("총점 :" + total);
            System.out.println("PASS");
        }else {
            System.out.print("Fail ");
            if (attend <= 14) {
                System.out.print("출석 회수 부족 ("+attend+"/20) ");
            }

        }

    }
    public void method11() {
        Scanner sc = new Scanner(System.in);

        System.out.println("비밀번호 입력(1000~9999) : ");
        int pwd = sc.nextInt();

        if(pwd>999 && pwd < 10000) {
            int first = pwd % 10;
            int second = (pwd / 10) % 10;
            int third = (pwd / 100) % 10;
            int forth = (pwd / 1000) %10;

            if (first != second && first != third && first != forth
            && second != third && second != forth
            && third != forth) {
                System.out.println("생성 성공");
            }else {
                System.out.println("중복값 있음");
            }
        }else {
            System.out.println("자릿수가 맞지 않습니다.");
        }

    }
    public void method12() {

    }
}
