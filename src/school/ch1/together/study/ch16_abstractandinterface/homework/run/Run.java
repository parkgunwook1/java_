package school.ch1.together.study.ch16_abstractandinterface.homework.run;

import school.ch1.together.study.ch16_abstractandinterface.homework.controller.PhoneController;

public class Run {
    public static void main(String[] args) {
        PhoneController pc = new PhoneController();
        String [] result = pc.method();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            System.out.println();
        }
    }
}
