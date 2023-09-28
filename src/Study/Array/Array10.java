package study.Array;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        Arrays.sort(array);

        // binarySearch 는 정렬된 배열애서 부터 검색해준다.
        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);
    }
}
