package study.bookstudy.ch3;

public class Person {
    String name; //인스턴스 필드(static이 붙어 있지 않음)
    String address;
    boolean isVip;
    static int count = 0; //클래스 필드 static

    public void printName(){ //인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }
    public static void printCount() { //클래스 메소드
        System.out.println("count : " + count);
    }

}
