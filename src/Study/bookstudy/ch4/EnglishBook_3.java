package Study.bookstudy.ch4;

public class EnglishBook_3 extends Book_3 {

    public void showPrice() {   // 오버라이딩
        System.out.println("영어책 가격 : " + price);
    }
    public void showPrice(int count) { //오버로딩
        System.out.println("영어책 " + count + "권 가격 : " + price * count);
    }
}
