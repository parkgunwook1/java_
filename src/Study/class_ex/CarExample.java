package Study.class_ex;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car(); // 1 생성자 호출
        System.out.println("Car1.company :" + car1.company);
        System.out.println("==== Car1 생성자====");

        Car car2 = new Car("KIA");
        System.out.println("Car2.company : " + car2.company);
        System.out.println("Car2.model : " + car2.model);
        System.out.println("==== Car2 생성자====");

        Car car3 = new Car("현대","RED");
        System.out.println("Car3.company : " + car3.company);
        System.out.println("Car3.model : " + car3.model);
        System.out.println("Car3.color : " + car3.color);
        System.out.println("==== Car3 생성자====");

        Car car4 = new Car("삼성","블랙",30);
        System.out.println("Car4.company : " + car4.company);
        System.out.println("Car4.model : " + car4.model);
        System.out.println("Car4.color : " + car4.color);
        System.out.println("Car4.maxSpeed : " + car4.maxSpeed);
        System.out.println("==== Car4 생성자====");
    }
}
