package school.alone.ch_1.collection.HashSet;

import java.util.HashSet;

public class HashSetTest {
    // 순서와 상관없이 중복을 허용하지 않는 경우에는 Set 인터페이스를 구현한 클래스를 사용한다.

    // HashSet은 중복되어 출력되지 않고, 자료가 추가된 순서대로 출력되지 않는다.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add(new String("임정순"));
        hashSet.add(new String("홍길동"));
        hashSet.add(new String("박건욱"));
        hashSet.add(new String("박건욱"));
        hashSet.add(new String("고길동"));

        System.out.println(hashSet);
    }
}
