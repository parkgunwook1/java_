package school.ch1.together.homework.ch13_right;

import java.util.Scanner;

public class SnackMenu {

    Scanner sc = new Scanner(System.in);
    SnackController scr = new SnackController();

    public void menu() {
        System.out.println("스낵류를 입력하세요.");

        System.out.println("종류 : ");
        String kind = sc.nextLine();

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("맛 :" );
        String flavor = sc.nextLine();

        System.out.println("개수 : " );
        int numOf = sc.nextInt();

        System.out.println("가격 : ");
        int price = sc.nextInt();

        sc.nextLine();

        String result = scr.saveData(kind,name,flavor,numOf,price);
        System.out.println(result);

        System.out.println("저장한 정보를 확인하시겠습니까?(y/n) : ");
        char ch = sc.nextLine().charAt(0);
        if (ch == 'y') {
            String data = scr.confirmData();
            System.out.println(data);
        }
    }
}
