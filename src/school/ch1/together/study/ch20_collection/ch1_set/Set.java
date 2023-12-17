package school.ch1.together.study.ch20_collection.ch1_set;

import java.util.HashSet;
import java.util.Iterator;

// Set은 저장 순서를 바꿔도 저장되는 순서에는 영향을 미치지 안흔ㄴ다.
// add() 메소드를 사용하여 HashSet에 이미 존재하는 요소를 추가하려고 한다면, 해당 요소 저장하지 않고 false 반환한다.

public class Set {
    public static void main(String[] args) {

        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        // add() 메소드를 이용한 요소의 저장
        hs01.add("홍길동");
        hs01.add("이순신");
        System.out.println(hs01.add("홍길동"));
        System.out.println(hs01.add("박건욱"));

        for (String e : hs01) {
            System.out.println(e + " ");
        }

        hs02.add("임꺽정");
        hs02.add("박건욱");
        hs02.add("유관순");

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()) {
            System.out.println(iter02.next() + " ");
        }
        System.out.println("집합의 크기 : " + hs02.size());
    }
}
