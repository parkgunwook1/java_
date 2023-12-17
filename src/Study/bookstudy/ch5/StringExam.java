package study.bookstudy.ch5;

public class StringExam {
    public static void main(String[] args) {
    // String 변수에 문자열 리터럴을 대입하는 것이 일반적이다
    // new 연산자는 새로운 객체를 만드는 연산자로 객체 생성 연산자라고 한다.
    // 리터럴로 생성하느냐, new 연산자로 생성하느냐에 따라 비교 연산자의 결과가 달라진다.

    String name1 = "홍길동";
    String name2 = "홍길동";
    String name3 = new String("홍길동");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println("--------------------------");

    // 내부 문자열 비교할 경우에는 String 객체의 equals() 메소드 사용
    boolean result = name1.equals(name2);
    boolean result1 = name1.equals(name3);

        System.out.println(result);
        System.out.println(result1);

    }
}
