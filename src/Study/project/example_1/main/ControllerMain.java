package study.project.example_1.main;

import study.project.example_1.myproject.FirstController;
import study.project.example_1.pw.Controller;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
