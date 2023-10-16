package school.ch1.together.study.ch15_Polymorphism.model;

public class Child2 extends Parent{

    private int n;

    public Child2() {

    }
    public Child2(int x,int y, int n) {
        super.setX(x);
        super.setY(y);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    @Override
    public String toString() {
        return super.toString()+", n :" + n;
    }
    public void printChild2() {
        System.out.println("두번째 자식에서 호출됨");
    }
    @Override
    public void print() {
        System.out.println("child2 자식 호출");
    }
}
