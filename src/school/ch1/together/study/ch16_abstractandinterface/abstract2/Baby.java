package school.ch1.together.study.ch16_abstractandinterface.abstract2;

public class Baby extends Person implements Basic{

    public Baby() {}

    public Baby(String name, double weight, int health) {
        super(name, weight, health);
    }
    @Override
    public String toString() {
        return "Baby [toString() = " + super.toString() + " ]";
    }
    @Override
    public void eat() {
        super.setWeight(super.getHealth() + 1);
        super.setHealth(super.getHealth() + 3);

    }

    @Override
    public void sleep() {
        super.setHealth(super.getHealth() + 1);
    }
}
