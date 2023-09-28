package study.bookstudy1.ch5;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "감자");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //final 필드는 수정 가능, final 필드는 값을 변경할 수 없음.
    }

}
