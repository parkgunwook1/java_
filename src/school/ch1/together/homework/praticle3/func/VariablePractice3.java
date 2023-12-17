package school.ch1.together.homework.praticle3.func;

import java.util.Scanner;

public class VariablePractice3 {
    Scanner sc = new Scanner(System.in);

    public void Square() {

        System.out.print("사각형의 가로를 입력하세요 :");
        double width = sc.nextDouble();

        System.out.print("사각형의 세로를 입력하세요");
        double length = sc.nextDouble();

        System.out.println("면적 : " + (width * length));
        System.out.println("둘레 : " + (width + length) * 2);
    }
}
