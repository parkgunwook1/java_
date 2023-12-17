package 이펙티브자바.item3_singletonpattern;

public class Private_Constructor {
    // 정적 멤버 변수로 유일한 인스턴스를 저장
    private static Private_Constructor instance = new Private_Constructor();

    // private 생성자로 외부에서의 객체 생성을 방지
    private Private_Constructor() { }

    // 유일한 인스턴스를 반환하는 메서드
    public static Private_Constructor getInstance() {
        return instance;

        /* Private 생성자를 사용한 싱글턴:
        *
        * - Private_Constructor 클래스 내에 private 생성자를 정의하여 외부에서 객체의 생성을 방지한다.
        * - 정적 멤버 변수로 유일한 인스턴스를 가진다.
        * - getInstance 메서드를 사용하여 유일한 인스턴스를 반환한다.
        * */
    }
}


