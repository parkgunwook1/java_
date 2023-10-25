package school.ch1.together.study.ch20_collection.ch1_set.hashset.run;

import school.ch1.together.study.ch20_collection.ch1_set.hashset.model.vo.StudentSet;

import java.util.*;

public class SetRun {


    /*
    * Collection - Set - HashSet
    * 중복값을 허용하지 않는다.
    * 저장된 순서를 보장하지 않는다.
    *
    * LinkedHashSet : 중복허용하지 않는다. 단, 저장된 순서를 유지
    *
    * TreeSet : 중복을 허용하지 않는다. 단, 오름차순 정렬 지원
    * */
    public static void main(String[] args) {

        Set<String> hs1 = new HashSet<>();

        // Set 객체 내부로 값을 추가 : add
        hs1.add("반갑습니다.");
        hs1.add("반갑습니다.");
        hs1.add("여러분");
        hs1.add("안녕하세요");
        hs1.add("여러분");

        System.out.println(hs1);

        // 크기 구하기 : size()
        System.out.println("hs1의 크기 : " + hs1.size());

        // 값 삭제 : remove(삭제할 값)
        hs1.remove("여러분");

        System.out.println(hs1);

        // 모든 값 삭제 : clear()
        hs1.clear();

        System.out.println(hs1);

        System.out.println("------------------------------");

        HashSet<StudentSet> hs2 = new HashSet<>();

        hs2.add(new StudentSet("공유",40,100));
        hs2.add(new StudentSet("김갑생",33,40));
        hs2.add(new StudentSet("홍길동",24,70));
        hs2.add(new StudentSet("공유",40,100));

        System.out.println(hs2);

        /*
        * 저장순서 유지 x, 중복값 저장 o =>> 동일객체로 판단하지 않았기 때문.
        * 값이 추가될때 equals(), hashCode()로 이미 들어간 값중에 현재 추가하고자 하는 값이 존재하는지 먼저 확인하기 때문.
        * 단, 위 두 메서드를 override 하지 않으면 object 클래스의 equals와 hashcode 함수를
        * 기준으로 동일여부를 확인한다.(주소값 간의 비교를 수행)
        * */

        // HashSet에 객체를 담을때 내부적으로 equals()로 비교 + hashCode() 값이 일치하는지도 비교
        // equals()한 결과가 true이고, hashCode() 값이 일치하면 => 동일 객체로 판단(중복값 제거)

        // Object 클래스의 equals() : 두 객체의 주소값을 가지고 비교 해서 일치하면 true, 일치하지 않으면 false
        // Object 클래스의 hashCode() : 두 객체의 주속밧을 기반으로 해시코드값을 만들어서 반환.

        // 객체의 필드값 기준으로 동일한 객체인지 여부를 판단하게 하려면 위 두 메소드를 오버라이딩 해줘야한다.

        // Student 클래스에 equals() 오버라이딩 : 세 필드값이 모두 일치하면 true, 하나라도 다를시 false 반환
        // Student 클래스에 hashCode() 오버라이딩 : 세 필드값 기반으로 해시코드값을 생성.

        System.out.println("=======================================================");

        // Set -> 데이터가 무작위로 저장되어있음 -> 즉, index 개념이 없다. -> 기본반복문을 활용할 수 없다.

        // Set 내부에 담겨있는 데이터를 순차적으로 가져오고자 할때 ?
        // 1. for문 (향상된 for문만 사용 가능)
        for ( StudentSet s : hs2) {
            System.out.println(s);
        }

        // 2. Set계열 클래스를 ArrayList클래스로 변환
//        ArrayList<StudentSet> list = new ArrayList<>(); // 비어있는 리스트 생성
//        list.addAll(hs2); // 리스트에 hs2에 담겨있는 객체들을 모두 추가하는 방식
        ArrayList<StudentSet> list = new ArrayList<>(hs2); // hs2에 담겨있는 모든 객체들이 추가된 채로 리스트가 생성

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 3. Iterator
        // HashSet 클래스에서 제공하는 iterator 반복자를 이용한 방법
        Iterator<StudentSet> it =  hs2.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
        * LinkedHashSet - 저장순서를 기록
        *
        * TreeSet - 값의 정렬을 지원
        *
        * */
        Set<Integer> set1 = new LinkedHashSet<>(); // 순서가 유지되는set
        set1.add(33);
        set1.add(34);
        set1.add(100);
        set1.add(23);
        set1.add(45);
        System.out.println(set1);

        // 오름차순 정렬
        Set<Integer> set2 = new TreeSet<>(set1); // treeset -> 오름차순 정렬
        System.out.println(set2);

    }
}
