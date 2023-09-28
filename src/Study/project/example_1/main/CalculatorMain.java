package Study.project.example_1.main;

import Study.project.example_1.util.Calculator;

public class CalculatorMain {
    public static void main(String[]args) {
        Calculator cal = new Calculator();
        int value = cal.plus(50,100);
        System.out.println(value);
    }
}
