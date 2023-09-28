package Study.CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        // 자료구조에서 유용한 메서드를 모아놓운 Collections 클래스
        // 정렬 sort
        Collections.sort(list);

        for (int i  = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
