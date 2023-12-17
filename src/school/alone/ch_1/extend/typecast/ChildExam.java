package school.alone.ch_1.extend.typecast;

public class ChildExam {
    public static void main(String[] args) {
        Child child = new Child(); // 부모 메소드 및 자식 메소드 다 호출 가능하다.

        Parent parent = new Child(); // 부모클래스에 있는 메소드만 호출, 단 오버라이드 된 메소드가 있다면 자식 메소드 호출

        parent.method1();
        parent.method2();

        child.method3();

    }
}
