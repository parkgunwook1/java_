package study.Array;

import java.util.Arrays;

public class Array09 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        Arrays.sort(array);

        for(int i : array) {
            System.out.println(i);
        }
    }
}
