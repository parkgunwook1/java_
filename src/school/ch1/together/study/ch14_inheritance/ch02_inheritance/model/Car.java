package school.ch1.together.study.ch14_inheritance.ch02_inheritance.model;

public class Car extends Vehicle{

    private int tire;
    public Car() {

    }
    public Car(String name, double mileage, String kind, int tire) {
        super(name, mileage, kind);
        this.tire =tire;
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }
    @Override
    public String information() { // Override -> 제대로 오버라이딩 되었는지 체크해주는 어노테이션
        return super.information()+", tire : " + tire;
    }
    @Override
    public void howToMove() {
        System.out.println("바퀴를 굴러서 움직인다.");
    }
}
