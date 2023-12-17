package school.ch1.together.homework.work1;

import java.util.Scanner;

public class OperatorPractice {
    //모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
    //1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("인원수를 입력하세여");
        int a = sc.nextInt();

        System.out.println("사탕수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("1인당 사탕 개수 " + (a/b));
        System.out.println("남는 사탕 개수 " + (a%b));



    }
}
