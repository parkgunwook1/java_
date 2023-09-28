package algorithm.ch1;

import java.util.Scanner;

public class Alternativel {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        System.out.println("정수를 입력하세요 :");
        int n = stdIn.nextInt();

        System.out.println("+와 -를 번갈아 n개 출력한다.");

        // 수정한 코드
        for (int i = 0; i < n / 2; i++)
            System.out.print("+-");
        if (n % 2 != 0)
            System.out.print("+");


//        for (int i=0; i<n; i++)
//            if (i%2 ==0)
//                System.out.print("+");
//            else
//                System.out.print("-");
    }
}
// 위의 프로그램은 2가지 문제점이 있다.
// 1. 반복할 때마다 if 문을 실행해야 한다. 다시 말해 for 문을 반복할 때마다 if 문을 실행한다.
//    i값이 홀수인지 알아내기 위해 if 문을 모두 n번 실행해야 한다.
// 2. 변경할 때 유연하게 대응하기 어렵다.