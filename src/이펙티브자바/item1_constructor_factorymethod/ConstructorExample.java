package 이펙티브자바.item1_constructor_factorymethod;


// 생성자 사용하는 방법
public class ConstructorExample {
    private int value;

    // 기본 생성자를 만들지 않으면 컴파일러가 자동으로 기본 생성자를 "public" 접근제한자로 생성함
    // 기본 생성자 "public" 생성시 외부에서 객체 무분별하게 생성할 수 있기 때문에 미리 생성.
    private ConstructorExample() {}

    public ConstructorExample(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public static void main(String[]args) {
        // 매개변수 있는 생성자를 사용하여 객체 생성
        ConstructorExample obj = new ConstructorExample(42);
        System.out.println(" Using constructor : " + obj.getValue());

        /* 생성자의 장 단점
        *
        * 장점 :
        * 1. 간단하며 직관적인 방법으로 객체를 생성할 수 있다.
        * 2. 코드가 더 명확하고 읽기 쉽다.
        *
        * 단점 :
        * 1. 생성자에 이름을 부여할 수 없으므로 여러 생성자 오버로딩의 경우 매개변수 형식만으로 메서드를 식별해야한다.
        * 2. 객체 생성 방식을 확장하려면 새로운 생성자를 작성해야 하므로 변경에 취약할 수 있다.
        * */
    }
}
