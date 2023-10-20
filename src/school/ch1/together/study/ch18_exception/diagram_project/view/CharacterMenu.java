package school.ch1.together.study.ch18_exception.diagram_project.view;

import school.ch1.together.study.ch18_exception.diagram_project.controller.CharacterController;
import school.ch1.together.study.ch18_exception.diagram_project.exception.CharCheckException;

import java.util.Scanner;

public class CharacterMenu {


    public void menu() {
        Scanner sc =  new Scanner(System.in);

        System.out.print("문자열 : " );
        String s = sc.nextLine();

        CharacterController c = new CharacterController();
        try {
            System.out.printf("'%s' 에 포함된 영문자 개수 : %d", s, c.countAlpha(s));
        }catch (CharCheckException e) {
            e.printStackTrace();
        }

    }
}
