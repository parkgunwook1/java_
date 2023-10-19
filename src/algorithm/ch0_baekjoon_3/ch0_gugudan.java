package algorithm.ch0_baekjoon_3;

import java.util.Scanner;

public class ch0_gugudan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    // n단을 입력 받은뒤, 구구단 n단을 출력
    for (int i = 1; i <= 9; i++) {
        System.out.println(N + "*" + i + "=" + N * i);
    }

    }
}
