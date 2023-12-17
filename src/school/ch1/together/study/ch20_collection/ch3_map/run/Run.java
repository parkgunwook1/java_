package school.ch1.together.study.ch20_collection.ch3_map.run;

import school.ch1.together.study.ch20_collection.ch3_map.mode.vo.Snack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Run {
    public static void main(String[] args) {
        // 인터페이스 계층구조를 확인해봤을 때 List나 Set 계열은 Collection 인터페이스를 상속받고 있다.
        // ex) 데이터를 추가할 때 전부 동일한 add 메서드를사용한다.

        // 단, Map은 다르다. 데이터 추가시 put 메서드를 사용(key + value을 세트로 추가)
        // Map의 특징
        // key , value을 한쌍으로 요소를 구성한다.
        // key를 통해서 value에 접근해 사용
        // key는 중복을 허용하지 않는다. value는 중복되어도 좋다.

        // 동일한 key로 추가 저장하면, 마지막에 추가한 value로 치환된다.
        // 동일한 key값 여부는 hashcode() 반환값으로 판단한다.

        // MAP<k, v > : V value 값으로 Snack 객체만을 저장하겠다 라고 선언
        //                K key 값으로 String 자료형 값만을 사용하겠다고 선언.
        Map<String, Snack> hm = new HashMap<>();

        hm.put("다이제", new Snack("초코맛", 1000));
        hm.put("칸초", new Snack("초코맛", 600));
        hm.put("포카칩", new Snack("짠맛", 1000));
        hm.put("새우깡", new Snack("짠맛", 1000));
        hm.put("새우깡", new Snack("짠맛", 4000));
        // 중복된 key 값으로 저장시 value 값은 마지막에 등록한 값으로 치환 된다.
        System.out.println(hm); // 저장순서 유지 x, value 값이 동일하다고 하더라도 key값만 중복되지 않는다면 문제 x

        // 2. get(Object key) : V => 컬렉션에서 해당 키값의 value 값을 돌려주는 메서드
        System.out.println(hm.get("다이제"));

        // 3. size() -> 컬렉션에 담겨있는개수
        System.out.println("size : " + hm.size());

        // 4. replace(k key, v value) => 컬렉션에 해당 key 값을 찾아서 새로 전달된 value 값으로 변경시켜주는 메서드
        hm.replace("포카칩", new Snack("트리플치즈" , 1000));
        System.out.println(hm);

        // 5. remove(Object key) : 컬렉션에서 해당 key값을 찾아서 지워주는 메서드
        hm.remove("새우깡");
        System.out.println(hm);

        System.out.println("==================================");

        // 순차적으로 HashMap에 담겨있는 값들에 접근하고자 할 때 ?
        // 1. keySet : key 값들을 set에 담아서 반환.["다이제","포카칩", "칸초"]
        // 2. entrySet() : key, value 한상을 set에 담아서 반환3 ["다이제"=snack, "포카칩"=Snack]

        // forEach 사용 불가 => 향상된 반복문에는 배열, Collection 인터페이스를 구현한 클래스만 들어올 수 있음.

        // List와 Map은 서로 다른 계열이기 때문에 ArrayList에 담아줄수가 없음.

        // iterator()는 Collection의 추상메서드이기 때문에 사용 불가.

        // 따라서 반복문을 돌리기 위해서는 KeySet 혹은 entrySet을  통해 Set 계열로 변환을 한후 반복을 해야함.
        // 1. keySet()을 이용하는 방법
        // 1) HashMap의 key 값들만 모아서 Set에 담아서 반환해준다.
        Set<String> keySet = hm.keySet();
        System.out.println("keyset 사용 : " + keySet);

        // 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
        //    keySet.iterator();

        // 1-1. 코드가 김
        Iterator<String> itkey =  keySet.iterator();
        System.out.println("iterator 사용 : " + itkey);

        // 1-2. 코드 줄어듬
        Iterator<String> itkey2 = hm.keySet().iterator();

        // 3) 반복자에 담긴것들을 순차적으로 뽑기
        while (itkey2.hasNext()) {
            String key = itkey2.next();
            Snack value = hm.get(key);
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        }
        System.out.println("--------------------------");

        // 2. entrySet() 이용방법

        // 1) hm에 있는 key + value값을 모두 묶어서 Set에 담은 후 반환.
        Iterator itEntry = hm.entrySet().iterator();

        // 2) 반복문을 활용해서 순차적으로 값을 출력
        while (itEntry.hasNext()) {
            Map.Entry entry = (Map.Entry)itEntry.next();
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
        }
     }
}
