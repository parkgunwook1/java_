package study.CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {
        // ArrayList에 새로운 값을 추가, 변경, 삭제하고 읽어오는 방법이다.
        // 값 추가하기 - add()
        // 값 변경하기 - set()
        // 값 삭제하기 - remove(), clear()
        // 값 읽기 - get()

        // 제네릭을 사용해서 String 값을 갖게 해준다.
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");

        String str1 = list.get(0); // 제네릭을 사용해서 String 자료형을 선언해서 형변환을 안해줘도 된다.
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
