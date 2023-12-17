package school.ch1.together.homework.praticle1.func;

import java.util.Scanner;

public class VariablePractice1 {
    public void test1() {
        // 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
        // 키 180인 20살 남자 박건욱님 반갑습니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력하세요:");
        String name = sc.nextLine();
        sc.nextLine();

        System.out.print("성별을 입력하세요(남/여)");
        char gender = sc.nextLine().charAt(0);

        System.out.print("나이 입력하세여 :");
        int age = sc.nextInt();

        System.out.print("키를 입력하세요:");
        double height = sc.nextDouble();

        System.out.println("이름은" + name + "성별은" + gender  + "나이는" + age + "키는" + height + " 입니다.");
    }
}
