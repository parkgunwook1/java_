package school.ch1.together.study.ch16_abstractandinterface.homework2.model;

public class Dog extends Animal{

    public static final String PLACE = "애견카페";
    private int weight;

    public Dog() {}

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println(super.toString() + "몸무게는" + weight + "kg 입니다., 서식지는" + PLACE + "입니다.");
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
