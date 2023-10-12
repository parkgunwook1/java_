package school.ch1.together.study.ch10_field.run;

import school.ch1.together.study.ch10_field.Circle;
import school.ch1.together.study.ch10_field.FieldTest1;
import school.ch1.together.study.ch10_field.FieldTest2;
import school.ch1.together.study.ch10_field.FieldTest3;

public class Run {
    public static void main(String[] args) {
        FieldTest1 ft = new FieldTest1(); // -> global 전역변수 할당

        ft.test(10); // test 메소드 호출시 매개변수로 100값을 전달함. (지역변수 num, local 생성)
                          // 메소드 종료시 num, local 소멸

        FieldTest2 ft2 = new FieldTest2();

        // public -> 어디서근 가능.
        System.out.println(ft2.pub);

        // protected -> 같은 패키지에서만 접근가능
//        System.out.println(ft2.pro);

        // default - > 같은 패키지에서만 접근 가능

        // private -> 같은클래스에서만 접근가능


        System.out.println(FieldTest3.num); // 객체 생성하지 않아도 static 접근 가능
        FieldTest3.test();



        Circle cr = new Circle();


        cr.getSizeOfCircle();
        cr.getAreaOfCircle();
        cr.incrementRadius();
        cr.getAreaOfCircle();
        cr.getSizeOfCircle();


    }
}
