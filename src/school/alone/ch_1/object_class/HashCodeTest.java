package school.alone.ch_1.object_class;

public class HashCodeTest {
    // hashCode() 메서드 : 해시는 정보를 저장하거나 검색할 때 사용하는 자료 구조이다. 정보를 어디에 저장할 것인지, 어디서 가져올 것인지 해시 함수를 사용해 구현한다. 자바에서는 인스턴스를 힙 메모리에 생성하여 관리할 때 해시 알고리즘 사용한다.
    // clone() 메서드 : 객체 원본을 유지해 놓고 복사본을 사용한다거나, 기본 틀의 복사본을 사용해 동일한 인스턴스를 만들어 복잡한 생성 과정을 간단히 하려는 경우에 clone() 메서드를 사용할 수 있다.
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode()); // 동일한 해시 코드 값을 반환한다.
        System.out.println(str2.hashCode());

        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1.hashCode());  //Integer 클래스의 hashCode() 메서드는 정수 값을 반환하도록 재정의 되어있다.
        System.out.println(i2.hashCode());
    }
}
