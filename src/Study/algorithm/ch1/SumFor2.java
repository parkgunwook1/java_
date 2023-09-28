package study.algorithm.ch1;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {                              // n이 0보다 클 때까지 실행
            System.out.println("n값 : "); // n이 양수이면 n번 반복 덧셈
            n = stdIn.nextInt();
        }while (n <= 0);                  // n이 0보다 커야함.

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
    }
}
