package school.alone.ch_1.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
    // 자료의 변동(삭제,삽입)이 많은 경우에는 링크드 리스트를, 자료 변동이 거의 없는 경우에는 배열을 사용하는 것이 효율적이다.
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");  // 링크드 리스트에 요소 추가
        myList.add("B");
        myList.add("C");

        System.out.println(myList); // 리스트 전체 출력

        myList.add(1,"D"); // 링크드 리스트의 첫 번째 위치에 D추가
        System.out.println(myList);

        myList.addFirst("0"); // 연결 리스트의 맨 앞에 0 추가
        System.out.println(myList);

        System.out.println(myList.removeLast()); // 연결 리스트 맨 뒤 요소 삭제 후 해당 요소 출력
        System.out.println(myList);
    }
}
