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
                method();
                return;
            }else if (i < a) {
                num1 = i;
                num2 = a;
            }else num2 = a;
                  num1 = i;
        }for (int i = num1; i < num2; i++) {
            System.out.println(num1);
        }
    }
    public void method2() {
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
}

