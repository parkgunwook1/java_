package school.ch1.together.homework.ch15_inheritance_test.controller;

import school.ch1.together.homework.ch15_inheritance_test.model.Circle;

public class CircleController {
    private Circle c = new Circle();

    // 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
    // 면적 : PI * 반지름 * 반지름
    public String calcArea(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        return "면적 : " + c.toString()+ "/" + Math.PI * radius * radius;


    }

    // 둘레 : pi * 반지름 * 2
    public String calcCircum(int x, int y, int radius) {
        c = new Circle(x, y, radius) ;
        return "둘레 : " + c.toString() + "/" + Math.PI * radius * radius *2;
    }
}
