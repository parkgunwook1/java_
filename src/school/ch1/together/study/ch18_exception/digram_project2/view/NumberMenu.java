package school.ch1.together.study.ch18_exception.digram_project2.view;

import school.ch1.together.study.ch18_exception.digram_project2.controller.NumberController;
import school.ch1.together.study.ch18_exception.digram_project2.exception.NumRangeException;

import java.util.Scanner;

public class NumberMenu {


    public void menu() {
        Scanner sc = new Scanner(System.in);
        NumberController controller = new NumberController();

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        try {
            System.out.println(num1 + "은" + num2 +"의 배수인가?" + controller.checkDouble(num1,num2));
        } catch (NumRangeException e) {
            e.printStackTrace();
        }
    }
}
