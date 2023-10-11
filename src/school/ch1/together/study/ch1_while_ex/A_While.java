package school.ch1.together.study.ch1_while_ex;

import java.util.Scanner;

public class A_While {
    Scanner sc = new Scanner(System.in);
    public void method1() {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를" + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
    }
    public void method2() {

        int i = 0; // 초기식

        while(i < 5) { // 조건식
            System.out.println("안녕하세요");
            i++; // 증감식
        }
        System.out.println(i);
    }
    public void method3() {
        int i = 1;

        while (i <= 10) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
                }
            i++;
            }
        }
    public void method4() {
        // 1부터 랜덤값(~100) 까지의 총 합계
        int random = (int) (Math.random() * 100 +1);

        int sum = 0;

        int i = 1;
        while (i <= random) {
            sum += i;
            i++;
        }
        System.out.printf("1부터 %d 까지의 총 합계 : %d ", random, sum);
    }
    public void method5() {
        String str = sc.nextLine();

        int i = 0;
        while(i <= str.length() -1 ) {
            System.out.println(str.charAt(i));
            i++;
        }
    }
    public void method6() {

        while(true) {

            int random =(int) (Math.random() * 100 + 1);

            System.out.println("random : " + random);

            if (random % 3 == 0) {
                break;
            }
        }
    }
    public void method7() {
        // 매번 반복적으로 사용자에게 양수를 입력받아 1 ~ 사용자가 입력한수까지 출력
        // 단 , 정상적으로 양수를 입력했을시에만 1 ~ 사용자가 입력한 수까지 출력한 후 종료
        // 양수가 아닌 숫자를 입력시 잘못입력, 다시 입력해즈세요 출력후 재입력

        while(true) {
            System.out.println("정수 입력해주세요 (1이상) :");
            int a = sc.nextInt();

            if (a > 0) {
                for (int i = 1; i <= a; i++) {
                    System.out.println(i + " ");
                }
                break;
            }
            System.out.println("잘못 입력, 다시 입력해주세요");
        }
    }
    public void method8() {
        // 1부터 10까지 홀수만을 출력

        for (int i = 1; i < 9; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
    public void method9() {

        int sum = 0;
        for (int i =1; i <= 100; i++) {
            if (i % 6 == 0) {
                continue;
            }
            sum += i;
            }
        System.out.println(sum);
        }
    public void method10() {
        // 2단 ~ 9단까지 모든 구구단을 출력 하되, 4의 배수단은 제외하고 출력

        for (int i = 1; i <= 9; i++) {
            if (i % 4 == 0) continue;
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
    public void method11() {
        System.out.println("정수 입력 : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j-- )
                System.out.print("*");
            System.out.println();
        }

    }
    public void method12() {
        System.out.println("정수 입력 : ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


