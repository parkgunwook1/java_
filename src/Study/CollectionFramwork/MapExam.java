package study.CollectionFramwork;


import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        // k1,k2,k3의 키를 가지고, 그 뒤에 값을 갖는다.

        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");

        // 키에 값을 출력한다.

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}
