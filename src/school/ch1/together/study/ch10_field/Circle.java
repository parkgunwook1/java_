package school.ch1.together.study.ch10_field;

public class Circle {
    private final static double PI = 3.14;
    private int radius = 1;


    public Circle() {

    }
    public void incrementRadius() {
        radius++;
    }
    public void getAreaOfCircle() {
        // 원 둘레 : 2 * 파이 * 반지름
        System.out.println(2 * PI * radius );

    }
    public void getSizeOfCircle() {
        // 반지름 * 반지름 * 파이
        System.out.println(radius * radius * PI);

    }
}
