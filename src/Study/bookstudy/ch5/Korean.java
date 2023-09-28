package study.bookstudy.ch5;

public class Korean {
    // 인스턴스 필드와 정적 필드는 언제든지 값을 변경할 수 있다.
    // 그러나 경우에 따라서 값을 변경하는 것을 막고 읽기만 허용해야 할 때가 있다. 이때 final 필드와 상수를 선언해 사용함.

    final String nation = "대한민국";
    final String ssn;

    String name;

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
