package study.CollectionFramwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam01 {
    public static void main(String[] args) {

        // Set은 특정한 순서를 가지고 있지 않고, 중복 값을 삽입할 수 없다.
        // HashSet, TreeSet, LinkedHashSet 등이 있다. 이중에서 HashSet을 가장 많이 사용한다.
        // TreeSet : 값 오름차순으로 정렬해 저장
        // LinkedHashSet : 값 입력한 순서대로 정렬

        // add : 값 추가, addAll : 값을 한번에 여러 개 추가, remove : 특정 값 제거

        Set<String> set = new HashSet<>();

        boolean fl1 = set.add("hello");
        boolean fl2 = set.add("hi");
        boolean fl3 = set.add("hong");
        boolean fl4 = set.add("hong");  // 중복 값은 출력하지도 않고, false 가 나오는 것을 확인할 수 있다.
        System.out.println(fl1);
        System.out.println(fl2);
        System.out.println(fl3);
        System.out.println(fl4);

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
