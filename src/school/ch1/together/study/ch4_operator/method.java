package school.ch1.together.study.ch4_operator;

import java.util.Scanner;

public class method {
    // 사용자가 입력한 정수값이 짝수인지 홀수인지 판별후 출력 (삼항연산자 이용)
    public static void main(String[] args) {
    // 입력에서 정수값 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("정수값 입력해 주세요 :");
    // 출력에서 xx는 짝홀수 입니다.
        System.out.println(a + "는" + ( a % 2 ==0 ? "짝수입니다." : "홀수입니다."  ));
    }
}
