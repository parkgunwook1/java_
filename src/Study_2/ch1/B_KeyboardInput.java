package Study_2.ch1;

import java.util.Scanner;

public class B_KeyboardInput {

    public void inputTest1() {

    Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름은 무엇 입니까: " );
        String name = sc.nextLine();

        System.out.print("당신의 나이는 몇살입니까? ");
        int age = sc.nextInt();

        // 엔터 키 처리
        sc.nextLine();

        System.out.print("당신의 키는 몇 cm입니까?");
        double height = sc.nextDouble();

        sc.nextLine();

        System.out.print("당신의 사는곳은 어디입니까 :");
        String address = sc.nextLine();

        System.out.println("" + "당신이 사는곳은 " + address + "당신의 이름은" + name +"이고, " + "나이는" + age +"이며" + "키는" + height + "입니다." );
    }
     public void inputTest2() {

        Scanner sc = new Scanner(System.in);
    }
}
