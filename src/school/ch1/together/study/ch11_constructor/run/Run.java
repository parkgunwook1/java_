package school.ch1.together.study.ch11_constructor.run;

import school.ch1.together.study.ch11_constructor.User;
import school.ch1.together.study.ch11_constructor.vo.Book;

public class Run {
    public static void main(String[] args) {
//        User user = new User();
        User user = new User("pkw85428","1234","박건욱",35,'M');


        Book book = new Book("어린왕자","한빛","박건욱");
        Book book1 = new Book("홍","길","동",100,1.2);
        book.inform();
        book1.inform();

//        System.out.println(book.inform());
//        System.out.println(book1.inform());
//        User user2 = new User(5);
        System.out.println(user.information());
    }
}
