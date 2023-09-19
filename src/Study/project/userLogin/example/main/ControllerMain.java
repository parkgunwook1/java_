package Study.project.userLogin.example.main;

import Study.project.userLogin.example.myproject.FirstController;
import Study.project.userLogin.example.pw.Controller;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
