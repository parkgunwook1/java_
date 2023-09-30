package school.alone.ch_1.string_class;

public class StringTest {
    // 자바는 문자열을 사용할 수 있도록 String 클래스를 제공한다.
    // new 예약어를 사용해 객체를 생성하는 경우는 문자열을 위한 메모리가 할당되고 새로운 객체가 생성된다.
    // new 예약어를 안쓰고 바로 문자열 상수를 가리키는 경우에는 문자열 상수의 메모리 주소를 가리키게 된다.
    public static void main(String[] args) {
        String str1 = new String("abc"); // 인스턴스가 매번 새로 생성되므로 str1과 str2의 주소 값이 다름
        String str2 = new String("abc"); // 문자열 값은 같으므로 true 반환

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "str"; // 문자열 abc는 상수 풀에 저장되므로 가리키는 주소값이 같음
        String str4 = "str"; // 문자열 값도 같으므로 true

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
