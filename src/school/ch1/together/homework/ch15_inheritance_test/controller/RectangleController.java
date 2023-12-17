package school.ch1.together.homework.ch15_inheritance_test.controller;

import school.ch1.together.homework.ch15_inheritance_test.model.Rectangle;

public class RectangleController {
    private Rectangle r = new Rectangle();

    // 둘레 : 2 * (너비 + 높이)
    public String calcPerimeter(int x, int y, int height, int width) {
       r = new Rectangle(x,y,height,width);
       return "둘레 : " + r.toString() + "/" +2 * (height+width);

//  오답:      int perimeter = 2 * (height + width);
//        return "둘레: " + perimeter;
    }

    // 면적 : 너비 * 높이
    public String calcArea(int x, int y, int height, int width) {
        r = new Rectangle(x,y,height,width);
        return "면적 : " + toString() + "/" + width * height;

/* 오답       int area = height * width;
        return "면적: " + area;*/
    }



}
