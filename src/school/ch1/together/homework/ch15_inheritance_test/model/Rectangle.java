package school.ch1.together.homework.ch15_inheritance_test.model;

public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle() {

    }
    public Rectangle(int x, int y, int width, int height) {

    }
    @Override
    public String toString() { // 필드에 담긴 데이터를 반환하는 메소드
        return "";
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
