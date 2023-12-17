package school.alone.ch_1.extend.supers;

public class SmartPhone extends Phone{

    public SmartPhone(String model, String color) {
        super(); // 컴파일시 자동 추가
        this.model = model;
        this.color = color;
        System.out.println("smartphone 생성자 실행");
    }
}
