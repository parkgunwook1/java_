package school.alone.ch_1.extend.supers1;

public class SmartPhone extends Phone{

    public SmartPhone(String model, String color) {
        super(model, color);  // < 부모 클래스의 생성자가 매개변수가 있을시 자료형 갯수가 반드시 동일해야한다.
        System.out.println("smartphone 생성자 실행");
    }
}
