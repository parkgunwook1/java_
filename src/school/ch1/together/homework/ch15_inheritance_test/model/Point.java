package school.ch1.together.homework.ch15_inheritance_test.model;

public class Point {
    private int x;
    private int y;

    public Point() {

    }
    public Point(int x, int y) {

    }
    @Override // 필드에 담긴 데이터를 반환하는 메소드
    public String toString() {
        return "x :" + x + "y :" + y;
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
