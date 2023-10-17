package school.alone.ch_1.thisex.superex;

class Parent { int a =10; }
    /*
    * super 키워드는 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는데 사용하는 참조 변수이다.
    * 인스턴스 변수의 이름과 지역 변수의 이름이 같을경우 인스턴스 변수 앞에 this 키워드를 사용하여 구분할 수 있었다.
    *
    * 위와 마찬가지로 부모 클래스 멤버와 자식 클래스 멤버 이름이 같을 경우 super 키워드를 사용하여 구별할 수 있다.
    * this 와 마찬가지로 super 참조 변수를 사용할 수 있는 대상도 인스턴스 메소드 뿐. 클래스 메소드는 사용 x
    *
    * this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용한다면, super() 메소드는 부모 클래스의 생성자를 호출할 때 사용한다.
    *
    * */
class Child extends Parent {

//    int a = 20; -> 지역변수, this 참조변수는 값이 20, super 참조변수는 부모클래스를 호출함으로 10이 출력
    public void display() {
        System.out.println(a); // 10
        System.out.println(this.a); // 10
        System.out.println(super.a);// 10

        // Parent 부모 클래스에만 a의 변수가 초기화 되어있다.
        // 지역변수, this 참조변수, super 참조변수는 모두 같은 값을 출력한다.
    }
}
public class Inheritance02 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}