package school.ch1.together.study.ch16_abstractandinterface.homework2.controller;

import school.ch1.together.study.ch16_abstractandinterface.homework2.model.Animal;
import school.ch1.together.study.ch16_abstractandinterface.homework2.model.Cat;
import school.ch1.together.study.ch16_abstractandinterface.homework2.model.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("야옹", "먕", "밍", "검정");
        animals[1] = new Dog("막둥", "슈나우저", 5);
        animals[2] = new Cat("옹야", "뭉", "밍", "옐로");
        animals[3] = new Dog("막내", "슈나우저", 10);
        animals[4] = new Dog("막슈", "슈나우저", 15);

        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
//        for (Animal ani : animals) {
//            ani.speak();
//        }
    }
}
