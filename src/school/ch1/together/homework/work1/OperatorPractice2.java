package school.ch1.together.homework.work1;

import java.util.Scanner;

public class OperatorPractice2 {
    public void practice3() {
        Scanner sc =new Scanner(System.in);

        System.out.print("나이 : ");
        int a = sc.nextInt();

        String result = (a >= 19) ? "성인" : ((a <= 13) ? "어린이" : "청소년");

        System.out.println(result);
    }
}
