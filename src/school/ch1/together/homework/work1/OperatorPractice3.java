package school.ch1.together.homework.work1;

import java.util.Scanner;

public class OperatorPractice3 {
    public void practice4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 :");
        int a = sc.nextInt();
        System.out.print("수학 :");
        int b = sc.nextInt();
        System.out.println("영어 : ");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println("합계 : " + sum);
        int result = sum / 3;
        System.out.print("평균 : " + result);


    }
}
