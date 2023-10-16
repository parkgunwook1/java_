package school.ch1.together.study.ch14_inheritance.ch02_inheritance.model;

public class Vehicle {

    private String name;
    private double mileage;
    private String kind;

    public Vehicle() {

    }

    public Vehicle(String name, double mileage, String kind) {
        this.name = name;
        this.mileage = mileage;
        this.kind = kind;
    }

    public String information() {
        return "name : " + name + ", mileage : " + mileage+ ", kind : " + kind;
    }

    public void howToMove() {
        System.out.println("움직인다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
