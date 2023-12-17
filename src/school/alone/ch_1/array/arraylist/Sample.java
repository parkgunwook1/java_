package school.alone.ch_1.array.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    // 자바에서 Array를 List로 변환하기 위해서는 Arrays.asList(array)를 사용한다.
    // 배열은 정적배열 밖에 선언 되지 않는다. 반면에 arraylist 는 동적으로 할당할 수 있다
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
        pitches.sort(Comparator.naturalOrder());
        // 오름차순 정렬 - Comparator.naturalOrder()
        // 내림찬순 정렬 - Comparator.reverseOrder()
        // 정렬하기 위해서는 sort 메서드를 사용해야 함.
        System.out.println(pitches);
    }
}
