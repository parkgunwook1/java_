package school.ch1.together.homework.ch15_inheritance_test.model;

public class Circle extends Point {
    private int radius;

    public Circle() {

    }
    public Circle(int x, int y, int radius) {

    }
    @Override
    public String toString() { // 필드에 담긴 데이터를 반환하는 메소드
        return super.toString() + "x : " +  ", y :" + ", radius";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
