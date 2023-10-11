package school.ch1.together.study.ch3_constrictor;

public class Person { // Person 클래스에서 여러 가지 생성자를 제공한다면 이 클래스를 사용하여 인스턴스를 만드는 경우에 필요한 생성자를 골라서 사용할 수 있다.
    String name;
    float height;
    float weight;

    public Person() {} //디폴트 생성자 직접 추가

    public Person(String pname) {  // 이름을 매개변수로 입력받는 생성자
        name = pname;
        System.out.println("생성자 1" +pname);
    }

    public Person(String pname, float pheight, float pweight) { // 이름, 키, 몸무게를 매개변수로 입력 받는 생성자
        name = pname;
        height = pheight;
        weight = pweight;
        System.out.println("생성자 2");
        System.out.print(pname);
        System.out.print(pheight);
        System.out.print(pweight);
    }
}
