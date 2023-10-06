package school.ch1.together.study.if_ex.switchex;

import java.util.Scanner;

public class B_Switch {

    /*switch 문과 if문은 동일한 조건문이다.
     * if -> 조건식을 복잡하게 기술 가능, 범위 제시 가능
     * switch -> 정확한 값의 조건만 기술(동등비교만 수행가능)
     */
    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 ~ 3 사이의 정수 입력 : ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("빨간줄");
        } else if (num == 2) {
            System.out.println("파록불");
        } else if (num == 3) {
            System.out.println("초록불");
        } else {
            System.out.println("잘못 입력됐습니다.");
            return;
        }
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 ~ 3 사이의 정수 입력 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("빨간불 입니다.");
                break;
            case 2:
                System.out.println("파란불 입니다.");
                break;
            case 3:
                System.out.println("초록 불입니다.");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }
    }

    public void method3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("구매할 과일(사과,바나나,복숭아)를 입력 : ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "사과":
                System.out.println(fruit + "1000원");
                break;
            case "바나나":
                System.out.println(fruit + "2000원");
                break;
            case "복숭아":
                System.out.println(fruit + "5000원");
                break;
        }
    }

    public void method4() {
        Scanner sc = new Scanner(System.in);

        int level = sc.nextInt();

        switch (level) {
            case 1:
                System.out.print("관리자 권환, ");
            case 2:
                System.out.print("글쓰기 권환,");
            case 3:
                System.out.print("읽기 권환");
        }
    }

    public void method5() {
        /*정수를 이용해서 4자리 비밀번호를 만들려고 하는데
         이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
         중복 값이 있으면 ‘중복 값 있음‘
         자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
         단, 제일 앞자리 수의 값은 1~9 사이 정수*/
        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호 4자리를 입력해주세요");

        int num = sc.nextInt();
        switch (num) {
            case 1:
                if (num < 10 || num <= 1) {
                    System.out.println(num);
                } else System.out.println("1부터 10까지만 앞자리로 올 수 있습니다.");
            case 2:
                if (num < 10 || num <= 1 && num != num) {
                    System.out.println(num);
                } else System.out.println("비밀번호는 중복될 수 없습니다.");
        }
    }

    public void method6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n 1. 입력 \n 2. 수정 \n 3. 조회 \n 4. 삭제 \n 7. 종료");
        System.out.print("입력 해주세요 : ");
        int a = sc.nextInt();



        switch (a) {
            case 1:
                String b = sc.nextLine();
                System.out.println(b);
            case 2:
                System.out.println("수정 메뉴");
            case 3:
                System.out.println("조회 메뉴");
            case 4:
                System.out.println("삭제 메뉴");
            default:
                System.out.println("종료 되었습니다.");
                return;
        }
    }
    public void method7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("짝수 홀수 맞추는 기계 입니다.");

        int a = sc.nextInt();
        switch (a) {
            case 1:
                if (a > 0 && a % 2 == 0) {
                    System.out.println("짝수다");
                }break;
            case 2:
                if (a > 0 && a % 2 == 1) {
                    System.out.println("홀수다");
                }break;
            default:
                System.out.println("양수만 입력해주세요");
        }
    }
    public void method8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 입력 : ");
        int a = sc.nextInt();
        System.out.print("영어 점수 입력 : ");
        int b= sc.nextInt();
        System.out.print("수학 점수 입력 : ");
        int c= sc.nextInt();

        System.out.println("국어 :" + a + "영어 : " + b + "수학 :" + c);

        int sum = a+b+c;
        System.out.println("합계 :" + sum);
        int result = sum / 3;
        System.out.println("평균 :" + result);

        if (a >= 40 && b >= 40 && c >= 40 && result >= 60)  {
            System.out.println("축하합니다, 합격입니다.");
        } else System.out.println("불합격입니다.");
    }
    public void method9() {
        Scanner sc = new Scanner(System.in);
        String id = "park";
        String password = "1234";

        System.out.print("아이디 입력 : ");
        String ids = sc.nextLine();
        System.out.print("패스워드 입력 : ");
        String pas = sc.nextLine();

        if (id.equals(ids)) { // equals 사용해야함 // == 는 주소값 비교
            if (password.equals(pas)) {
                System.out.println("로그인 성공");
            }else if (!id.equals (ids) ) {
                System.out.println("아이디가 틀렸습니다.");
            }else System.out.println("비밀번호가 틀렸습니다.");
        }
    }
    public void method10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        String level = sc.nextLine();

        switch (level) {
            case "관리자" :
                System.out.print("회원관리,게시글 관리,");
            case "회원" :
                System.out.print("게시글 작성, 댓글 작성");
            case "비회원" :
                System.out.println("게시글 조회");
                break;
        }
    }
    public void method11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("피연산자 입력:");
        int a = sc.nextInt();
        System.out.print("피연산자 입력");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("연산자 입력 :");
        char c = sc.nextLine().charAt(0);

        switch (c) {
            case '+' :
                System.out.print(a + b );
                break;
            case '-' :
                System.out.println(a - b);
            case '/' :
                System.out.println(a / b);

        }
    }

}
