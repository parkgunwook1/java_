package school.ch1.together.study.ch20_collection.ch2_arraylist.controller;

import school.ch1.together.study.ch20_collection.ch2_arraylist.model.vo.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
    private List<Book> list = new ArrayList();

    public BookController() {
        list.add(new Book("자바의 정석", "남궁 성", "기타", 2000));
        list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 20000));
        list.add(new Book("대화의 기술", "남 성", "기타", 20100));
        list.add(new Book("암 정복기", "박선우", "기타", 22000));


    }
    public void insertBook(Book bk) {
        // 전달 받은 bk를 bookList에 추가
        list.add(bk);
    }
    public ArrayList selectList() {
        return (ArrayList)list;
    }
    public ArrayList searchBook(String keyword) {
        ArrayList<Book> searchList = new ArrayList<>(); // 검색 결과 담아줄 리스트
//        list = selectList(); // 도서 목록 가져오는 메소드 호출

        for (Book book : list) {
            if (book.getTitle().contains(keyword)) {
                // 책의 제목 또는 저자에 키워드가 포함되어 있는 경우
                // contains 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수다.
                searchList.add(book); // 검색 결과 리스트에 책 추가
            }
        }
        return searchList; // 검색 결과 리스트 반환
    }
    public Book deleteBook(String title, String author) {
        Book removeBook = null;

        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                removeBook = list.remove(i);
                break;
            }
//        }
//
//        for (Book book : list) {
//            if (book.equals(book.getTitle()) || book.equals(book.getAuthor())) {
//              removeBook = book;
//              list.remove(book);
//              break;
//            }
        }
        return removeBook;
    }
    public int ascBook() {
        try {
        Collections.sort(list, (book1,book2) -> book1.getTitle().compareToIgnoreCase(book2.getTitle()));
            return 1;
        } catch (Exception e) {
            System.out.println("정렬에 실패했습니다.");
            return 0;
        }
    }
}
