package school.alone.ch_1.string_class;

public class StringBuilderTest {
    // String 클래스는 한번 생성되면 그 내부의 문자열이 변경되지 않기 때문에 String 클래스를 사용하여 문자열을 변경하는 프로그램을 작성하면 메모리가 많이 낭비된다.
    // 이 문제를 해결하는 것이 StringBuffer 와 StringBuilder 클래스이다.
    // StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장하지만, 멀티스레드 프로그램이 아니라면 StringBuilder 를 사용하는 것이 실행 속도가 빠르다.

    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr)); // 인스턴스가 처음 생성됏을 대 메모리 주소

        StringBuilder buffer = new StringBuilder(javaStr); //String 으로부터 StringBulider 생성
        System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));

        buffer.append("and");
        buffer.append("android");
        buffer.append(" programming is fun"); // 문자열 추가
        System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
    }
}
