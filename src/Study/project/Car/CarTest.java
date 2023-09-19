package Study.project.Car;

public class CarTest
{
    public static void main(String[] args)
    {
        Car[] carList = new Car[5];

        carList[0] = new Car("재규어"); //부모 클래스 호출
        carList[1] = new Sedan("K5", 100);  //자식 클래스 호출
        carList[2] = new Truck("포터", 100); //자식 클래스 호출
        carList[3] = new Sedan("아반떼", 100);
        carList[4] = new Truck("볼보", 100);

        for(int i = 0; i < carList.length; i++) //배열 수 만큼 출력
        {
            System.out.println("차명 : " + carList[i].getName()); //차 이름 출력
            System.out.println("현재 속도 : " + carList[i].getSpeed()); //현재 속도 출력
            System.out.println("속도 업!");
            carList[i].setSpeedUp(); //속도 업
            System.out.println("현재 속도 : " + carList[i].getSpeed());
            System.out.println("속도 다운!");
            carList[i].setSpeedDown();
            System.out.println("현재 속도 : " + carList[i].getSpeed());
            System.out.println("속도 다운!");
            carList[i].setSpeedDown();
            System.out.println("현재 속도 : " + carList[i].getSpeed());
            System.out.println();
        }
    }
}