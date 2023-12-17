package school.ch1.together.study.ch9_object.abstraction.model.vo;

public class Student {

    /*
    * 필드 = 멤버번수 = 인스턴스 변수
    *
    *
    * */

    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // this 사용 이유 : 필드명과 매개변수명이 동일한 경우 {} 영역 내부에선 선언한 변수가 우선순위가 더 높기 때문이다.
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
