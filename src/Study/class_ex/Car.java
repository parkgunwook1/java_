package Study.class_ex;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){} // 1 생성자

    Car(String model) { // 2생성자
        this.model = model;
    }
    Car(String model, String color) { // 3생성자
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed) { // 4생성자
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
