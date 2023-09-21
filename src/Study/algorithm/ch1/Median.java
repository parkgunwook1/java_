package Study.algorithm.ch1;

import java.util.Scanner;

public class Median {

      static int med4(int a, int b, int c) {
          if ((b >= a && c <= a) || (b <= a && c>= a))
              return a;
          else if ((a > b && c < b) || (a < b && c > b))
              return b;
          return c;
      }
//    static int med3(int a, int b, int c) {
//        if (a >= b)
//            if (b >= c)
//                return b;
//            else if (a <= c) //?
//                return a;
//            else
//                return c;
//            else if (a > c)
//                return a;
//            else if (b > c)
//                return c;
//            else
//                return b;
//    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값: ");
        int a = stdin.nextInt();
        System.out.println("b의 값 : ");
        int b = stdin.nextInt();
        System.out.println("c의 값:");
        int c = stdin.nextInt();

        System.out.println("중앙값은" + med4(a,b,c) + "입니다.");
    }
}
