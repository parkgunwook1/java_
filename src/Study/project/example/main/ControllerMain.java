package Study.project.example.main;

import Study.project.example.myproject.FirstController;
import Study.project.example.pw.Controller;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
