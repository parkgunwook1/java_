package school.ch1.together.study.this_ex.test;

class Person {   //생성자에서 다른 생성자를 호출하는 this
    String name;
    int age;

    Person() {
        this("이름없음",1); //this 를 사용해 Person(String,int) 생성자 호출
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
