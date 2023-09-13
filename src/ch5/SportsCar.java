package ch5;

public class SportsCar extends Car1{
    //부모가 기본생성자 없기 때문에 반드시 super()를 호출한다.
    public SportsCar(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("사룬규동으로 동작한다.");

    }
}
