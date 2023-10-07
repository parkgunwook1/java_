package school.ch1.together.homework.work2;

import java.util.Scanner;

public class pratice {
    public void method() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1이상의 숫자를 입력하세요");
        int a = sc.nextInt();

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i < a; i++) {
            if (a < 1) {
                System.out.println("1 이상의 숫자를 입력해주세여.");
                method();
                return;
            }else if (i < a) {
                num1 = i;
                num2 = a;
            }else num2 = a;
                  num1 = i;
        }for (int i = num1; i < num2; i++) {
            System.out.println(num1);
        }
    }
}
