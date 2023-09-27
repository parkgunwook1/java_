package Study.Array;

import java.util.Arrays;

public class Array08 {
    // compare 메서드

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        // 왼쪽 배열이 크면 양수 1, 같으면 0 , 오른쪽 배열이 크면 음수 -1
        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);
    }
}
