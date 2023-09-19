package Study1.ch8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {

        // List는 Collection을 상속받고 있기 때문에 아래와 같은 문법이 된다.
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("park");
        collection.add("hong");

        System.out.println(collection.size());

        // get 메서드는 사용못함
        // 데이터를 꺼내려면 Iterator 인터페이스 사용해야한다.
        // Iterator 은 데이터가 전부 리턴된다.

        // hasNext() : 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드! 있으면 true, 없으면 false를 반환한다.
        // next() : 다음 요소를 가져온다.
        // remove() : next()로 읽어온 요소를 삭제한다.
        // 메소드 호출 순서는 hasNext() -> next() -> remove() 이다.
        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
