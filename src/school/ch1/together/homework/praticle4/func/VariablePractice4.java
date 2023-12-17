package school.ch1.together.homework.praticle4.func;

import java.util.Scanner;

public class VariablePractice4 {

    // charAt()은 특정 문자를 출력하는데 사용한다.
    public void ec() {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세여:");
        String name = sc.nextLine();

        System.out.println("첫 번째 문자 : " + name.charAt(0));
        System.out.println("두 번째 문자 : " + name.charAt(1));
        System.out.println("세 번째 문자 : " + name.charAt(2));
    }
}
