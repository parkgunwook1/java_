package school.ch1.together.study.ch14_inheritance.ch02_inheritance.model;

public class Airplane extends Vehicle{

    private int tire;
    private int wing;

    public Airplane(){
        super();
    }
    public Airplane(String name, double mileage, String kind, int tire, int wing) {
        super(name, mileage, kind);
        this.tire = tire;
        this.wing = wing;
    }

    // information 메서드 오버라이딩
    public String information() {
        return super.information() + ", tire : " + tire+ ", wing : " + wing;
    }
    // howToMove 메서드 오버라이딩
    public void howToMove() {
        System.out.println("바퀴를 굴리면서 달리다가 날개를 피면서 움직인다.");
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }
}
