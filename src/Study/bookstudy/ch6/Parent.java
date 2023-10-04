package study.bookstudy.ch6;

public class Parent {

    public void method1() {
        System.out.println("parent-method1");
    }
    public void method2() {
        System.out.println("parent-method");
    }
}
class Child extends Parent {
    public void method2() {
        System.out.println("child-method");
    }
    public void method3() {
        System.out.println("child-method2");
    }
}
class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = new Child();

        parent.method1();
        parent.method2();

    }
}
