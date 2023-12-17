package school.alone.ch_1.extend.supers2;

public class SupersonicAirplane extends Airplane{

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행");
        }else {
            super.fly(); // = >  Airplane 객체 fly() 메소드 호출
                         // 부모 메소드의 fly를 오버라이딩 하였지만, super 키워드를 이용해 부모 클래스의 메서드를 호출할 수 있다
                         // 자식 메서드에서 코드를 재작성할 필요가 없다.
        }
    }
}
