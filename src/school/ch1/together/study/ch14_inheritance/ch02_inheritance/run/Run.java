package school.ch1.together.study.ch14_inheritance.ch02_inheritance.run;

import school.ch1.together.study.ch14_inheritance.ch02_inheritance.model.Airplane;
import school.ch1.together.study.ch14_inheritance.ch02_inheritance.model.Car;
import school.ch1.together.study.ch14_inheritance.ch02_inheritance.model.Vehicle;

public class Run {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("탈것",0.5,null);
        Car c = new Car("테슬라",12.5,"전기차",4);
        Airplane a = new Airplane("현대",12.5,"비행",4,5);

        System.out.println(v.information());
        System.out.println(a.information());
        System.out.println(c.information());

        c.howToMove();
        a.howToMove();
        v.howToMove();
    }
}
