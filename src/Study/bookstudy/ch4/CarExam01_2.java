package study.bookstudy.ch4;

public class CarExam01_2 {
    public static void main(String[]args) {
        Bus_2 b1 = new Bus_2();
        b1.run();
        b1.Stop();

        System.out.println("-------------------");

        Car_2 c1 = new Car_2();
        c1.run();
        c1.speedup();

        System.out.println("-------------------");

        Car_2 c2 = new Bus_2(); // 버스는 자동차다.
        c2.speedup();
        c2.run();

    }
}
