package study.project.Car_1;

public class Car {
    private String carname; //차 이름

    protected int speed; // 차 속도 수정해야 하기 때문에 protected

    public Car() {}
    public Car(String carname) //생성자
    {
        this.carname = carname;
        this.speed = 100;
    }
    public String getName()
    {
        return this.carname;
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public void setSpeedUp()
    {
        speed += 10;
    }
    public void setSpeedDown()
    {
        speed -= 10;
    }
}
