package 이펙티브자바.item1_constructor_factorymethod;

public class FactoryMethodExample {
    private int value;

    // 정적 팩터리 메서드
    public static FactoryMethodExample createInstance(int value){
        FactoryMethodExample obj = new FactoryMethodExample();
        obj.value = value;
        return obj;
    }
    public int getValue() {
        return value;
    }
    public static void main(String[]args) {
        //정적 팩터리 메서드를 사용하여 객체 생성
        FactoryMethodExample obj = FactoryMethodExample.createInstance(42);
        System.out.println("Using static factory method : " + obj.getValue());

        /* 정적 팩터리 메서드 장/단점
        *
        * 장점 :
        * 1. 팩터리 메서드에 이름을 부여할 수 있으므로 의미 있는 이름으로 객체 생성을 구체활할 수 있다.
        * 2. 객체 생성 방식을 변경하거나 확장하기가 더 유연하다. 예를 들어, 객체 캐싱, 싱글턴 패턴, 풀링 등을 쉽게
        *    구현할 수 있다.
        *
        * 단점 :
        * 1. 코드가 더 복잡해질 수 있으며, 객체 생성을 위해 추가적인 로직이 필요할 수 있다.
        *
        * 정리
        * - 정적팩터리 메서드를 사용하면 더 많은 유연성을 얻을 수 있지만, 생성자는 더 간단하고 직관적일 수 있다.
        * */
    }
}
