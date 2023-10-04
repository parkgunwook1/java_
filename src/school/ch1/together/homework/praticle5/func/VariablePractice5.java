package school.ch1.together.homework.praticle5.func;

import java.util.Scanner;

public class VariablePractice5 {
    Scanner sc = new Scanner(System.in);

    public void ec() {
        System.out.print("국어 점수를 입력하세요");
        double a = sc.nextDouble();
        System.out.print("영어 점수를 입력하세요");
        double b = sc.nextDouble();
        System.out.print("수학 점수를 입력하세요");
        double c = sc.nextDouble();

        double max = a + b + c;
        System.out.println("총점은 :" + max + "입니다.");

        int d = (int) max / 3;
        System.out.println("평균은" + d + "입니다." );
    }
}
