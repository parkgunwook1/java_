package school.ch1.together.study.ch14_inheritance.run;

import school.ch1.together.study.ch14_inheritance.vo.Tv;
import school.ch1.together.study.ch14_inheritance.vo.Desktop;
import school.ch1.together.study.ch14_inheritance.vo.SmartPhone;

/*
* 매 클래스마다 중복된 코드들을 일일이 기술해두게되면 수정, 추가, 삭제시 매번 일일이 찾아가서 수정을 해야하는 번거로움이 있다.
* ex) 필드 수정, 새로운 필드 추가시
*
* 상속이라는 개념을 적용시켜서 매 클래스마다 "중복된" 필드, 메소드들을
* 단 한번 또 하나의 클래스에 정의해둔뒤, 해당 (부모)클래스를 상속받아서 부모클래스의 필드와 메소드들을 가져다 쓰는 방식으로
* 코드의 중복을 피해야 한다.
*
* */

public class Run {
    public static void main(String[] args) {
        Desktop d = new Desktop("삼성","d-01","삼성데탑",1_500_000,true);

        SmartPhone s = new SmartPhone("애플","s-01","애플15",1_500_000, "apple");

        Tv t = new Tv("엘지", "t-01","슬림티비",3_500_000,60);



        System.out.println(d.information());
        System.out.println(s.information());
        System.out.println(t.information());
    }
}
