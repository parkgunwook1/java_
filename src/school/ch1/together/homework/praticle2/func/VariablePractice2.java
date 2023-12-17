package school.ch1.together.homework.praticle2.func;

import java.util.Scanner;

public class VariablePractice2 {
    public void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 :");
        int a = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int b = sc.nextInt();

        System.out.println("더한 결과 :" + (a + b));
        System.out.println("뺀 결과:" + (a-b));
        System.out.println("곱한 결과:" + (a*b));
        System.out.println("나눈 결과 :" + (a/b));
    }
}
