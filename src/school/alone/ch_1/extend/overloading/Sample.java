package school.alone.ch_1.extend.overloading;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
        int age;

    void setName(String name, int age) { // 오버로딩 : 매개변수 개수만 바꾸면서 오버로딩 된 많은 메소드를 사용할 수 있음,
            this.name = name;
            this.age = age;
        }
    void setName(String name) { // 오버라이딩 : 부모 생성자를 하위 클래스에서 바꿀 수 있음
        super.setName(name+"입니다.");
    }
}

public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("park",25);
        System.out.println(dog.name + dog.age);
        dog.setName("park");
        System.out.println(dog.name);

    }
}
