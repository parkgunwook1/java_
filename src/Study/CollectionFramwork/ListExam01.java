package study.CollectionFramwork;

import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {

        // 제네릭을 사용하지 않고 ArrayList 사용

        // 자료구조객체들은 제네릭을 사용하지 않으면 object타입을 저장한다.
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("Lee");
        list.add("hong");

        String str1 = (String)list.get(0); // 자료형을 정해주지 않아서 String으로 형변환을 해줘야한다.
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
