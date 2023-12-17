package school.ch1.together.study.ch6_for_ex;

import java.util.Scanner;

public class A_For {

    public void method1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세요");
        }
    }

    public void method2() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            } else System.out.println(i);
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
        for (int i = 1; i <= num; ) {
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

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                if (times > dan)
                    break;
                System.out.println(dan + "X" + times + "=" + dan * times);

            }
            System.out.println();
        }
    }

    public void method7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        System.out.println("입력한 문자열의 길이 : " + str.length());

        for (int i = 0; i <= str.length() - 1; i++) {
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
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                System.out.printf("%d %c %d = %f" + num1, op, num2, num1 / (double) num2);
            default:
                System.out.println("잘못입력했습니다.");
        }
        System.out.printf("%d %c %d = %d" + num1, op, num2, result);
    }

    public void method10() {
        Scanner sc = new Scanner(System.in);

        System.out.println("중간 고사 점수 : ");
        int mid = sc.nextInt();

        System.out.println("기말 고사 점수 : ");
        int finalTest = sc.nextInt();

        System.out.println("과제 점수 : ");
        int report = sc.nextInt();

        System.out.println("출석 점수 : ");
        int attend = sc.nextInt();

        double mitTest = mid * 0.2;
        double finalTestResult = finalTest * 0.3;
        double reportResult = report * 0.3;
        double total = mitTest + finalTestResult + reportResult + attend;

        boolean result = total > 70 && attend > 14 ? true : false;

        System.out.println("============== 결과 ====================");
        if (result) {
            System.out.println("중간 고사 점수(20) :" + mitTest);
            System.out.println("기말 고사 점수(30) :" + finalTestResult);
            System.out.println("과제 점수(30) :" + reportResult);
            System.out.println("출석 점수(20) :" + attend);
            System.out.println("총점 :" + total);
            System.out.println("PASS");
        } else {
            System.out.print("Fail ");
            if (attend <= 14) {
                System.out.print("출석 회수 부족 (" + attend + "/20) ");
            }

        }

    }

    public void method11() {
        Scanner sc = new Scanner(System.in);

        System.out.println("비밀번호 입력(1000~9999) : ");
        int pwd = sc.nextInt();

        if (pwd > 999 && pwd < 10000) {
            int first = pwd % 10;
            int second = (pwd / 10) % 10;
            int third = (pwd / 100) % 10;
            int forth = (pwd / 1000) % 10;

            if (first != second && first != third && first != forth
                    && second != third && second != forth
                    && third != forth) {
                System.out.println("생성 성공");
            } else {
                System.out.println("중복값 있음");
            }
        } else {
            System.out.println("자릿수가 맞지 않습니다.");
        }

    }

    public void method12() {

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }

    public void method13() {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void method14() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void method15() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void method16() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 이상의 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i < 0) {
                System.out.println("양수가 아닙니다. 다시 입력하세요");
                method16();
            } else System.out.print(i);
        }
    }

    public void method17() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 이상의 숫자를 입력하세요");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i--) {
            if (i < 0) {
                System.out.println("양수가 아닙니다. 다시 입력하세요.");
            } else System.out.print(i);
        }
    }

    public void method18() {
        Scanner sc = new Scanner(System.in);
        /*1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
            ex.
           정수를 하나 입력하세요 : 8
           1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36  */

        System.out.print("정수를 하나 입력하세요:");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(i + "+");
            if (i == a) {
                System.out.println("=" + (i + a));
            }
        }
    }

    public void method19() {
            /*사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
              력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요*/
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int input1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int input2 = sc.nextInt();

        int num1;
        int num2;

        if (input1 < 1 || input2 < 1)
            System.out.println("1 이상의 숫자를 입력해주세요.");
        else {
            if (input1 < input2) {
                num1 = input1;
                num2 = input2;
            } else {
                num1 = input2;
                num2 = input1;
            }
            for (int i = num1; i <= num2; i++)
                System.out.print(i + " ");
        }
        sc.close();
    }
    public void method21() {
        Scanner sc = new Scanner(System.in);
         /*사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
              력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요*/

        System.out.print("첫 번째 숫자:");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자:");
        int b = sc.nextInt();

        int num1;
        int num2;

        if (a < 1 || b < 1) {
            System.out.println("1 이상의 숫자를 입력하시오");
            method21();
            return;
        }else {
            if (a < b) {
                num1 = a;
                num2 = b;
            }else {
                num1 = b;
                num2 = a;
            }
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        }
    }
    public void method22() {
        Scanner sc = new Scanner(System.in);
        /*사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
         “9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.*/

        int a = sc.nextInt();


        System.out.print("숫자 : ");
        int num = sc.nextInt();

        if (num < 2 || num > 9)
            System.out.println("2~9 사이 숫자만 입력해주세요.");
        else {
            for (int i = num; i <= 9; i++) {
                System.out.println("===== " + i + "단 =====");
                for (int j = 0; j < 9; j++)
                    System.out.println(i + " * " + (j + 1) + " = " + i * (j + 1));
                System.out.println();
            }
        }
    }
    public void method23() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
    public void method24() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
                System.out.println();
            }
        }
    public void method25() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




