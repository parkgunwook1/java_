package Study.project.example_1.main;

import Study.project.example_1.myproject.FirstController;
import Study.project.example_1.pw.Controller;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
