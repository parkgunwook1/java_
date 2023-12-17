package school.ch1.together.study.ch3_constructor;

public class PersonTest {
    public static void main(String[] args) {
                                  // Person() -> 생성자
    Person person = new Person(); // 생성자가 하는 일은 클래스를 처음 만들 때 멤버 변수나 상수를 초기화하는 것이다. 생성자를 따로 만들지 않아도 default 생성자가 생성된다. 반환값이 없다.
    person.name = "박건욱";
    person.weight = 85.5f;
    person.height = 100.0f;

    Person person1 = new Person("박건욱");

    Person person2 = new Person("박건욱",80.0f,10.0f);


    }
}
