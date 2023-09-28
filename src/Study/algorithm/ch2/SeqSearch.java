package study.algorithm.ch2;

import java.util.Scanner;

public class SeqSearch {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++)  // 배열 검색을 while 문이 아니라 for 문으로 구현하면 프로그램은 짧고 간결해진다.
            if (a[i] == key)
                return i;
        return -1;
//        int i = 0;
//
//        while (true) {
//            if (i == n)
//                return -1;
//            if (a[i] == key)
//                return i;
//            i++;
        }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i =0; i < num; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }
        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();
        int idx = seqSearch(x, num, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
