package Study.algorithm.ch2;

import java.util.Arrays;

public class BinarySearch_2 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 7, 1, 11, 13};

        // 배열 정렬
        Arrays.sort(arr);

        // 검색 대상 요소
        int target = 7;

        // 배열을 정렬한 후 이진 검색
        int index = Arrays.binarySearch(arr, target);

        if (index >= 0) {
            System.out.println("요소 " + target + "은(는) 배열의 인덱스 " + index + "에 있습니다.");
        } else {
            System.out.println("요소 " + target + "을(를) 찾을 수 없습니다.");
        }
    }

}
