package algorithm.ch1;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        System.out.print("사각형을 만들 숫자를 기입하시오 : ");

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
