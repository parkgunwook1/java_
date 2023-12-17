package school.alone.ch_1.static_var.singleton;

public class Company {
    // 인스턴스를 단 하나만 생성하는 디자인 패턴을 싱글톤 패턴이리고 한다.
    // 생성자가 public 이면 외부 클래스에서 인스턴스를 방대하게 생성할 수 있다. 따라서 싱클톤 패턴에는 생성자를 명시적으로 만들고 접근 제어자를 private 으로 지정해야한다.

    private static Company instance = new Company(); // 클래스 내부에 static 으로 유일한 인스턴스 생성하기
    private Company() { }

    public static Company getInstance() {  // 외부에서 참조할 수 있는 public 메서드 만들기
        if (instance == null) {
            instance = new Company();
        }
        return instance; // 유일하게 생성한 인스턴스 반환
    }
}
