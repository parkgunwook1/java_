package school.ch1.together.study.ch21_generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericRun < G ,  Generic>{ // 글자 숫자는 몇글자든 상관없음. 단 , 1글자로 작성하는게 관례

    G g; // 클래스에 제네릭 타입을 지정하게되면 해당 클래스 전역, 메서드 내부에서 전역변수처럼 사용 가능.
    // G의 자료형은 컴파일되는 시점에 결정된다.
    Generic generic;
    public static void main(String[] args) {
        GenericRun<String, String> s = new GenericRun(); // G => String
        s.g = "1";
        s.generic = "as";

        GenericRun<Integer, Integer> s1 = new GenericRun(); // G => Integer
        s1.g = 1;
        s1.generic = 3;
        // 제네릭을 사용하는 이유
        // 1. 명시한 타입의 객체만 저장가능하도록 타입의 제한을 두기 위해서 ** => 안전성 확보 가능
        // 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환하는 절차를 없애기 위해서

        /*
        * 제네릭 >?
        *
        * 데이터의 타입(자료형)을 일반화 한다라는 의미. 즉, 여러타입을 하나의 타입으로 일반화 시킴.(<E>, <T>, <K>)
        *
        * 제네릭은 컬렉션과 함께 가장 많이 사용되며 저장할 객체의 자료형을 제한하는 기능으로써 사용된다.
        *
        * <G>,<T>,<K>,<V> : 타입변수.  > 알파벳에는 아무 의미가 없음(변수의 이름이라고도 봐도 무방.)
        * 임의의 정해지지 않은 참조형 타입임을 의미. 실제 자료형(타입)은 컴파일 시점에 정해진다.
        * EX) GenericRun<String, String> s ; 제네릭 클래스 변수 선언시
        *     반환형을 가진 메서드 호출시 등등...
        *
        * ==> 제네릭타입은 그 자리에 대입되어야할 자료형이 있다라는 의미이고, 들어가야할 실제 타입은
        *     컴파일이 되는 시점에 개발자가 작성한대로 추가된다.
        * */

        // 제네릭 등장 이전 (jdk1.5 이해버전)
//        List list = new ArrayList();
//        Iterator i = list.iterator();
//
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

        // 객체배열
        Integer[] arr = {1,2,3};

        Object[] e = arr; // 업캐스팅으로 자동형변환.

        for (Object sa : e) { // Integer 사용 불가. => object가 부모 클래스이기 때문이다.
            System.out.println(sa);
        }

        // 컬렉션
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ArrayList<Object> list2 = new ArrayList<>();

//        list2 = list  -> 안된다. 왜냐 제네릭 타입이기 때문이다.
        // 서로다른 별개의 클래스인것, 제네릭은 오직 <> 로 전달받은 타입으로만 서로 받아줄수 있음

        // 해결방법으로 >타입이 등장함
        // ?(UnknownType) : 타입이 정해지지않음. 제네릭으로 지정할 타입을 지정하지 않았다라는 의미

        ArrayList<?> list3 = list; // 어떤타입의 제네릭값이든 담을수 있게 됨.
        // 들어오는 데이터타입은 알아서 정해라. 아무거나 추가해라의 느낌.
        s.test(list2);

//        list3.add(new Object()); ?가 Object가 아닌이상 무조건 에러발생
//        list3.add(1) // 만약 ?가 String이라면? 에러발생
//        list3.add("abc"); // 만약에 ?가 Integer? 에러발생

        // 제네릭 설정이 ? 라면 내가 넣고자하는 객체가 ?이여야함. 타입객체가 정해지지않은게 ?이므로
        // 들어가는 타입이 제네릭으로 지정한 타입의 자식이 맞는지 논리적으로 검사할수가 없다.
        // ex) ?들어갈수있는 자료형의 범위가 무한. ?에는 String, Integer, Book, Student... 다 들어갈수 있음.
        // 따라서 add와 같은 함수 호출시 제대로된 값을 추가했는지 검사 자체가 불가능하기때문에 컴파일 에러가 발생.

        // add 데이터 추가시 문제가 발생하는 이유는 ?가 가지는 자료형의 범위가 무한대이기 때문이다.
        // 해결방법으로 ?의 자려형의 범위를 상속구조를 통해 한정짓는 방법이 있다.

        // 1. 상한 경계 설정 : ?가 가질수 있는 자료형의 최대값을 설정할 수 있음. (상위클래스 제한)
        // [표현법]
        // 클래스명 < ? extends T > : T와 T의 자손클래스만 사용 가능.
        List<? extends Parent> upperBoundary = new ArrayList<>();
        for (Parent p  : upperBoundary) {
            // UpperBoundary에는 어떤값이 들어갔는지 모르지만, 최소한 Parent를 상속 받았음으로
            // 다형성의 원래에 의해 자동형변환이 가능하다. 즉, ?가 Parent로 형변환
        }
        /*
        * for (child1 c : upperBoundary) {
        *    // child1이 Parent의 자식인건 맞지만, Parent의 자식인 Child1. Child2도 있을 수 있는데
        *    // 이때 Child2가 ?의 타입이라는 가정이 이루어진다면 Child과 Child2는
        *    // 아무 상관이 없는 클레스 이므로 업캐스팅의 조건에 부합하지 않는다.
        *
        * UpperBoundary.add(new Parent()); ? 는 Parent일 수도 있고 Child1, Child2일수도 있음
        * 따라서 ?가 Child1이 될스도 있으므로 Child1 자료형에 부모 클래스의 객체를 다운캐스팅 없이 넣어주는게
        * 불가능하다.
        * */


        // 2. 하향 경계 설정 : 와일드카드가 가질수 있는 자료형의 최솟값으로 설정 == 하위클래스 제한
        // (값 추가시 사용)
        // [표현법]
        // 클래스명 < ? super T > : T와 T의 조상클래스만 가능.
        List<? super  Parent> lowerBoundary = new ArrayList<>();

        // ok? Child1의 super Parent이기 때문에 ? 경계선상 더 밑에 존재하므로 updasting 발생
//        lowerBoundary.add(new Chid1());

//        for (Parent p : lowerBoundary) { // 불가능. 만약 ?가 Parent보다 더 윗줄의 부모타입이라면 다운캐스팅을 해줘야 하므로

        for (Object o : lowerBoundary) { // 들어가는 타입이 뭐든, 최소한 Object의 자식이므로 가능.

        }
        // 반복문을 돌리면서 값을 하나씩 꺼내는 용도로 와일드카드를 지정할때 => 상한경계 설정
        // 내부의 값들을 꺼내서 비교후 알고리즘을 사용해야할 때 => 하한경계 설정.

    }
    public void test(ArrayList<?> list) {
        // 데이터 출력해보기
       Iterator it =  list.iterator();
       while (it.hasNext()) {
           it.next(); // 현재 데이터의 자료형은?
           System.out.println(it.next());
       }
//       list.add(new Object());
    }
}
class X {

}
class Parent extends X {

}
class Child1 extends Parent {

}
class Child2 extends Child1 {

}
