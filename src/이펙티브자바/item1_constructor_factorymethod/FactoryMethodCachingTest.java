package 이펙티브자바.item1_constructor_factorymethod;

import java.util.HashMap;
import java.util.Map;

/* 객체 캐싱
*
* 객체 캐싱은 동일한 객체를 반복해서 생성하지 않고 이전에 생성된 객체를 재사용하는 기술을 말한다.
* 이것은 메모리 사용량을 줄이고 성능을 향상시킬 수 있다.
* */
public class FactoryMethodCachingTest {
    private int value;

    // 정적 팩터리 메서드를 사용하여 객체 캐싱
    private static Map<Integer, FactoryMethodCachingTest> cache = new HashMap<>();

    public static FactoryMethodCachingTest createInstance(int value) { // 정적 팩터리 메서드 createInstance를 사용하여 객체 생성하고 캐시에 저장한다.
        //캐시해서 해당 값의 객체를 가져오거나, 없는 경우 생성하여 캐시에 추가
        if (cache.containsKey(value)) { // containsKey(value) => 맵에서 인자로 보낸 값이 있으면 true, 없으면 false
            return cache.get(value);
        } else {
            FactoryMethodCachingTest obj = new FactoryMethodCachingTest();
            obj.value = value;
            cache.put(value, obj);
            return obj;
        }
    }
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        FactoryMethodCachingTest obj1 = FactoryMethodCachingTest.createInstance(42);
        FactoryMethodCachingTest obj2 = FactoryMethodCachingTest.createInstance(42);
        // 인스턴스 obj1, obj2 두 객체는 동일한 값을 가진 객체를 참조한다.

        // 두 객체는 동일한 객체를 참조
        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2) );

        /*
        * " createInstance " 를 변수명이라 착각할 수도 있다.
        * 하지만 createInstance는 메서드 이름이다.
        * 이 메서드는 클래스 FactoryMethodCachingTest 내에서 정의된 공개(public) 정적(static) 메서드이다.
        *
        * 정적 팩터리 메서드의 목적은 객체를 생성하고 반환하는 데 사용되는 메서드이다.
        * 이 경우, createInstance 메서드는 FactoryMethodCachingTest 클래스의 인스턴스를 생성하고 반환한다.
        * */
    }
}
