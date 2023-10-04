package school.ch1.together.study.operator;

import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 :");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.println("연산자 입력(+ or -) :");
        char ch = sc.nextLine().charAt(0);

        String result = (('+' == ch) ? (num1 + num2) + " " : (ch == '-' ? (num1 - num2) + "" : "잘못 입력했습니다."));

        System.out.println(result);


    }
}
