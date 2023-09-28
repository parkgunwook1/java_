package study.bookstudy1.ch5;

public class Car {

    String model;
    String color;
    int maxSpeed;
    int speed;

    public Car (String model, String color, int maxSpeed, int speed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;

    }
    void speedUp() {
        System.out.println("속도를 올립니다.");
    }
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    int plus(int x) {
        return x;
    }

    // 인스턴스 메소드와 정적 메소드의 차이
    public class Calculator {
        // 인스턴스 필드 및 메소드
        String color;
        void setColor(String color) { this.color = color;}


        // 정적 메소드
        static int plus(int x, int y) { return x + y;}
        static int minus(int x, int y) {return x - y;}

    // 정적 멤버 접근 방법은 도트(.) 연산자로 접근하면 된다. 예) Calculator.plus
    // 정적 멤버, 정적 블록은 객체가 없어도 실행된다는 특징 때문에 내부에 인스턴스 필드나 인스턴스 메소드 사용 불가함.
        // 또한 객체 자신의 참조인 this도 사용할 수 없다.
    }
}
