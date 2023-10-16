package school.ch1.together.study.ch15_Polymorphism.model;

public class Child1 extends Parent{

    private int z;

    public Child1() {

    }
    public Child1(int x,int y, int z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    @Override
    public void print() {
        System.out.println("child1 자식 호출");
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    @Override
    public String toString() {
        return super.toString()+", z :" + z;
    }
    public void printChild1() {
        System.out.println("첫번째 자식에서 호출됨");
    }
}
