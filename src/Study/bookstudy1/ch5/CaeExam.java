package study.bookstudy1.ch5;

public class CaeExam {
    public static void main(String[] args) {
        Car car = new Car("그렌저","검정",90, 50);

        System.out.println("모델명 : " + car.model);
        System.out.println("색상:" + car.color);
        System.out.println("최고속도 : " + car.maxSpeed);
        System.out.println("현재속도 : " + car.speed);

        car.speedUp();

        // 메소드 오버로딩
        int a = car.plus(30);
        System.out.println(a);

        int b = car.plus(40,50);
        System.out.println("속도가 " + b + "으로 올라갔습니다.");


    }
}
