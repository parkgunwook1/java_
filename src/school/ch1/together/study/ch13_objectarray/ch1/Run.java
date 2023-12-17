package school.ch1.together.study.ch13_objectarray.ch1;

;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        // 1. 기본생성자를 호출하여 객체 생성후 setter 메소드를 통해 각 필드 접근
        Book bk1 = new Book();
        bk1.setTitle("DO it 자바");
        bk1.setAuthor("라이언");
        bk1.setPrice(25000);
        bk1.setPublisher("이지스 퍼블리싱");

        System.out.println(bk1.information());

        //2. 매개변수 생성자로 객체 생성과 동시에 필드에 값을 대입
        Book bk2 = new Book("자바프로그래밍 입문", "전예흥", 24000, "아리 버플리싱");

        // 세개의 Book 객체가 필요하다는 가정하에 각각의 book 객체를 별도로 관리
        // 단, 각 Book 객체는 사용자에게 입력받은 값들로 채워넣을 예쩡

        Scanner sc = new Scanner(System.in);
        Book bk4 = null;
        Book bk5 = null;
        Book bk6 = null;

        for (int i = 0; i < 3; i++) {
            System.out.println("제목 :");
            String title = sc.nextLine();

            System.out.println("저자 : ");
            String author = sc.nextLine();

            System.out.println("가격 : ");
            int price = sc.nextInt();

            sc.nextLine();

            System.out.println("출판사");
            String publisher = sc.nextLine();

            if (i == 0) {
                bk4 = new Book(title, author, price, publisher);
            } else if (i == 1) {
                bk5 = new Book(title, author, price, publisher);
            } else {
                bk6 = new Book(title, author, price, publisher);
            }
        }
    }
}

