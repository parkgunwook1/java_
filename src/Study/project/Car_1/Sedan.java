package Study.project.Car_1;

public class Sedan extends Car{
    private String carname;

    public Sedan() {}
    public Sedan(String carname, int speed)
    {
        this.speed = speed;
        this.carname = carname;
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
        speed += 20;
    }
    public void setSpeedDown()
    {
        speed -= 20;
    }
}
