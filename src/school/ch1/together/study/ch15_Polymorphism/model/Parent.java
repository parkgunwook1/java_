package school.ch1.together.study.ch15_Polymorphism.model;

public class Parent {

    private int x;
    private int y;

    public Parent() {
    }

    public Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x : " + x + "y : " + y;
    }

    public void printParent() {
        System.out.println("부모클래스에서 호출됨.");
    }
    // 다형성 적용 후 instanceof 연산자를 쓰지 않을경우 활용할 수 있는 방법.
    public void print() {
        System.out.println("부모 클래스에서 호출");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
