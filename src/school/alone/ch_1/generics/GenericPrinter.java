package school.alone.ch_1.generics;

public class GenericPrinter<T> {
    // 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍하는 것을 제네릭 프로그래밍 이라고 한다. 컴파일러가 검증하므로 안정적이다.
    // 제네릭을 사용하면 컴파일러가 자료형을 확인해 주기 때문에 안정적이면서 형 변환 코드가 줄어든다.
    private  T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() { // T 자료형 변수 material 을 반환하는 제네릭 메서드
        return material;
    }
    public String toString() {
        return material.toString();
    }
}
