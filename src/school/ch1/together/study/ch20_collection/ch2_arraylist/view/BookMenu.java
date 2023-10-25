package school.ch1.together.study.ch20_collection.ch2_arraylist.view;

import school.ch1.together.study.ch20_collection.ch2_arraylist.controller.BookController;
import school.ch1.together.study.ch20_collection.ch2_arraylist.model.vo.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();

    public void mainMenu() {
        while (true) {
            System.out.println("**** 메인 메뉴 ****");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램 종료 합니다.");
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
    // 1. 새 도서 추가용 view 메소드
    public void insertBook() {
        System.out.println(" 도서명 입력 :");
        String title = sc.nextLine();

        System.out.println("저자명 입력 : ");
        String author = sc.nextLine();

        System.out.println("장르(1.인문 / 2. 자연과학 / 3. 의료 / 4. 기타 입력받기");
        int category = Integer.parseInt(sc.nextLine());

        System.out.println("가격 : ");
        int price = Integer.parseInt(sc.nextLine());

        Book bk = new Book(title, author, category == 1 ? "인문" :
                category == 2 ? "자연과학" : category == 3? "의료" : "기타", price);
            bc.insertBook(bk);


        }
    public void selectList() {
        ArrayList<Book> bookList = bc.selectList();

        if (bookList.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
        } else {
            for (Book b : bookList) {
                System.out.println(b);
//            }
//            while (true) {
//                System.out.println(bookList);

            }
        }

    }
    public void searchBook() {
        System.out.println("검색할 도서 명 : ");
        String keyword = sc.nextLine();
        ArrayList<Book> searchList = bc.searchBook(keyword);

        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        }else {
           for (Book b : searchList ) {
               System.out.println(b);
            }
        }
    }
    public void deleteBook() {
        System.out.print("삭제할 도서명 검색 : ");
        String title = sc.nextLine();

        System.out.print("삭제할 저자명 입력 : ");
        String author = sc.nextLine();

        Book remove = bc.deleteBook(title,author);

        if (remove != null) {
            System.out.println("성공적으로 삭제되었습니다.");
        }else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }
    public void ascBook() {
        // 도서 명 오름차순 정렬용 view 메서드
        int a = bc.ascBook();

        if (a == 1) {
            System.out.println("정렬에 성공하였습니다.");
        }else {
            System.out.println("정렬에 실패하였습니다.");
        }
    }
}
