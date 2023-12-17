package school.ch1.together.homework.ch15_inheritance_test.View;

import school.ch1.together.homework.ch15_inheritance_test.controller.CircleController;
import school.ch1.together.homework.ch15_inheritance_test.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {
    Scanner sc = new Scanner(System.in);

    CircleController cc = new CircleController();
    RectangleController rc = new RectangleController();

    // 메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
    public void mainMenu() {

        while(true) {
            System.out.println("==== 메뉴 ====");
            System.out.println(" 1. 원");
            System.out.println(" 2. 사각형");
            System.out.println("9 끝내기");
            System.out.println("메뉴 번호");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    circleMenu();break;
                case 2:
                    rectangleMenu();break;
                case 9:
                    System.out.println("종료되었습니다."); return;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }
    }

    // 원 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
    public void circleMenu() {
            System.out.println("====원 메뉴 ====");
            System.out.println(" 1. 원 둘레");
            System.out.println(" 2. 원 넓이");
            System.out.println("9 메인으로");
            System.out.println("메뉴 번호");
            int num = sc.nextInt();

            switch (num) {
                case 1: calcCircum();break;
                case 2: calcCircleArea();break;
                case 9: return;
                default: System.out.println("잘못 입력하였습니다.");
            }
    }
    //사각형 메뉴 출력, 잘못 입력했을 시 메인 메뉴로 돌아감
    public void rectangleMenu() {
            System.out.println("==== 메뉴 ====");
            System.out.println(" 1. 사각형 둘레");
            System.out.println(" 2. 사각형 넓이");
            System.out.println("9 메인으로");
            System.out.println("메뉴 번호");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    calcPerimeter();
                    break;
                case 2:
                    calcRectArea();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
    }
    // x,y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
    public void calcCircum() {
        System.out.print("x 좌표 :");
        int x = sc.nextInt();
        System.out.print("y 좌표 :");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        sc.nextLine();

        System.out.println(cc.calcCircum(x,y,radius));
    }
    // x,y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
    public void calcCircleArea() {
        System.out.print("x 좌표 :");
        int x = sc.nextInt();

        System.out.print("y 좌표 :");
        int y = sc.nextInt();

        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        sc.nextLine();

        System.out.println(cc.calcArea(x,y,radius));
    }
    // x,y 좌표와 높이 너비를 받아 사각형의 정보와 사각형 둘레 출력
    public void calcPerimeter() {
        System.out.print("x 좌표 :");
        int x = sc.nextInt();

        System.out.print("y 좌표 :");
        int y = sc.nextInt();

        System.out.print("높이 : ");
        int height = sc.nextInt();

        System.out.println("너비 : ");
        int width = sc.nextInt();

        System.out.println(rc.calcPerimeter(x,y,height,width));

    }
    // x,y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 넓이 출력
    public void calcRectArea() {

        System.out.print("x 좌표 :");
        int x = sc.nextInt();

        System.out.print("y 좌표 :");
        int y = sc.nextInt();

        System.out.print("높이 : ");
        int height = sc.nextInt();

        System.out.println("너비 : ");
        int width = sc.nextInt();

        System.out.println(rc.calcArea(x,y,height,width));
    }
}
