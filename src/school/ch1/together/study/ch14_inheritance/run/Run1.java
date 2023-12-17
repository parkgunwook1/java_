package school.ch1.together.study.ch14_inheritance.run;

import school.ch1.together.study.ch14_inheritance.vo.SmartPhone;
import school.ch1.together.study.ch14_inheritance.vo.Tv;
import school.ch1.together.study.ch14_inheritance.vo1.Desktop;

public class Run1 {
    public static void main(String[] args) {

        Desktop d = new Desktop("삼성","d-01","삼성데탑",1_500_000,true);

        SmartPhone s = new SmartPhone("애플","s-01","애플15",1_500_000, "apple");

        Tv t = new Tv("엘지", "t-01","슬림티비",3_500_000,60);

        /*
        * 실행하고자 하는 메소드가 자식클래스에 없다면 자동으로 부모클래스에 있는 메소드가 실행됨.
        * 다느 자식클래스에서 재정의된 메소드가 있을경우 자식클래스에 있는 메소드가 실행에서 우선권을 가진다.
        * */

        System.out.println(d.information());

        /*
        * 상속의 장점
        * - 보다 적은 양의 코드로 새로운 클래스들을 작성 가능
        * - 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할때 용이함.
        *    => 프로그램의 생산성 증대 및 유지보수에 크게 기여한다.
        *
        * 상속의 특징
        * - 클래스간의 상속은 다중상속이 불가능함(단일 상속만 가능)
        * - 명시되어있지 않지만 모든클래스는 Object 클래스 후손
        *    => Object 클래스에 있는 메소드를 모든 클래스에서 사용이 가능함
        *    => Object 클래스에 있는 메소드가 마음에 안들면 오버라이딩을 통해 재정의가 가능하다.
        * */
    }
}
