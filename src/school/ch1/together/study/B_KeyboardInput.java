package school.ch1.together.study;

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

         System.out.print("이름 : ");
         String name = sc.nextLine();

         System.out.print("성별(m/f) :");
         String gender = sc.nextLine();
         char newGender = gender.charAt(0);
         // charAt(돕고자하는 문자의 위치) : String 클래스 내부에 존재하는 일반 메서드로 문자열에서 내가 뽑고자하는 위치의 문자를 반환해줌

         System.out.println(name + "님의 성별은" + newGender + "입니다.");
    }
}
