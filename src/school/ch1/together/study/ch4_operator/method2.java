package school.ch1.together.study.ch4_operator;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정숫값 입력:");
        int num = sc.nextInt();

        System.out.println(num+"은" + (num > 0 ? "양수입니다" : (num == 0 ? "0 입니다." : "음수입니다")));
    }
}
