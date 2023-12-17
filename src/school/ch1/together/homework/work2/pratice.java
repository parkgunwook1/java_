package school.ch1.together.homework.work2;

import java.util.Scanner;

public class pratice {
    Scanner sc = new Scanner(System.in);
    public void method() {
        System.out.println("1이상의 숫자를 입력하세요");
        int a = sc.nextInt();

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i < a; i++) {
            if (a < 1) {
                System.out.println("1 이상의 숫자를 입력해주세여.");
                return;
            }else if (i < a)
                num1 = i;
                num2 = a;
           }for (int i = num2; i < num1; i--) {
            System.out.println(i);
        }
    }
    public void method2() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a > 9) { // 9보다 a가 더 크면 아래 프린트 출력
            System.out.println("9 이하의 숫자만 입력해주세여");
        }else {
            for (int i = a; i <= 9; i++) {
                System.out.println("====" + i + "단 =====");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + "=" + " " + i * j);
                }
                System.out.println();
            }
        }
    }
    public void method1() {
        System.out.println("1이상의 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
    }
    public void method3() {
        System.out.println("1이상의 숫자를 입력하세요 : ");

        int a = sc.nextInt();

        if (a < 1)
            System.out.println("1 이상의 숫자를 입력해주세요");
        else {
            for (int i = a; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }
    public void method4() {
        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += (i + 1);

            System.out.print(i + 1);
            if (i + 1 == num){ System.out.print(" = ");

            }else System.out.print(" + ");{
            }
        }
        System.out.println(sum);
    }
    public void method5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

            System.out.print(i);
            if (i < num) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }
    public void method6() {
        System.out.println("정수를 입력하세요 : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void method7() {
        System.out.print(" 정수 입력 : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

