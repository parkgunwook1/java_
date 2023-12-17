package algorithm.ch1_baekjoon_loop;

import java.util.Scanner;

public class ch1_scanner {
    // 백준 10950
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int arr[] = new int[c];


        for (int i = 1; i <= c; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a+ b;
        }
        in.close();
        // 명시적으로 Scanner 인스턴스의 close() 메소드를 호출하여 이 리소스를 해제하는것이 중요하다.
        // 리소스가 필여하지 않을 때 자원 누수를 방지할 수 있다.
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
