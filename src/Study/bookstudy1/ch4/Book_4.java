package study.bookstudy1.ch4;

public class Book_4 {
    private String title;
    private int price; // 필드

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter
    //private한 필드를 접근하기 위해 제공하는 메소드를 setter, getter 라고 한다.


    public int getPrice() {
        return this.price * 2;
    }

    public void setPrice(int price) { //지역변수
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


