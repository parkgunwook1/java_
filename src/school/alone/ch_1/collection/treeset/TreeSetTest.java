package school.alone.ch_1.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    // 자바의 Collection 인터페이스나 Map 인터페이스를 구현한 클래스 중 Tree로 시작하는 클래스는 데이터를 추가한 후 결과를 출력하면 결과 값이 정렬된다.
    // TreeSet 은 자료의 중복을 허용하지 않으면서 출력 결과 값을 정렬하는 클래스이다.
    // 정렬하는 기준은 이진 트리를 사용한다.
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for (String str : treeSet) {
            System.out.println(str);
        }

    }
}
