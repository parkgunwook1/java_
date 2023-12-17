package school.alone.ch_1.thisex;

 class Car {
     /*
      * this 참조 변수는 인스턴스가 바로 자기 자신을 참조하는 데 사용하는 변수이다.
      * 이러한 this 참조 변수는 해당 인스턴스의 주소를 가리키고 있다.
      *
      *
      * */
     private String modelName;

     private int modelYear;

     private String color;

     private int maxSpeed;

     private int currentSpeed;




    Car(String modelName, int modelYear, String color, int maxSpeed) {

        this.modelName = modelName;

        this.modelYear = modelYear;

        this.color = color;

        this.maxSpeed = maxSpeed;

        this.currentSpeed = 0;
    }

        // 위의 예제처럼 생성자의 매개변수 이름과 인스턴스 변수의 이름이 같을 경우에는 인스턴스
        // 변수 앞에 this 키워드를 붙여 구문해야만 한다.

        // 클래스 메소드에서는 사용이 안된다.
        // this 메소드는 생성자 내부에서만 사용할 수 있으며, 같은 클래스의 다른 생성자를 호출할 때 사용한다.

    Car() {
        this("소나타", 2012, "검정색",160);
        // this() 메소드를 이용하여 첫 번째 생성자를 호출한다.
        // 이렇게 내부적으로 다른 생성자를 호출하여 인스턴스 변수를 초기화할 수 있다.
        }
     public String getModel() {

         return this.modelYear + "년식 " + this.modelName + " " + this.color;
        }
    }
public class Method05 {
    public static void main(String[] args) {
        Car tcpCar = new Car(); System.out.println(tcpCar.getModel());
    }
}
