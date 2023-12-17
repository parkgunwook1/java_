package school.ch1.together.homework.work1;

import java.util.Scanner;

public class OperatorPractice1 {
    public void practice2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 :");
        String a = sc.nextLine();

        System.out.print("학년 :");
        int c = sc.nextInt();


        System.out.print("반 : ");
        int d = sc.nextInt();


        sc.nextLine();

        System.out.print("성별(m/f) :");
        char b = sc.nextLine().charAt(0);


        String result = (b == 'm') ? "남자" : "여자.";

        System.out.print("점수 :");
        double num = sc.nextDouble();


        System.out.println(c + "학년" + d + "반 " + a + result + "의" + "성적은" + num + "이다." );
    }
}
