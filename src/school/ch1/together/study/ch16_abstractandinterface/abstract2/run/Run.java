package school.ch1.together.study.ch16_abstractandinterface.abstract2.run;

import school.ch1.together.study.ch16_abstractandinterface.abstract2.Baby;
import school.ch1.together.study.ch16_abstractandinterface.abstract2.Basic;
import school.ch1.together.study.ch16_abstractandinterface.abstract2.Mother;

public class Run {
    public static void main(String[] args) {
        // 인터페이스 적용 전
//        Person p1 = new Mother("박건욱", 50, 50, "출산");
//        Person p2 = new Baby("박건", 70, 5);
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        p1.eat();
//        p1.sleep();
//
//        p2.sleep();
//        p2.eat();

        // 인터페이스 적용 후
//        Basic b1 = new Basic();
        Basic b1 = new Mother("정선이",77,77,"출산");
        Basic b2 = new Baby("박건욱",4,34); // implements 를 사용하고 있기 때문에 업캐스팅이 발생한것.

    }
}
