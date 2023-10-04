package study.project.Car_1;

class Truck extends Car
{
    private String carname;

    public Truck() {}

    public Truck(String carname, int speed)
    {
        this.carname = carname; //차 이름 설정
        this.speed = speed; //차 속도 설정, 부모변수에 입력
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
        super.speed += 5;
    }

    public void setSpeedDown()
    {
        super.speed -= 5;
    }
}