package school.alone.ch_1.interfaceex.test;

public class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("X");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }
}
